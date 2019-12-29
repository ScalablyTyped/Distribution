package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@JSImport("sjcl", "TypeHelpers")
@js.native
object TypeHelpers extends js.Object {
  @js.native
  trait BigNumberBinaryOperator extends One[BigNumber | Double | String]
  
  @js.native
  trait BigNumberTrinaryOperator extends Two[BigNumber | Double | String, BigNumber | Double | String]
  
  @js.native
  trait Bind1[T] extends Two[BigNumber | Double | String, T]
  
  type One[T] = js.Function1[/* value */ T, BigNumber]
  type Two[T1, T2] = js.Function2[/* x */ T1, /* N */ T2, BigNumber]
}

