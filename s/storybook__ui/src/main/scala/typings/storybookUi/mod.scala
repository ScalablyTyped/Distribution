package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.std.History
import typings.storybookAddons.distTs3Dot9TypesMod.Types_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(domNode: HTMLElement, provider: Provider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(domNode.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@storybook/ui", "Provider")
  @js.native
  open class Provider () extends StObject {
    
    def getConfig(): js.Object = js.native
    
    def getElements(_type: Types_): Unit = js.native
    
    def handleAPI(_api: Any): Unit = js.native
  }
  
  @JSImport("@storybook/ui", "Root")
  @js.native
  val Root: FunctionComponent[RootProps] = js.native
  
  trait RootProps extends StObject {
    
    var history: js.UndefOr[History] = js.undefined
    
    var provider: Provider
  }
  object RootProps {
    
    inline def apply(provider: Provider): RootProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootProps]
    }
    
    extension [Self <: RootProps](x: Self) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
