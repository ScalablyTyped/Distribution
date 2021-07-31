package typings.storybookUi

import typings.reachRouter.mod.History
import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.storybookUi.providerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/ui/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(domNode: HTMLElement, provider: typings.storybookUi.providerMod.default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(domNode.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@storybook/ui/dist", "Provider")
  @js.native
  class Provider () extends default
  
  @JSImport("@storybook/ui/dist", "Root")
  @js.native
  val Root: FunctionComponent[RootProps] = js.native
  
  trait RootProps extends StObject {
    
    var history: js.UndefOr[History] = js.undefined
    
    var provider: default
  }
  object RootProps {
    
    @scala.inline
    def apply(provider: default): RootProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootProps]
    }
    
    @scala.inline
    implicit class RootPropsMutableBuilder[Self <: RootProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setProvider(value: default): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
