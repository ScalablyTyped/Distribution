package typings.std

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigInt extends js.Object {
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.BigInt = js.native
  def toString(radix: Double): java.lang.String = js.native
}

@JSGlobal("BigInt")
@js.native
object BigInt extends TopLevel[BigIntConstructor]

