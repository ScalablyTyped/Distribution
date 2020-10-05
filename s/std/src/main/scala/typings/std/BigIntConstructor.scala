package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntConstructor extends js.Object {
  def apply(): js.BigInt = js.native
  def apply(value: js.Any): js.BigInt = js.native
  /**
    * Interprets the low bits of a BigInt as a 2's-complement signed integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  def asIntN(bits: Double, int: js.BigInt): js.BigInt = js.native
  /**
    * Interprets the low bits of a BigInt as an unsigned integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  def asUintN(bits: Double, int: js.BigInt): js.BigInt = js.native
}

