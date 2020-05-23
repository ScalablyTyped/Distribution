package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.NumberConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Number")
@js.native
class Number ()
  extends typings.std.Number {
  def this(value: js.Any) = this()
}

/** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
@JSGlobal("Number")
@js.native
object Number extends TopLevel[NumberConstructor]

