package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersVisibilityMod {
  
  @JSImport("rbx/base/helpers/visibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/visibility", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[VisibilityHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/visibility", "transform")
  @js.native
  val transform: TransformFunction[VisibilityHelpersProps, js.Object] = js.native
  
  trait VisibilityHelpersProps extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var srOnly: js.UndefOr[Boolean] = js.undefined
  }
  object VisibilityHelpersProps {
    
    inline def apply(): VisibilityHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityHelpersProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisibilityHelpersProps] (val x: Self) extends AnyVal {
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      inline def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
    }
  }
}
