package typings.reactNativeNavigation

import typings.reactNativeNavigation.assetResolverMod.AssetService
import typings.reactNativeNavigation.colorServiceMod.ColorService
import typings.reactNativeNavigation.optionsMod.Options
import typings.reactNativeNavigation.storeMod.Store
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/OptionsProcessor", JSImport.Namespace)
@js.native
object optionsProcessorMod extends js.Object {
  @js.native
  class OptionsProcessor protected () extends js.Object {
    def this(
      store: Store,
      uniqueIdProvider: UniqueIdProvider,
      colorService: ColorService,
      assetService: AssetService
    ) = this()
    var assetService: js.Any = js.native
    var colorService: js.Any = js.native
    var processButtonsPassProps: js.Any = js.native
    var processColor: js.Any = js.native
    var processComponent: js.Any = js.native
    var processImage: js.Any = js.native
    var processObject: js.Any = js.native
    var store: js.Any = js.native
    var uniqueIdProvider: js.Any = js.native
    def processOptions(options: Options): Unit = js.native
  }
  
}

