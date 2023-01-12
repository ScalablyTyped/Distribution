package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingAppSizeListenerMod {
  
  @JSImport("@react-md/utils/types/sizing/AppSizeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AppSizeListener(param0: AppSizeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait AppSizeListenerProps
    extends StObject
       with AppSizeOptions {
    
    var children: ReactNode
    
    /**
      * An change handler for the app size. This will be called each time the app
      * size changes based on a window resize event and will be provided the next
      * size and the previous size.
      */
    var onChange: js.UndefOr[js.Function2[/* nextSize */ AppSize, /* lastSize */ AppSize, Unit]] = js.undefined
  }
  object AppSizeListenerProps {
    
    inline def apply(): AppSizeListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSizeListenerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppSizeListenerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
