package typings.sjcl.sjclMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "bn")
@js.native
class bn () extends BigNumber {
  def this(n: String) = this()
  def this(n: Double) = this()
  def this(n: BigNumber) = this()
}

@JSImport("sjcl", "bn")
@js.native
object bn extends TopLevel[BigNumberStatic]

