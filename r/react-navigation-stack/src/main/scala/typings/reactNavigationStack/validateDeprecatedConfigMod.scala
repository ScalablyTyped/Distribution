package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateDeprecatedConfigMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/utils/validateDeprecatedConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: StackNavigationConfig, options: StackNavigationOptions): StackNavigationOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StackNavigationOptions]
}
