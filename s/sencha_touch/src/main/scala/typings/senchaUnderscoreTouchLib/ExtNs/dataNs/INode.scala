package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INode
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Insert node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[] The node or Array of nodes to append.
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
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
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], scala.Boolean]] = js.undefined
  /** [Method] Creates a copy clone of this Node
  		* @param newId String A new id, defaults to this Node's id.
  		* @param deep Boolean If passed as true, all child Nodes are recursively copied into the new Node. If omitted or false, the copy will have no child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[
      /* newId */ js.UndefOr[java.lang.String], 
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  @JSName("destroy")
  var destroy_INode: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Iterates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in the iteration.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
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
      scala.Unit
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
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
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
      /* deep */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var firstChild: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], INodeInterface]] = js.undefined
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
  var hasChildNodes: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the index of a child node
  		* @param child Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* child */ js.UndefOr[INodeInterface], scala.Double]] = js.undefined
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
  ] = js.undefined
  /** [Method] Insert a node into this node
  		* @param index Number The zero-based index to insert the node at.
  		* @param node Ext.data.Model The node to insert.
  		* @returns Ext.data.Model The record you just inserted.
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[scala.Double], /* node */ js.UndefOr[IModel], IModel]
  ] = js.undefined
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is expanded
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is the first child of its parent
  		* @returns Boolean
  		*/
  var isFirst: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is the last child of its parent
  		* @returns Boolean
  		*/
  var isLast: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is a leaf
  		* @returns Boolean
  		*/
  var isLeaf: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is loaded
  		* @returns Boolean
  		*/
  var isLoaded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is loading
  		* @returns Boolean
  		*/
  var isLoading: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[scala.Boolean], INodeInterface]] = js.undefined
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[scala.Boolean], INodeInterface]] = js.undefined
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove.
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node.
  		*/
  var removeChild: js.UndefOr[
    js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* destroy */ js.UndefOr[scala.Boolean], 
      INodeInterface
    ]
  ] = js.undefined
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
  ] = js.undefined
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param sortFn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean Whether or not to apply this sort recursively.
  		* @param suppressEvent Boolean Set to true to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sortFn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param silent Object
  		* @returns Boolean
  		*/
  var updateInfo: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
}

