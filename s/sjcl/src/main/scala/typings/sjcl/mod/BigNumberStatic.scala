package typings.sjcl.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sjcl.anon.P127
import typings.sjcl.mod.TypeHelpers.Bind1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigNumberStatic
  extends Instantiable0[BigNumber]
     with Instantiable1[(/* n */ BigNumber) | (/* n */ Double) | (/* n */ String), BigNumber] {
  var prime: P127 = js.native
  var random: Bind1[Double] = js.native
  def fromBits(bits: BitArray_): BigNumber = js.native
  def pseudoMersennePrime(exponent: Double, coeff: js.Array[js.Array[Double]]): PseudoMersennePrimeStatic = js.native
}

