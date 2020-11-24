package typings.redom.mod

import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redom", "List")
@js.native
class List_ protected () extends RedomComponent {
  def this(parent: RedomQuery, View: RedomComponentCreator) = this()
  def this(parent: RedomQuery, View: RedomComponentCreator, key: String) = this()
  def this(parent: RedomQuery, View: RedomComponentCreator, key: js.UndefOr[scala.Nothing], initData: js.Any) = this()
  def this(parent: RedomQuery, View: RedomComponentCreator, key: String, initData: js.Any) = this()
  
  @JSName("el")
  var el_List_ : HTMLElement | SVGElement = js.native
  
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
  def extend(
    parent: RedomQuery,
    View: RedomComponentConstructor,
    key: js.UndefOr[scala.Nothing],
    initData: js.Any
  ): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
}
