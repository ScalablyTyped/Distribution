package typings.skatejs.mod

import typings.skatejs.typesMod.Constructor
import typings.skatejs.typesMod.WithRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withRenderer")
@js.native
object withRenderer extends js.Object {
  def apply[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] with T = js.native
  def apply[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] with T = js.native
}

