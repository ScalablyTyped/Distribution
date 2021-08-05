package typings.reactNativeNavigation

import typings.reactNativeNavigation.assetResolverMod.AssetService
import typings.reactNativeNavigation.colorServiceMod.ColorService
import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.deprecationsMod.Deprecations
import typings.reactNativeNavigation.optionProcessorsStoreMod.OptionProcessorsStore
import typings.reactNativeNavigation.optionsMod.Options
import typings.reactNativeNavigation.storeMod.Store
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsProcessorMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/OptionsProcessor", "OptionsProcessor")
  @js.native
  class OptionsProcessor protected () extends StObject {
    def this(
      store: Store,
      uniqueIdProvider: UniqueIdProvider,
      optionProcessorsRegistry: OptionProcessorsStore,
      colorService: ColorService,
      assetService: AssetService,
      deprecations: Deprecations
    ) = this()
    
    /* private */ var assetService: js.Any = js.native
    
    /* private */ var colorService: js.Any = js.native
    
    /* private */ var deprecations: js.Any = js.native
    
    /* private */ var optionProcessorsRegistry: js.Any = js.native
    
    /* private */ var processButtonsPassProps: js.Any = js.native
    
    /* private */ var processColor: js.Any = js.native
    
    /* private */ var processComponent: js.Any = js.native
    
    def processDefaultOptions(options: Options, commandName: CommandName): Unit = js.native
    
    /* private */ var processImage: js.Any = js.native
    
    /* private */ var processInterpolation: js.Any = js.native
    
    /* private */ var processObject: js.Any = js.native
    
    def processOptions(options: Options, commandName: CommandName): Unit = js.native
    
    /* private */ var processSearchBar: js.Any = js.native
    
    /* private */ var processWithRegisteredProcessor: js.Any = js.native
    
    /* private */ var resolveObjectPath: js.Any = js.native
    
    /* private */ var store: js.Any = js.native
    
    /* private */ var uniqueIdProvider: js.Any = js.native
  }
}
