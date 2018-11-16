package typings
package ratyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def raty(): JQuery = js.native
  def raty(method: java.lang.String, parameter: js.Any): js.Any = js.native
  def raty(options: JQueryRatyOptions): JQuery = js.native
  @JSName("raty")
  def raty_cancel(method: ratyLib.ratyLibStrings.cancel, on: scala.Boolean): scala.Unit = js.native
  @JSName("raty")
  def raty_click(method: ratyLib.ratyLibStrings.click, star: scala.Double): scala.Unit = js.native
  @JSName("raty")
  def raty_destroy(method: ratyLib.ratyLibStrings.destroy): JQuery = js.native
  @JSName("raty")
  def raty_move(method: ratyLib.ratyLibStrings.move, number: scala.Double): scala.Unit = js.native
  @JSName("raty")
  def raty_readonly(method: ratyLib.ratyLibStrings.readonly, on: scala.Boolean): scala.Unit = js.native
  @JSName("raty")
  def raty_reload(method: ratyLib.ratyLibStrings.reload): scala.Unit = js.native
  @JSName("raty")
  def raty_score(method: ratyLib.ratyLibStrings.score): scala.Double = js.native
  @JSName("raty")
  def raty_score(method: ratyLib.ratyLibStrings.score, score: scala.Double): scala.Unit = js.native
  @JSName("raty")
  def raty_set(method: ratyLib.ratyLibStrings.set, options: JQueryRatyOptions): scala.Unit = js.native
}

