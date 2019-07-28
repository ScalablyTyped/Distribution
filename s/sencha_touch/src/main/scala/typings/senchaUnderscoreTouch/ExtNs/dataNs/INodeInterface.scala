package typings.senchaUnderscoreTouch.ExtNs.dataNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeInterface extends IBase {
  /** [Method] Insert node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[] The node or Array of nodes to append.
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Cascades down the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var childNodes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Collapse this node
  		* @param recursive Function true to recursively collapse all the children.
  		* @param callback Function The function to execute once the collapse completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.undefined
  /** [Method] Creates a copy clone of this Node
  		* @param newId String A new id, defaults to this Node's id.
  		* @param deep Boolean If passed as true, all child Nodes are recursively copied into the new Node. If omitted or false, the copy will have no child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[/* newId */ js.UndefOr[java.lang.String], /* deep */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  @JSName("destroy")
  var destroy_INodeInterface: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Iterates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in the iteration.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Expand this node
  		* @param recursive Function true to recursively expand all the children.
  		* @param callback Function The function to execute once the expand completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Finds the first child that has the attribute with the specified value
  		* @param attribute String The attribute name.
  		* @param value Object The value to search for.
  		* @param deep Boolean true to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Finds the first child by a custom function
  		* @param fn Function A function which must return true if the passed Node is the required Node.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
  		* @param deep Boolean True to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var firstChild: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the hierarchical path from the root of the current node
  		* @param field String The field to construct the path from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @returns String The node path
  		*/
  var getPath: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes else false
  		* @returns Boolean
  		*/
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the index of a child node
  		* @param child Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* child */ js.UndefOr[this.type], Double]] = js.undefined
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
  		* @param node Ext.data.NodeInterface The node to insert.
  		* @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended).
  		* @returns Ext.data.NodeInterface The inserted node.
  		*/
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.undefined
  /** [Method] Insert a node into this node
  		* @param index Number The zero-based index to insert the node at.
  		* @param node Ext.data.Model The node to insert.
  		* @returns Ext.data.Model The record you just inserted.
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel], IModel]
  ] = js.undefined
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is expanded
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is the first child of its parent
  		* @returns Boolean
  		*/
  var isFirst: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is the last child of its parent
  		* @returns Boolean
  		*/
  var isLast: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is a leaf
  		* @returns Boolean
  		*/
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is loaded
  		* @returns Boolean
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is loading
  		* @returns Boolean
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Object) */
  var lastChild: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var nextSibling: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var parentNode: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var previousSibling: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes this node from its parent
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove.
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node.
  		*/
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Replaces one child node in this node with another
  		* @param newChild Ext.data.NodeInterface The replacement node.
  		* @param oldChild Ext.data.NodeInterface The node to replace.
  		* @returns Ext.data.NodeInterface The replaced node.
  		*/
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[this.type], 
      /* oldChild */ js.UndefOr[this.type], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param sortFn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean Whether or not to apply this sort recursively.
  		* @param suppressEvent Boolean Set to true to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sortFn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param silent Object
  		* @returns Boolean
  		*/
  var updateInfo: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Boolean]] = js.undefined
}

object INodeInterface {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* node */ js.UndefOr[js.Any] => INodeInterface = null,
    bubble: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cascadeBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit = null,
    childNodes: js.Any = null,
    collapse: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    config: js.Any = null,
    contains: /* node */ js.UndefOr[INodeInterface] => Boolean = null,
    copy: (/* newId */ js.UndefOr[java.lang.String], /* deep */ js.UndefOr[Boolean]) => INodeInterface = null,
    destroy: /* silent */ js.UndefOr[js.Any] => Unit = null,
    eachChild: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit = null,
    expand: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    extend: java.lang.String = null,
    findChild: (/* attribute */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface = null,
    findChildBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface = null,
    firstChild: js.Any = null,
    getChildAt: /* index */ js.UndefOr[Double] => INodeInterface = null,
    getDepth: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getPath: (/* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    hasChildNodes: () => Boolean = null,
    indexOf: /* child */ js.UndefOr[INodeInterface] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insertBefore: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface = null,
    insertChild: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel]) => IModel = null,
    isAncestor: /* node */ js.UndefOr[INodeInterface] => Boolean = null,
    isExpandable: () => Boolean = null,
    isExpanded: () => Boolean = null,
    isFirst: () => Boolean = null,
    isLast: () => Boolean = null,
    isLeaf: () => Boolean = null,
    isLoaded: () => Boolean = null,
    isLoading: () => Boolean = null,
    isRoot: () => Boolean = null,
    isVisible: () => Boolean = null,
    lastChild: js.Any = null,
    mixins: js.Any = null,
    nextSibling: js.Any = null,
    parentNode: js.Any = null,
    platformConfig: js.Any = null,
    previousSibling: js.Any = null,
    remove: /* destroy */ js.UndefOr[Boolean] => INodeInterface = null,
    removeAll: /* destroy */ js.UndefOr[Boolean] => INodeInterface = null,
    removeChild: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface = null,
    replaceChild: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sortFn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    statics: js.Any = null,
    updateInfo: /* silent */ js.UndefOr[js.Any] => Boolean = null,
    uses: Array = null
  ): INodeInterface = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (bubble != null) __obj.updateDynamic("bubble")(js.Any.fromFunction3(bubble))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cascadeBy != null) __obj.updateDynamic("cascadeBy")(js.Any.fromFunction3(cascadeBy))
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction3(collapse))
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction2(copy))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (eachChild != null) __obj.updateDynamic("eachChild")(js.Any.fromFunction3(eachChild))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction3(expand))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (findChild != null) __obj.updateDynamic("findChild")(js.Any.fromFunction3(findChild))
    if (findChildBy != null) __obj.updateDynamic("findChildBy")(js.Any.fromFunction3(findChildBy))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild)
    if (getChildAt != null) __obj.updateDynamic("getChildAt")(js.Any.fromFunction1(getChildAt))
    if (getDepth != null) __obj.updateDynamic("getDepth")(js.Any.fromFunction0(getDepth))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getPath != null) __obj.updateDynamic("getPath")(js.Any.fromFunction2(getPath))
    if (hasChildNodes != null) __obj.updateDynamic("hasChildNodes")(js.Any.fromFunction0(hasChildNodes))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2(insertBefore))
    if (insertChild != null) __obj.updateDynamic("insertChild")(js.Any.fromFunction2(insertChild))
    if (isAncestor != null) __obj.updateDynamic("isAncestor")(js.Any.fromFunction1(isAncestor))
    if (isExpandable != null) __obj.updateDynamic("isExpandable")(js.Any.fromFunction0(isExpandable))
    if (isExpanded != null) __obj.updateDynamic("isExpanded")(js.Any.fromFunction0(isExpanded))
    if (isFirst != null) __obj.updateDynamic("isFirst")(js.Any.fromFunction0(isFirst))
    if (isLast != null) __obj.updateDynamic("isLast")(js.Any.fromFunction0(isLast))
    if (isLeaf != null) __obj.updateDynamic("isLeaf")(js.Any.fromFunction0(isLeaf))
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(js.Any.fromFunction0(isLoaded))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (isRoot != null) __obj.updateDynamic("isRoot")(js.Any.fromFunction0(isRoot))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling)
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction2(removeChild))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2(replaceChild))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3(sort))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (updateInfo != null) __obj.updateDynamic("updateInfo")(js.Any.fromFunction1(updateInfo))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[INodeInterface]
  }
}

