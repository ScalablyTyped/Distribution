package typings.storybookCore

import typings.storybookAddons.distMod.Collection
import typings.storybookAddons.distMod.Config
import typings.storybookAddons.typesMod.Types_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/core/dist/client/manager/provider", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ReactProvider {
    
    /* private */ /* CompleteClass */
    var addons: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var channel: js.Any = js.native
    
    /* CompleteClass */
    override def getConfig(): Config = js.native
    
    /* CompleteClass */
    override def getElements(`type`: Types_): Collection = js.native
    
    /* CompleteClass */
    override def handleAPI(api: js.Any): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider * / any */ trait ReactProvider extends StObject {
    
    /* private */ var addons: js.Any
    
    /* private */ var channel: js.Any
    
    def getConfig(): Config
    
    def getElements(`type`: Types_): Collection
    
    def handleAPI(api: js.Any): Unit
  }
  object ReactProvider {
    
    inline def apply(
      addons: js.Any,
      channel: js.Any,
      getConfig: () => Config,
      getElements: Types_ => Collection,
      handleAPI: js.Any => Unit
    ): ReactProvider = {
      val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getElements = js.Any.fromFunction1(getElements), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[ReactProvider]
    }
    
    extension [Self <: ReactProvider](x: Self) {
      
      inline def setAddons(value: js.Any): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: js.Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setGetConfig(value: () => Config): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      inline def setGetElements(value: Types_ => Collection): Self = StObject.set(x, "getElements", js.Any.fromFunction1(value))
      
      inline def setHandleAPI(value: js.Any => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
    }
  }
}
