package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitArrayStatic extends js.Object {
  /// Shift an array right.
  def _shiftRight(a: BitArray, shift: Double): BitArray = js.native
  def _shiftRight(a: BitArray, shift: Double, carry: Double): BitArray = js.native
  def _shiftRight(a: BitArray, shift: Double, carry: Double, out: BitArray): BitArray = js.native
  /// xor a block of 4 words together.
  def _xor4(x: js.Array[Double], y: js.Array[Double]): js.Array[Double] = js.native
  /// Find the length of an array of bits.
  def bitLength(a: BitArray): Double = js.native
  /// Array slices in units of bits.
  def bitSlice(a: BitArray, bstart: Double, bend: Double): BitArray = js.native
  /// Truncate an array.
  def clamp(a: BitArray, len: Double): BitArray = js.native
  /// Concatenate two bit arrays.
  def concat(a1: BitArray, a2: BitArray): BitArray = js.native
  /// Compare two arrays for equality in a predictable amount of time.
  def equal(a: BitArray, b: BitArray): Boolean = js.native
  /// Extract a number packed into a bit array.
  def extract(a: BitArray, bstart: Double, blenth: Double): Double = js.native
  /// Get the number of bits used by a partial word.
  def getPartial(x: Double): Double = js.native
  /// Make a partial word for a bit array.
  def partial(len: Double, x: Double): Double = js.native
  def partial(len: Double, x: Double, _end: Double): Double = js.native
}

