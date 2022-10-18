package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersOtherMod {
  
  @JSImport("rbx/base/helpers/other", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/other", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OtherHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/other", "transform")
  @js.native
  val transform: TransformFunction[OtherHelpersProps, js.Object] = js.native
  
  trait OtherHelpersProps extends StObject {
    
    var marginless: js.UndefOr[Boolean] = js.undefined
    
    var paddingless: js.UndefOr[Boolean] = js.undefined
    
    var radiusless: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var shadowless: js.UndefOr[Boolean] = js.undefined
    
    var unselectable: js.UndefOr[Boolean] = js.undefined
  }
  object OtherHelpersProps {
    
    inline def apply(): OtherHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OtherHelpersProps]
    }
    
    extension [Self <: OtherHelpersProps](x: Self) {
      
      inline def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      inline def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      inline def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      inline def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      inline def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      inline def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      inline def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      inline def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
}
