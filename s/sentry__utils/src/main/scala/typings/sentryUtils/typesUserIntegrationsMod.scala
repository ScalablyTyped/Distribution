package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUserIntegrationsMod {
  
  @JSImport("@sentry/utils/types/userIntegrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOrUpdateIntegration[T /* <: UserIntegrations */](defaultIntegrationInstance: Integration, userIntegrations: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrUpdateIntegration")(defaultIntegrationInstance.asInstanceOf[js.Any], userIntegrations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addOrUpdateIntegration[T /* <: UserIntegrations */](
    defaultIntegrationInstance: Integration,
    userIntegrations: T,
    forcedOptions: ForcedIntegrationOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrUpdateIntegration")(defaultIntegrationInstance.asInstanceOf[js.Any], userIntegrations.asInstanceOf[js.Any], forcedOptions.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type ForcedIntegrationOptions = StringDictionary[Any]
  
  trait IntegrationWithExclusionOption
    extends StObject
       with Integration {
    
    /**
      * Allow the user to exclude this integration by not returning it from a function provided as the `integrations` option
      * in `Sentry.init()`. Meant to be used with default integrations, the idea being that if a user has actively filtered
      * an integration out, we should be able to respect that choice if we wish.
      */
    var allowExclusionByUser: js.UndefOr[Boolean] = js.undefined
  }
  object IntegrationWithExclusionOption {
    
    inline def apply(
      name: String,
      setupOnce: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit
    ): IntegrationWithExclusionOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setupOnce = js.Any.fromFunction2(setupOnce))
      __obj.asInstanceOf[IntegrationWithExclusionOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntegrationWithExclusionOption] (val x: Self) extends AnyVal {
      
      inline def setAllowExclusionByUser(value: Boolean): Self = StObject.set(x, "allowExclusionByUser", value.asInstanceOf[js.Any])
      
      inline def setAllowExclusionByUserUndefined: Self = StObject.set(x, "allowExclusionByUser", js.undefined)
    }
  }
  
  type UserIntegrations = js.Array[Integration] | UserIntegrationsFunction
  
  type UserIntegrationsFunction = js.Function1[/* integrations */ js.Array[Integration], js.Array[Integration]]
}
