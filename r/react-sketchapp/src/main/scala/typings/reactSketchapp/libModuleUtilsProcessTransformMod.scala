package typings.reactSketchapp

import typings.reactSketchapp.anon.IsFlippedHorizontal
import typings.reactSketchapp.libModuleTypesMod.LayoutInfo
import typings.reactSketchapp.libModuleTypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleUtilsProcessTransformMod {
  
  @JSImport("react-sketchapp/lib/module/utils/processTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processTransform(layout: LayoutInfo, props: ViewStyle): IsFlippedHorizontal = (^.asInstanceOf[js.Dynamic].applyDynamic("processTransform")(layout.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[IsFlippedHorizontal]
}
