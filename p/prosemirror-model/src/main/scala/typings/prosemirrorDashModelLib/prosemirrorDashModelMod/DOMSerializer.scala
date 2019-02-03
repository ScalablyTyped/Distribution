package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "DOMSerializer")
@js.native
class DOMSerializer[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a serializer. `nodes` should map node names to functions
    * that take a node and return a description of the corresponding
    * DOM. `marks` does the same for mark names, but also gets an
    * argument that tells it whether the mark's content is block or
    * inline content (for typical use, it'll always be inline). A mark
    * serializer may be `null` to indicate that marks of that type
    * should not be serialized.
    */
  def this(nodes: org.scalablytyped.runtime.StringDictionary[js.Function1[/* node */ ProsemirrorNode[S], DOMOutputSpec]], marks: org.scalablytyped.runtime.StringDictionary[js.Function2[/* mark */ Mark[S], /* inline */ scala.Boolean, DOMOutputSpec]]) = this()
  /**
    * The mark serialization functions.
    */
  var marks: org.scalablytyped.runtime.StringDictionary[js.Function2[/* mark */ Mark[S], /* inline */ scala.Boolean, DOMOutputSpec]] = js.native
  /**
    * The node serialization functions.
    */
  var nodes: org.scalablytyped.runtime.StringDictionary[js.Function1[/* node */ ProsemirrorNode[S], DOMOutputSpec]] = js.native
  /**
    * Serialize the content of this fragment to a DOM fragment. When
    * not in the browser, the `document` option, containing a DOM
    * document, should be passed so that the serializer can create
    * nodes.
    */
  def serializeFragment(fragment: Fragment[S]): stdLib.DocumentFragment = js.native
  def serializeFragment(fragment: Fragment[S], options: org.scalablytyped.runtime.StringDictionary[js.Any]): stdLib.DocumentFragment = js.native
  /**
    * Serialize this node to a DOM node. This can be useful when you
    * need to serialize a part of a document, as opposed to the whole
    * document. To serialize a whole document, use
    * [`serializeFragment`](#model.DOMSerializer.serializeFragment) on
    * its [content](#model.Node.content).
    */
  def serializeNode(node: ProsemirrorNode[S]): stdLib.Node = js.native
  def serializeNode(node: ProsemirrorNode[S], options: org.scalablytyped.runtime.StringDictionary[js.Any]): stdLib.Node = js.native
}

/* static members */
@JSImport("prosemirror-model", "DOMSerializer")
@js.native
object DOMSerializer extends js.Object {
  /**
    * Build a serializer using the [`toDOM`](#model.NodeSpec.toDOM)
    * properties in a schema's node and mark specs.
    */
  def fromSchema[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S): prosemirrorDashModelLib.prosemirrorDashModelMod.DOMSerializer[S] = js.native
  /**
    * Render an [output spec](#model.DOMOutputSpec) to a DOM node. If
    * the spec has a hole (zero) in it, `contentDOM` will point at the
    * node with the hole.
    */
  def renderSpec(doc: stdLib.Document, structure: prosemirrorDashModelLib.prosemirrorDashModelMod.DOMOutputSpec): prosemirrorDashModelLib.Anon_ContentDOM = js.native
}

