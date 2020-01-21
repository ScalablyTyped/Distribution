package typings.rxjs

import typings.rxjs.testSchedulerMod.observableToBeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToBe extends js.Object {
  @JSName("toBe")
  var toBe_Original: observableToBeFn = js.native
  def toBe(marbles: String): Unit = js.native
  def toBe(marbles: String, values: js.Any): Unit = js.native
  def toBe(marbles: String, values: js.Any, errorValue: js.Any): Unit = js.native
}

