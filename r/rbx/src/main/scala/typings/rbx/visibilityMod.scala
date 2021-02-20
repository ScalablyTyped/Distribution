package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMod {
  
  @JSImport("rbx/base/helpers/visibility", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/visibility", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/visibility", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[VisibilityHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/visibility", "transform")
  @js.native
  val transform: TransformFunction[VisibilityHelpersProps, js.Object] = js.native
  
  @js.native
  trait VisibilityHelpersProps extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var invisible: js.UndefOr[Boolean] = js.native
    
    var srOnly: js.UndefOr[Boolean] = js.native
  }
  object VisibilityHelpersProps {
    
    @scala.inline
    def apply(): VisibilityHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityHelpersProps]
    }
    
    @scala.inline
    implicit class VisibilityHelpersPropsMutableBuilder[Self <: VisibilityHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
    }
  }
}
