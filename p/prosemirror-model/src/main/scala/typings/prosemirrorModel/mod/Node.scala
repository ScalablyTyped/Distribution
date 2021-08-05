package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Node[S /* <: Schema[js.Any, js.Any] */] ()
  extends StObject
     with ProsemirrorNode[S]
object Node {
  
  @JSImport("prosemirror-model", "Node")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize a node from its JSON representation.
    */
  /* static member */
  inline def fromJSON[S /* <: Schema[js.Any, js.Any] */](schema: S, json: StringDictionary[js.Any]): ProsemirrorNode[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[ProsemirrorNode[S]]
}
