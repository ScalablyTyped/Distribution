package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherMod {
  
  @JSImport("rbx/base/helpers/other", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/other", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/other", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OtherHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/other", "transform")
  @js.native
  val transform: TransformFunction[OtherHelpersProps, js.Object] = js.native
  
  @js.native
  trait OtherHelpersProps extends StObject {
    
    var marginless: js.UndefOr[Boolean] = js.native
    
    var paddingless: js.UndefOr[Boolean] = js.native
    
    var radiusless: js.UndefOr[Boolean] = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var shadowless: js.UndefOr[Boolean] = js.native
    
    var unselectable: js.UndefOr[Boolean] = js.native
  }
  object OtherHelpersProps {
    
    @scala.inline
    def apply(): OtherHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OtherHelpersProps]
    }
    
    @scala.inline
    implicit class OtherHelpersPropsMutableBuilder[Self <: OtherHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      @scala.inline
      def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      @scala.inline
      def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
}
