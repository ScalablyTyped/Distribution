package typings.sjcl.mod

import typings.sjcl.mod.TypeHelpers.BigNumberBinaryOperator
import typings.sjcl.mod.TypeHelpers.BigNumberTrinaryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait BigNumber extends StObject {
  
  /// this + that.  Does not normalize.
  var add: BigNumberBinaryOperator = js.native
  
  /// this += that.  Does not normalize.
  var addM: BigNumberBinaryOperator = js.native
  
  /// Return the length in bits, rounded up to the nearest byte.
  def bitLength(): Double = js.native
  
  /// Constant-time normalize. Does not allocate additional space.
  def cnormalize(): BigNumber = js.native
  
  def copy(): BigNumber = js.native
  
  /// this *= 2.  Requires normalized; ends up normalized.
  def doubleM(): BigNumber = js.native
  
  def equals(that: Double): Boolean = js.native
  /// Returns true if "this" and "that" are equal.  Calls fullReduce().
  /// Equality test is in constant time.
  def equals(that: BigNumber): Boolean = js.native
  
  /// Reduce and normalize.
  def fullReduce(): BigNumber = js.native
  
  /// Get the i'th limb of this, zero if i is too large.
  def getLimb(index: Double): Double = js.native
  
  def greaterEquals(that: Double): Boolean = js.native
  /// Constant time comparison function.
  /// Returns 1 if this >= that, or zero otherwise.
  def greaterEquals(that: BigNumber): Boolean = js.native
  
  /// this /= 2, rounded down.  Requires normalized; ends up normalized.
  def halveM(): BigNumber = js.native
  
  /// Initializes this with it, either as a bn, a number, or a hex string.
  var initWith: BigNumberBinaryOperator = js.native
  
  /// return inverse mod prime p.  p must be odd. Binary extended Euclidean algorithm mod p.
  var inverseMod: BigNumberBinaryOperator = js.native
  
  var maxMul: Double = js.native
  
  var mod: BigNumberBinaryOperator = js.native
  
  /// this ^ x mod N with Montomery reduction
  var montpowermod: BigNumberTrinaryOperator = js.native
  
  /// this * that.  Normalizes and reduces.
  var mul: BigNumberBinaryOperator = js.native
  
  /// this * that mod N
  var mulmod: BigNumberTrinaryOperator = js.native
  
  /// Propagate carries.
  def normalize(): BigNumber = js.native
  
  def power(n: js.Array[Double]): BigNumber = js.native
  def power(n: Double): BigNumber = js.native
  /// this ^ n.  Uses square-and-multiply.  Normalizes and reduces.
  def power(n: BigNumber): BigNumber = js.native
  
  /// this ^ x mod N
  var powermod: BigNumberTrinaryOperator = js.native
  
  var radix: Double = js.native
  
  /// Reduce mod a modulus.  Stubbed for subclassing.
  def reduce(): BigNumber = js.native
  
  /// this ^ 2.  Normalizes and reduces.
  def square(): BigNumber = js.native
  
  /// this - that.  Does not normalize.
  var sub: BigNumberBinaryOperator = js.native
  
  /// this -= that.  Does not normalize.
  var subM: BigNumberBinaryOperator = js.native
  
  /// Serialize to a bit array
  def toBits(): BitArray_ = js.native
  def toBits(len: Double): BitArray_ = js.native
  
  def trim(): BigNumber = js.native
}
