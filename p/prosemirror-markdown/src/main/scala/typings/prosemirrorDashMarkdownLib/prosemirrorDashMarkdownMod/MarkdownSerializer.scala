package typings
package prosemirrorDashMarkdownLib.prosemirrorDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-markdown", "MarkdownSerializer")
@js.native
class MarkdownSerializer[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  def this(nodes: org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* state */ MarkdownSerializerState[S], 
        /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
        /* parent */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
        /* index */ scala.Double, 
        scala.Unit
      ]
    ], marks: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
    * The mark serializer info.
    */
  var marks: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * The node serializer
    * functions for this serializer.
    */
  var nodes: org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* p1 */ MarkdownSerializerState[S], 
      /* p2 */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Serialize the content of the given node to
    * [CommonMark](http://commonmark.org/).
    */
  def serialize(content: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): java.lang.String = js.native
  def serialize(
    content: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): java.lang.String = js.native
}

