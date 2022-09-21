package typings.protonsRuntime

import typings.protonsRuntime.codecMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod {
  
  @JSImport("protons-runtime/dist/src/codecs/enum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumeration[T](v: Any): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(v.asInstanceOf[js.Any]).asInstanceOf[Codec[T]]
}
