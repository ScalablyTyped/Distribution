package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.integrationMod.sentryTypesAugmentingMod.Integration
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.transportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
  @JSImport("@sentry/core/types/integration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIntegrationsToSetup(options: Options[BaseTransportOptions]): js.Array[Integration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationsToSetup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Integration]]
  
  @JSImport("@sentry/core/types/integration", "installedIntegrations")
  @js.native
  val installedIntegrations: js.Array[String] = js.native
  
  inline def setupIntegrations(integrations: js.Array[Integration]): IntegrationIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("setupIntegrations")(integrations.asInstanceOf[js.Any]).asInstanceOf[IntegrationIndex]
  
  type IntegrationIndex = StringDictionary[Integration]
  
  /* augmented module */
  object sentryTypesAugmentingMod {
    
    trait Integration extends StObject {
      
      var isDefaultInstance: js.UndefOr[Boolean] = js.undefined
    }
    object Integration {
      
      inline def apply(): Integration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Integration]
      }
      
      extension [Self <: Integration](x: Self) {
        
        inline def setIsDefaultInstance(value: Boolean): Self = StObject.set(x, "isDefaultInstance", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultInstanceUndefined: Self = StObject.set(x, "isDefaultInstance", js.undefined)
      }
    }
  }
}
