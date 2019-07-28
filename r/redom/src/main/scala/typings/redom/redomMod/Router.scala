package typings.redom.redomMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "Router")
@js.native
class Router protected () extends RedomComponent {
  def this(parent: RedomQuery, Views: RouterDictionary) = this()
  def this(parent: RedomQuery, Views: RouterDictionary, initData: js.Any) = this()
  /* CompleteClass */
  override var el: HTMLElement = js.native
  @JSName("update")
  def update_MRouter(route: String): Unit = js.native
  @JSName("update")
  def update_MRouter(route: String, data: js.Any): Unit = js.native
}

