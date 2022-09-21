package typings.protonsRuntime

import typings.protonsRuntime.codecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  @JSImport("protons-runtime/dist/src/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeMessage[T](buf: js.typedarray.Uint8Array, codec: Codec[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMessage")(buf.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def decodeMessage[T](buf: Uint8ArrayList, codec: Codec[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMessage")(buf.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[T]
}
