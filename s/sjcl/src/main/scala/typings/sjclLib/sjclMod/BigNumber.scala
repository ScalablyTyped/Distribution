package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait BigNumber extends js.Object {
  /// this + that.  Does not normalize.
  var add: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// this += that.  Does not normalize.
  var addM: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// Initializes this with it, either as a bn, a number, or a hex string.
  var initWith: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// return inverse mod prime p.  p must be odd. Binary extended Euclidean algorithm mod p.
  var inverseMod: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  var maxMul: scala.Double = js.native
  var mod: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// this * that.  Normalizes and reduces.
  var mul: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// this * that mod N
  var mulmod: sjclLib.sjclMod.TypeHelpersNs.BigNumberTrinaryOperator = js.native
  /// this ^ x mod N
  var powermod: sjclLib.sjclMod.TypeHelpersNs.BigNumberTrinaryOperator = js.native
  var radix: scala.Double = js.native
  /// this - that.  Does not normalize.
  var sub: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// this -= that.  Does not normalize.
  var subM: sjclLib.sjclMod.TypeHelpersNs.BigNumberBinaryOperator = js.native
  /// Return the length in bits, rounded up to the nearest byte.
  def bitLength(): scala.Double = js.native
  /// Constant-time normalize. Does not allocate additional space.
  def cnormalize(): BigNumber = js.native
  def copy(): BigNumber = js.native
  /// this *= 2.  Requires normalized; ends up normalized.
  def doubleM(): BigNumber = js.native
  /// Returns true if "this" and "that" are equal.  Calls fullReduce().
  /// Equality test is in constant time.
  def equals(that: scala.Double): scala.Boolean = js.native
  def equals(that: BigNumber): scala.Boolean = js.native
  /// Reduce and normalize.
  def fullReduce(): BigNumber = js.native
  /// Get the i'th limb of this, zero if i is too large.
  def getLimb(index: scala.Double): scala.Double = js.native
  /// Constant time comparison function.
  /// Returns 1 if this >= that, or zero otherwise.
  def greaterEquals(that: scala.Double): scala.Boolean = js.native
  def greaterEquals(that: BigNumber): scala.Boolean = js.native
  /// this /= 2, rounded down.  Requires normalized; ends up normalized.
  def halveM(): BigNumber = js.native
  /// Propagate carries.
  def normalize(): BigNumber = js.native
  def power(a: js.Array[scala.Double]): BigNumber = js.native
  /// this ^ n.  Uses square-and-multiply.  Normalizes and reduces.
  def power(n: scala.Double): BigNumber = js.native
  def power(n: BigNumber): BigNumber = js.native
  /// Reduce mod a modulus.  Stubbed for subclassing.
  def reduce(): BigNumber = js.native
  /// this ^ 2.  Normalizes and reduces.
  def square(): BigNumber = js.native
  /// Serialize to a bit array
  def toBits(): BitArray = js.native
  def toBits(len: scala.Double): BitArray = js.native
  def trim(): BigNumber = js.native
}

