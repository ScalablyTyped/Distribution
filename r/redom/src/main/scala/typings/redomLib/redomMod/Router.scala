package typings
package redomLib.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "Router")
@js.native
class Router protected () extends RedomComponent {
  def this(parent: RedomQuery, Views: RouterDictionary) = this()
  def this(parent: RedomQuery, Views: RouterDictionary, initData: js.Any) = this()
  /* CompleteClass */
  override var el: stdLib.HTMLElement = js.native
  @JSName("update")
  def update_MRouter(route: java.lang.String): scala.Unit = js.native
  @JSName("update")
  def update_MRouter(route: java.lang.String, data: js.Any): scala.Unit = js.native
}

