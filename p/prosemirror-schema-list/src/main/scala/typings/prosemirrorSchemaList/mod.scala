package typings.prosemirrorSchemaList

import typings.orderedmap.mod.default
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorState.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-schema-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Convenience function for adding list-related node types to a map
  specifying the nodes for a schema. Adds
  [`orderedList`](https://prosemirror.net/docs/ref/#schema-list.orderedList) as `"ordered_list"`,
  [`bulletList`](https://prosemirror.net/docs/ref/#schema-list.bulletList) as `"bullet_list"`, and
  [`listItem`](https://prosemirror.net/docs/ref/#schema-list.listItem) as `"list_item"`.
  `itemContent` determines the content expression for the list items.
  If you want the commands defined in this module to apply to your
  list structure, it should have a shape like `"paragraph block*"` or
  `"paragraph (ordered_list | bullet_list)*"`. `listGroup` can be
  given to assign a group name to the list node types, for example
  `"block"`.
  */
  inline def addListNodes(nodes: default[NodeSpec], itemContent: String): default[NodeSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any])).asInstanceOf[default[NodeSpec]]
  inline def addListNodes(nodes: default[NodeSpec], itemContent: String, listGroup: String): default[NodeSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any], listGroup.asInstanceOf[js.Any])).asInstanceOf[default[NodeSpec]]
  
  /**
  A bullet list node spec, represented in the DOM as `<ul>`.
  */
  @JSImport("prosemirror-schema-list", "bulletList")
  @js.native
  val bulletList: NodeSpec = js.native
  
  /**
  Create a command to lift the list item around the selection up into
  a wrapping list.
  */
  inline def liftListItem(itemType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("liftListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[Command]
  
  /**
  A list item (`<li>`) spec.
  */
  @JSImport("prosemirror-schema-list", "listItem")
  @js.native
  val listItem: NodeSpec = js.native
  
  /**
  An ordered list [node spec](https://prosemirror.net/docs/ref/#model.NodeSpec). Has a single
  attribute, `order`, which determines the number at which the list
  starts counting, and defaults to 1. Represented as an `<ol>`
  element.
  */
  @JSImport("prosemirror-schema-list", "orderedList")
  @js.native
  val orderedList: NodeSpec = js.native
  
  /**
  Create a command to sink the list item around the selection down
  into an inner list.
  */
  inline def sinkListItem(itemType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("sinkListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[Command]
  
  /**
  Build a command that splits a non-empty textblock at the top level
  of a list item by also splitting that list item.
  */
  inline def splitListItem(itemType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("splitListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def splitListItem(itemType: NodeType, itemAttrs: Attrs): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("splitListItem")(itemType.asInstanceOf[js.Any], itemAttrs.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
  Returns a command function that wraps the selection in a list with
  the given type an attributes. If `dispatch` is null, only return a
  value to indicate whether this is possible, but don't actually
  perform the change.
  */
  inline def wrapInList(listType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def wrapInList(listType: NodeType, attrs: Attrs): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Command]
}
