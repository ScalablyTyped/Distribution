package typings.protonsRuntime

import typings.protonsRuntime.codecMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("protons-runtime/dist/src/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeMessage[T](message: T, codec: Codec[T]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeMessage")(message.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
