package typings.redom.redomMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "Place")
@js.native
class Place protected () extends RedomComponent {
  def this(View: RedomComponentConstructor) = this()
  def this(View: RedomComponentConstructor, initData: js.Any) = this()
  /* CompleteClass */
  override var el: HTMLElement = js.native
  @JSName("update")
  def update_MPlace(visible: Boolean): Unit = js.native
  @JSName("update")
  def update_MPlace(visible: Boolean, data: js.Any): Unit = js.native
}

