package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("rbx/base/helpers/overlay", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/overlay", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/overlay", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OverlayHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/overlay", "transform")
  @js.native
  val transform: TransformFunction[OverlayHelpersProps, js.Object] = js.native
  
  @js.native
  trait OverlayHelpersProps extends StObject {
    
    var overlay: js.UndefOr[Boolean] = js.native
  }
  object OverlayHelpersProps {
    
    @scala.inline
    def apply(): OverlayHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayHelpersProps]
    }
    
    @scala.inline
    implicit class OverlayHelpersPropsMutableBuilder[Self <: OverlayHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
