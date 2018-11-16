package typings
package redomLib.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "List")
@js.native
class List protected () extends RedomComponent {
  def this(parent: RedomQuery, View: RedomComponentConstructor) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: java.lang.String) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: java.lang.String, initData: js.Any) = this()
  /* CompleteClass */
  override var el: stdLib.HTMLElement = js.native
  @JSName("update")
  def update_MList(data: js.Array[_]): scala.Unit = js.native
  @JSName("update")
  def update_MList(data: js.Array[_], context: js.Any): scala.Unit = js.native
}

@JSImport("redom", "List")
@js.native
object List extends js.Object {
  def extend(parent: redomLib.redomMod.RedomQuery, View: redomLib.redomMod.RedomComponentConstructor): redomLib.redomMod.RedomComponentConstructor = js.native
  def extend(
    parent: redomLib.redomMod.RedomQuery,
    View: redomLib.redomMod.RedomComponentConstructor,
    key: java.lang.String
  ): redomLib.redomMod.RedomComponentConstructor = js.native
  def extend(
    parent: redomLib.redomMod.RedomQuery,
    View: redomLib.redomMod.RedomComponentConstructor,
    key: java.lang.String,
    initData: js.Any
  ): redomLib.redomMod.RedomComponentConstructor = js.native
}

