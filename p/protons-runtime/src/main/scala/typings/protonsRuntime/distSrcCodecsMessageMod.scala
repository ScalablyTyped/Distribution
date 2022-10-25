package typings.protonsRuntime

import org.scalablytyped.runtime.Instantiable1
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.protonsRuntime.distSrcCodecMod.EncodeOptions
import typings.protonsRuntime.mod.Reader_
import typings.protonsRuntime.mod.Writer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodecsMessageMod {
  
  @JSImport("protons-runtime/dist/src/codecs/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def message[T](
    encode: js.Function3[/* obj */ T, /* writer */ Writer_, /* opts */ js.UndefOr[EncodeOptions], Unit],
    decode: js.Function2[/* reader */ Reader_, /* length */ js.UndefOr[Double], T]
  ): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(encode.asInstanceOf[js.Any], decode.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  @js.native
  trait Factory[A, T]
    extends StObject
       with Instantiable1[/* obj */ A, T]
}
