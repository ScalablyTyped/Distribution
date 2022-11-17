package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedArrayBuffer extends StObject {
  
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  /* standard es2017.sharedmemory */
  val byteLength: Double = js.native
  
  /**
    * Returns a section of an SharedArrayBuffer.
    */
  /* standard es2017.sharedmemory */
  def slice(begin: Double): SharedArrayBuffer = js.native
  def slice(begin: Double, end: Double): SharedArrayBuffer = js.native
  
  /* standard es2017.sharedmemory */
  @JSName(js.Symbol.species)
  val species: SharedArrayBuffer = js.native
  
  /* standard es2017.sharedmemory */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: "SharedArrayBuffer" = js.native
}
