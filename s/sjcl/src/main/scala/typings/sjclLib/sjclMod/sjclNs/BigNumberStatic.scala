package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigNumberStatic
  extends org.scalablytyped.runtime.Instantiable0[BigNumber]
     with org.scalablytyped.runtime.Instantiable1[
      (/* n */ BigNumber) | (/* n */ scala.Double) | (/* n */ java.lang.String), 
      BigNumber
    ] {
  var prime: sjclLib.Anon_P127 = js.native
  var random: sjclLib.sjclMod.sjclNs.TypeHelpersNs.Bind1[scala.Double] = js.native
  def fromBits(bits: BitArray): BigNumber = js.native
  def pseudoMersennePrime(exponent: scala.Double, coeff: js.Array[js.Array[scala.Double]]): PseudoMersennePrimeStatic = js.native
}

