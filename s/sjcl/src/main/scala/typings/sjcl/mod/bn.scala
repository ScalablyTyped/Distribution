package typings.sjcl.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
