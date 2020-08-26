package typings.riotjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var riot: String = js.native
  def observable(el: js.Any): js.Any = js.native
  def render(): String = js.native
  def render(template: js.UndefOr[scala.Nothing], data: js.Any): String = js.native
  def render(template: String): String = js.native
  def render(template: String, data: js.Any): String = js.native
  def route(to: js.Any): Unit = js.native
}

