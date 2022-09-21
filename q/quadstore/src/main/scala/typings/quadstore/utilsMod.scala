package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sliceString(source: String, offset: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceString")(source.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def viewUint16ArrayAsUint8Array(source: js.typedarray.Uint16Array, offset: Double, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("viewUint16ArrayAsUint8Array")(source.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def viewUint8ArrayAsUint16Array(source: js.typedarray.Uint8Array): js.typedarray.Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("viewUint8ArrayAsUint16Array")(source.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
}
