package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INode extends IBase {
  
  /** [Method] Insert node s as the last child node of this node
    * @param node Ext.data.NodeInterface/Ext.data.NodeInterface[] The node or Array of nodes to append.
    * @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed.
    */
  var appendChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], INodeInterface]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** [Property] (Object) */
  var childNodes: js.UndefOr[js.Any] = js.native
  
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
  ] = js.native
  
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Boolean]] = js.native
  
  /** [Method] Creates a copy clone of this Node
    * @param newId String A new id, defaults to this Node's id.
    * @param deep Boolean If passed as true, all child Nodes are recursively copied into the new Node. If omitted or false, the copy will have no child Nodes.
    * @returns Ext.data.NodeInterface A copy of this Node.
    */
  var copy: js.UndefOr[
    js.Function2[/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], INodeInterface]
  ] = js.native
  
  /** [Method] Destroys the node
    * @param silent Object
    */
  @JSName("destroy")
  var destroy_INode: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Finds the first child that has the attribute with the specified value
    * @param attribute String The attribute name.
    * @param value Object The value to search for.
    * @param deep Boolean true to search through nodes deeper than the immediate children.
    * @returns Ext.data.NodeInterface The found child or null if none was found.
    */
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      INodeInterface
    ]
  ] = js.native
  
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
      INodeInterface
    ]
  ] = js.native
  
  /** [Property] (Object) */
  var firstChild: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the child node at the specified index
    * @param index Number
    * @returns Ext.data.NodeInterface
    */
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], INodeInterface]] = js.native
  
  /** [Method] Returns depth of this node the root node has a depth of 0
    * @returns Number
    */
  var getDepth: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Gets the hierarchical path from the root of the current node
    * @param field String The field to construct the path from. Defaults to the model idProperty.
    * @param separator String A separator to use.
    * @returns String The node path
    */
  var getPath: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], String]
  ] = js.native
  
  /** [Method] Returns true if this node has one or more child nodes else false
    * @returns Boolean
    */
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the index of a child node
    * @param child Ext.data.NodeInterface
    * @returns Number The index of the node or -1 if it was not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* child */ js.UndefOr[INodeInterface], Double]] = js.native
  
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
    * @param node Ext.data.NodeInterface The node to insert.
    * @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended).
    * @returns Ext.data.NodeInterface The inserted node.
    */
  var insertBefore: js.UndefOr[
    js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* refNode */ js.UndefOr[INodeInterface], 
      INodeInterface
    ]
  ] = js.native
  
  /** [Method] Insert a node into this node
    * @param index Number The zero-based index to insert the node at.
    * @param node Ext.data.Model The node to insert.
    * @returns Ext.data.Model The record you just inserted.
    */
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel], IModel]
  ] = js.native
  
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Boolean]] = js.native
  
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
    * @returns Boolean
    */
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is expanded
    * @returns Boolean
    */
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is the first child of its parent
    * @returns Boolean
    */
  var isFirst: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is the last child of its parent
    * @returns Boolean
    */
  var isLast: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is a leaf
    * @returns Boolean
    */
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is loaded
    * @returns Boolean
    */
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is loading
    * @returns Boolean
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is the root node
    * @returns Boolean
    */
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this node is visible
    * @returns Boolean
    */
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Object) */
  var lastChild: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var nextSibling: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var parentNode: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var previousSibling: js.UndefOr[js.Any] = js.native
  
  /** [Method] Removes this node from its parent
    * @param destroy Boolean true to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], INodeInterface]] = js.native
  
  /** [Method] Removes all child nodes from this node
    * @param destroy Boolean true to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], INodeInterface]] = js.native
  
  /** [Method] Removes a child node from this node
    * @param node Ext.data.NodeInterface The node to remove.
    * @param destroy Boolean true to destroy the node upon removal.
    * @returns Ext.data.NodeInterface The removed node.
    */
  var removeChild: js.UndefOr[
    js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* destroy */ js.UndefOr[Boolean], 
      INodeInterface
    ]
  ] = js.native
  
  /** [Method] Replaces one child node in this node with another
    * @param newChild Ext.data.NodeInterface The replacement node.
    * @param oldChild Ext.data.NodeInterface The node to replace.
    * @returns Ext.data.NodeInterface The replaced node.
    */
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[INodeInterface], 
      /* oldChild */ js.UndefOr[INodeInterface], 
      INodeInterface
    ]
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Updates general data of this node like isFirst isLast depth
    * @param silent Object
    * @returns Boolean
    */
  var updateInfo: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Boolean]] = js.native
}
object INode {
  
  @scala.inline
  def apply(): INode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INode]
  }
  
  @scala.inline
  implicit class INodeMutableBuilder[Self <: INode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendChild(value: /* node */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    @scala.inline
    def setBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "bubble", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    @scala.inline
    def setCascadeBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "cascadeBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCascadeByUndefined: Self = StObject.set(x, "cascadeBy", js.undefined)
    
    @scala.inline
    def setChildNodes(value: js.Any): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
    
    @scala.inline
    def setCollapse(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "collapse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setCopy(value: (/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEachChild(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = StObject.set(x, "eachChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEachChildUndefined: Self = StObject.set(x, "eachChild", js.undefined)
    
    @scala.inline
    def setExpand(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "expand", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindChildBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChildBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindChildByUndefined: Self = StObject.set(x, "findChildBy", js.undefined)
    
    @scala.inline
    def setFindChildUndefined: Self = StObject.set(x, "findChild", js.undefined)
    
    @scala.inline
    def setFirstChild(value: js.Any): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    @scala.inline
    def setGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = StObject.set(x, "getChildAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildAtUndefined: Self = StObject.set(x, "getChildAt", js.undefined)
    
    @scala.inline
    def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDepthUndefined: Self = StObject.set(x, "getDepth", js.undefined)
    
    @scala.inline
    def setGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* child */ js.UndefOr[INodeInterface] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    @scala.inline
    def setInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel]) => IModel): Self = StObject.set(x, "insertChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertChildUndefined: Self = StObject.set(x, "insertChild", js.undefined)
    
    @scala.inline
    def setIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "isAncestor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAncestorUndefined: Self = StObject.set(x, "isAncestor", js.undefined)
    
    @scala.inline
    def setIsExpandable(value: () => Boolean): Self = StObject.set(x, "isExpandable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setIsFirst(value: () => Boolean): Self = StObject.set(x, "isFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFirstUndefined: Self = StObject.set(x, "isFirst", js.undefined)
    
    @scala.inline
    def setIsLast(value: () => Boolean): Self = StObject.set(x, "isLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: () => Boolean): Self = StObject.set(x, "isLeaf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    @scala.inline
    def setIsLoaded(value: () => Boolean): Self = StObject.set(x, "isLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
    
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setIsRoot(value: () => Boolean): Self = StObject.set(x, "isRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setLastChild(value: js.Any): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    @scala.inline
    def setNextSibling(value: js.Any): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    @scala.inline
    def setParentNode(value: js.Any): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setPreviousSibling(value: js.Any): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    @scala.inline
    def setRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "removeChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
    
    @scala.inline
    def setSort(
      value: (/* sortFn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setUpdateInfo(value: /* silent */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "updateInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
  }
}
