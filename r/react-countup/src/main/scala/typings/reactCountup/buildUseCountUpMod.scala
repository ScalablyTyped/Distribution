package typings.reactCountup

import typings.react.mod.RefObject
import typings.reactCountup.buildTypesMod.CallbackProps
import typings.reactCountup.buildTypesMod.CommonProps
import typings.reactCountup.buildTypesMod.CountUpApi
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUseCountUpMod {
  
  @JSImport("react-countup/build/useCountUp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: UseCountUpProps): CountUpApi = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[CountUpApi]
  
  trait UseCountUpProps
    extends StObject
       with CommonProps
       with CallbackProps {
    
    var enableReinitialize: js.UndefOr[Boolean] = js.undefined
    
    var ref: String | RefObject[HTMLElement]
    
    var startOnMount: js.UndefOr[Boolean] = js.undefined
  }
  object UseCountUpProps {
    
    inline def apply(end: Double, ref: String | RefObject[HTMLElement]): UseCountUpProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseCountUpProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseCountUpProps] (val x: Self) extends AnyVal {
      
      inline def setEnableReinitialize(value: Boolean): Self = StObject.set(x, "enableReinitialize", value.asInstanceOf[js.Any])
      
      inline def setEnableReinitializeUndefined: Self = StObject.set(x, "enableReinitialize", js.undefined)
      
      inline def setRef(value: String | RefObject[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStartOnMount(value: Boolean): Self = StObject.set(x, "startOnMount", value.asInstanceOf[js.Any])
      
      inline def setStartOnMountUndefined: Self = StObject.set(x, "startOnMount", js.undefined)
    }
  }
}
