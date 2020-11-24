package typings.raty

import typings.raty.ratyStrings.cancel
import typings.raty.ratyStrings.click
import typings.raty.ratyStrings.destroy
import typings.raty.ratyStrings.move
import typings.raty.ratyStrings.readonly
import typings.raty.ratyStrings.reload
import typings.raty.ratyStrings.score
import typings.raty.ratyStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def raty(): JQuery = js.native
  def raty(method: String, parameter: js.Any): js.Any = js.native
  def raty(options: JQueryRatyOptions): JQuery = js.native
  @JSName("raty")
  def raty_cancel(method: cancel, on: Boolean): Unit = js.native
  @JSName("raty")
  def raty_click(method: click, star: Double): Unit = js.native
  @JSName("raty")
  def raty_destroy(method: destroy): JQuery = js.native
  @JSName("raty")
  def raty_move(method: move, number: Double): Unit = js.native
  @JSName("raty")
  def raty_readonly(method: readonly, on: Boolean): Unit = js.native
  @JSName("raty")
  def raty_reload(method: reload): Unit = js.native
  @JSName("raty")
  def raty_score(method: score): Double = js.native
  @JSName("raty")
  def raty_score(method: score, score: Double): Unit = js.native
  @JSName("raty")
  def raty_set(method: set, options: JQueryRatyOptions): Unit = js.native
}
