package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersFloatMod {
  
  @JSImport("rbx/base/helpers/float", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/float", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[FloatHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/float", "transform")
  @js.native
  val transform: TransformFunction[FloatHelpersProps, js.Object] = js.native
  
  trait FloatHelpersProps extends StObject {
    
    var clearfix: js.UndefOr[Boolean] = js.undefined
    
    var pull: js.UndefOr[left | right] = js.undefined
  }
  object FloatHelpersProps {
    
    inline def apply(): FloatHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatHelpersProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FloatHelpersProps] (val x: Self) extends AnyVal {
      
      inline def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      inline def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      inline def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    }
  }
}
