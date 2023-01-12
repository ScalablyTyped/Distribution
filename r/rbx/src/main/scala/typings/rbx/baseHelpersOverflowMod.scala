package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersOverflowMod {
  
  @JSImport("rbx/base/helpers/overflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/overflow", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OverflowHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/overflow", "transform")
  @js.native
  val transform: TransformFunction[OverflowHelpersProps, js.Object] = js.native
  
  trait OverflowHelpersProps extends StObject {
    
    var clipped: js.UndefOr[Boolean] = js.undefined
  }
  object OverflowHelpersProps {
    
    inline def apply(): OverflowHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowHelpersProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowHelpersProps] (val x: Self) extends AnyVal {
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    }
  }
}
