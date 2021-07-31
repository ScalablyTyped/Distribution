package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
@js.native
trait Crypto extends StObject {
  
  def getRandomValues(array: Null): Null = js.native
  def getRandomValues(array: DataView): DataView = js.native
  def getRandomValues(array: Float32Array): Float32Array = js.native
  def getRandomValues(array: Float64Array): Float64Array = js.native
  def getRandomValues(array: Int16Array): Int16Array = js.native
  def getRandomValues(array: Int32Array): Int32Array = js.native
  def getRandomValues(array: Int8Array): Int8Array = js.native
  def getRandomValues(array: Uint16Array): Uint16Array = js.native
  def getRandomValues(array: Uint32Array): Uint32Array = js.native
  def getRandomValues(array: Uint8Array): Uint8Array = js.native
  def getRandomValues(array: Uint8ClampedArray): Uint8ClampedArray = js.native
  
  val subtle: SubtleCrypto = js.native
}
