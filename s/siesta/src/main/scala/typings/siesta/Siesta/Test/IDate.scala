package typings.siesta.Siesta.Test

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IDate extends js.Object {
  def isDateEqual(got: Date, expectedDate: Date): Unit = js.native
  def isDateEqual(got: Date, expectedDate: Date, description: String): Unit = js.native
}

