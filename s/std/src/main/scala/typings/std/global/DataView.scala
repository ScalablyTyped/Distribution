package typings.std.global

import typings.std.ArrayBufferLike
import typings.std.DataViewConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DataView")
@js.native
open class DataView protected ()
  extends StObject
     with typings.std.DataView {
  /* standard es5 */
  def this(buffer: ArrayBufferLike) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, byteLength: Double) = this()
}
object DataView {
  
  inline def apply: DataViewConstructor = js.Dynamic.global.selectDynamic("DataView").asInstanceOf[DataViewConstructor]
}
