package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportInfoMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Info", "Info")
  @js.native
  val Info: FunctionComponent[InfoProps] = js.native
  
  trait InfoProps extends StObject {
    
    var item: Result
  }
  object InfoProps {
    
    inline def apply(item: Result): InfoProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoProps] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Result): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
