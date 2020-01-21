package typings.skatejs.mod

import typings.skatejs.typesMod.Constructor
import typings.skatejs.typesMod.WithLifecycle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withLifecycle")
@js.native
object withLifecycle extends js.Object {
  def apply[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  def apply[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
}

