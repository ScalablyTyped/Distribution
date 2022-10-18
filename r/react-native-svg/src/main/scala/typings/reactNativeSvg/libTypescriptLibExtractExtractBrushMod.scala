package typings.reactNativeSvg

import typings.reactNative.mod.ColorValue
import typings.reactNativeSvg.anon.BrushRef
import typings.reactNativeSvg.anon.Payload
import typings.reactNativeSvg.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptLibExtractExtractBrushMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/extract/extractBrush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Type | BrushRef | Payload | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Type | BrushRef | Payload | Null]
  inline def default(color: ColorValue): Type | BrushRef | Payload | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[Type | BrushRef | Payload | Null]
}
