package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedArrayBuffer
  extends StObject
     with ArrayBufferLike {
  
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  val byteLength: Double = js.native
  
  /**
    * Returns a section of an SharedArrayBuffer.
    */
  def slice(begin: Double): SharedArrayBuffer = js.native
  def slice(begin: Double, end: Double): SharedArrayBuffer = js.native
  
  @JSName(js.Symbol.species)
  val species: SharedArrayBuffer = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.SharedArrayBuffer = js.native
}
