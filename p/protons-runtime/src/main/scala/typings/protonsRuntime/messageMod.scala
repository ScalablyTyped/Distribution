package typings.protonsRuntime

import org.scalablytyped.runtime.Instantiable1
import typings.protonsRuntime.codecMod.Codec
import typings.protonsRuntime.codecMod.EncodeOptions
import typings.protonsRuntime.mod.Reader
import typings.protonsRuntime.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("protons-runtime/dist/src/codecs/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def message[T](
    encode: js.Function3[/* obj */ T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions], Unit],
    decode: js.Function2[/* reader */ Reader, /* length */ js.UndefOr[Double], T]
  ): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(encode.asInstanceOf[js.Any], decode.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  @js.native
  trait Factory[A, T]
    extends StObject
       with Instantiable1[/* obj */ A, T]
}
