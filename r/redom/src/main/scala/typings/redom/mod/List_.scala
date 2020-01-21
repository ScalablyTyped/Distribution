package typings.redom.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "List")
@js.native
class List_ protected () extends RedomComponent {
  def this(parent: RedomQuery, View: RedomComponentConstructor) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: String) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any) = this()
  /* CompleteClass */
  override var el: HTMLElement = js.native
  @JSName("update")
  def update_MList_(data: js.Array[_]): Unit = js.native
  @JSName("update")
  def update_MList_(data: js.Array[_], context: js.Any): Unit = js.native
}

/* static members */
@JSImport("redom", "List")
@js.native
object List_ extends js.Object {
  def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
}

