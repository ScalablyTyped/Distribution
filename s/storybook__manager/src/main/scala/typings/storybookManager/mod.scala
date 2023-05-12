package typings.storybookManager

import typings.react.mod.FC
import typings.std.HTMLElement
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AddonTypesEnum extends StObject
  @JSImport("@storybook/manager", "Addon_TypesEnum")
  @js.native
  object AddonTypesEnum extends StObject {
    
    @js.native
    sealed trait NOTES_ELEMENT
      extends StObject
         with AddonTypesEnum
    
    @js.native
    sealed trait PANEL
      extends StObject
         with AddonTypesEnum
    
    @js.native
    sealed trait PREVIEW
      extends StObject
         with AddonTypesEnum
    
    @js.native
    sealed trait TAB
      extends StObject
         with AddonTypesEnum
    
    @js.native
    sealed trait TOOL
      extends StObject
         with AddonTypesEnum
    
    @js.native
    sealed trait TOOLEXTRA
      extends StObject
         with AddonTypesEnum
  }
  
  @JSImport("@storybook/manager", "Provider")
  @js.native
  open class Provider () extends StObject {
    
    def getConfig(): js.Object = js.native
    
    def getElements(_type: AddonTypes): Unit = js.native
    
    def handleAPI(_api: Any): Unit = js.native
  }
  
  @JSImport("@storybook/manager", "Root")
  @js.native
  val Root: FC[RootProps] = js.native
  
  inline def renderStorybookUI(domNode: HTMLElement, provider: Provider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStorybookUI")(domNode.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AddonTypes = AddonTypesEnum | String
  
  trait RootProps extends StObject {
    
    var history: js.UndefOr[History] = js.undefined
    
    var provider: Provider
  }
  object RootProps {
    
    inline def apply(provider: Provider): RootProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootProps] (val x: Self) extends AnyVal {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
