package typings.storybookUi

import typings.storybookAddons.typesMod.Types_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/ui/dist/provider", JSImport.Default)
  @js.native
  class default () extends Provider
  
  @js.native
  trait Provider extends StObject {
    
    def getConfig(): js.Object = js.native
    
    def getElements(_type: Types_): Unit = js.native
    
    def handleAPI(_api: js.Any): Unit = js.native
  }
  object Provider {
    
    @scala.inline
    def apply(getConfig: () => js.Object, getElements: Types_ => Unit, handleAPI: js.Any => Unit): Provider = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), getElements = js.Any.fromFunction1(getElements), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetConfig(value: () => js.Object): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElements(value: Types_ => Unit): Self = StObject.set(x, "getElements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleAPI(value: js.Any => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
    }
  }
}
