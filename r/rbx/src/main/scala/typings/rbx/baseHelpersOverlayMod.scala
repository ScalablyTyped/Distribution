package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersOverlayMod {
  
  @JSImport("rbx/base/helpers/overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/overlay", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OverlayHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/overlay", "transform")
  @js.native
  val transform: TransformFunction[OverlayHelpersProps, js.Object] = js.native
  
  trait OverlayHelpersProps extends StObject {
    
    var overlay: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayHelpersProps {
    
    inline def apply(): OverlayHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayHelpersProps]
    }
    
    extension [Self <: OverlayHelpersProps](x: Self) {
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
