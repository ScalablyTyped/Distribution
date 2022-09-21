package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a raw buffer of binary data, which is used to store data for the
  * different typed arrays. ArrayBuffers cannot be read from or written to directly,
  * but can be passed to a typed array or DataView Object to interpret the raw
  * buffer as needed.
  */
@js.native
trait ArrayBuffer extends StObject {
  
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  /* standard es5 */
  val byteLength: Double = js.native
  
  /**
    * Returns a section of an ArrayBuffer.
    */
  /* standard es5 */
  def slice(begin: Double): js.typedarray.ArrayBuffer = js.native
  def slice(begin: Double, end: Double): js.typedarray.ArrayBuffer = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
