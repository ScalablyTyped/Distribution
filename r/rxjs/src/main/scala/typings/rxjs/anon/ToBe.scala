package typings.rxjs.anon

import typings.rxjs.testSchedulerMod.observableToBeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToBe extends js.Object {
  @JSName("toBe")
  var toBe_Original: observableToBeFn = js.native
  def toBe(marbles: String): Unit = js.native
  def toBe(marbles: String, values: js.UndefOr[scala.Nothing], errorValue: js.Any): Unit = js.native
  def toBe(marbles: String, values: js.Any): Unit = js.native
  def toBe(marbles: String, values: js.Any, errorValue: js.Any): Unit = js.native
}

