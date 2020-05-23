package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.RegExpConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RegExp")
@js.native
class RegExp protected ()
  extends typings.std.RegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: typings.std.RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: typings.std.RegExp, flags: java.lang.String) = this()
}

@JSGlobal("RegExp")
@js.native
object RegExp extends TopLevel[RegExpConstructor]

