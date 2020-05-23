package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("String")
@js.native
class String ()
  extends typings.std.String {
  def this(value: js.Any) = this()
}

/**
  * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
  */
@JSGlobal("String")
@js.native
object String extends TopLevel[StringConstructor]

