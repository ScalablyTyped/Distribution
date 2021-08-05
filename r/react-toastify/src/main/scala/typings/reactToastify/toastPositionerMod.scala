package typings.reactToastify

import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastPositionerMod {
  
  @JSImport("react-toastify/dist/components/ToastPositioner", "ToastPositioner")
  @js.native
  val ToastPositioner: FC[ToastPositionerProps] = js.native
  
  /* Inlined std.Pick<react-toastify.react-toastify/dist/types.ToastProps, 'style' | 'in'> & {  className :string | undefined} */
  trait ToastPositionerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToastPositionerProps {
    
    inline def apply(): ToastPositionerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastPositionerProps]
    }
    
    extension [Self <: ToastPositionerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
