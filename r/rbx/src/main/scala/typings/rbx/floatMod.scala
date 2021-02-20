package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatMod {
  
  @JSImport("rbx/base/helpers/float", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/float", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/float", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[FloatHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/float", "transform")
  @js.native
  val transform: TransformFunction[FloatHelpersProps, js.Object] = js.native
  
  @js.native
  trait FloatHelpersProps extends StObject {
    
    var clearfix: js.UndefOr[Boolean] = js.native
    
    var pull: js.UndefOr[left | right] = js.native
  }
  object FloatHelpersProps {
    
    @scala.inline
    def apply(): FloatHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatHelpersProps]
    }
    
    @scala.inline
    implicit class FloatHelpersPropsMutableBuilder[Self <: FloatHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      @scala.inline
      def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    }
  }
}
