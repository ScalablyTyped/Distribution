package typings.prosemirrorDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashMarkdownMod {
  import typings.prosemirrorDashModel.prosemirrorDashModelMod.Fragment
  import typings.prosemirrorDashModel.prosemirrorDashModelMod.Mark
  import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema

  type MarkSerializerMethod[S /* <: Schema[_, _] */] = js.Function4[
    /* state */ MarkdownSerializerState[S], 
    /* mark */ Mark[S], 
    /* parent */ Fragment[S], 
    /* index */ Double, 
    Unit
  ]
}
