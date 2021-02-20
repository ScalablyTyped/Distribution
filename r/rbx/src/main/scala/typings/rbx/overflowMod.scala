package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowMod {
  
  @JSImport("rbx/base/helpers/overflow", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/overflow", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/overflow", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[OverflowHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/overflow", "transform")
  @js.native
  val transform: TransformFunction[OverflowHelpersProps, js.Object] = js.native
  
  @js.native
  trait OverflowHelpersProps extends StObject {
    
    var clipped: js.UndefOr[Boolean] = js.native
  }
  object OverflowHelpersProps {
    
    @scala.inline
    def apply(): OverflowHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowHelpersProps]
    }
    
    @scala.inline
    implicit class OverflowHelpersPropsMutableBuilder[Self <: OverflowHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    }
  }
}
