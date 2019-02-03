package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a node in the tree that makes up a
  * ProseMirror document. So a document is an instance of `Node`, with
  * children that are also instances of `Node`.
  *
  * Nodes are persistent data structures. Instead of changing them, you
  * create new ones with the content you want. Old ones keep pointing
  * at the old document shape. This is made cheaper by sharing
  * structure between the old and new data as much as possible, which a
  * tree shape like this (without back pointers) makes easy.
  *
  * **Do not** directly mutate the properties of a `Node` object. See
  * [the guide](/docs/guide/#doc) for more information.
  */
@JSImport("prosemirror-model", "Node")
@js.native
class Node[S /* <: Schema[_, _] */] () extends ProsemirrorNode[S]

/* static members */
@JSImport("prosemirror-model", "Node")
@js.native
object Node extends js.Object {
  /**
    * Deserialize a node from its JSON representation.
    */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S, json: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S] = js.native
}

