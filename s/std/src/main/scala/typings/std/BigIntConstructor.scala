package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntConstructor extends StObject {
  
  def apply(value: java.lang.String): js.BigInt = js.native
  /* standard es2020.bigint */
  def apply(value: js.BigInt): js.BigInt = js.native
  def apply(value: scala.Boolean): js.BigInt = js.native
  def apply(value: Double): js.BigInt = js.native
  
  /**
    * Interprets the low bits of a BigInt as a 2's-complement signed integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  /* standard es2020.bigint */
  def asIntN(bits: Double, int: js.BigInt): js.BigInt = js.native
  
  /**
    * Interprets the low bits of a BigInt as an unsigned integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  /* standard es2020.bigint */
  def asUintN(bits: Double, int: js.BigInt): js.BigInt = js.native
}
