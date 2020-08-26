package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.layoutMod.Layout
import typings.reactNativeNavigation.layoutMod.LayoutRoot
import typings.reactNativeNavigation.layoutProcessorMod.LayoutProcessor
import typings.reactNativeNavigation.layoutTreeCrawlerMod.LayoutTreeCrawler
import typings.reactNativeNavigation.layoutTreeParserMod.LayoutTreeParser
import typings.reactNativeNavigation.nativeCommandsSenderMod.NativeCommandsSender
import typings.reactNativeNavigation.optionsMod.Options
import typings.reactNativeNavigation.optionsProcessorMod.OptionsProcessor
import typings.reactNativeNavigation.storeMod.Store
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/Commands", JSImport.Namespace)
@js.native
object commandsMod extends js.Object {
  @js.native
  class Commands protected () extends js.Object {
    def this(
      store: Store,
      nativeCommandsSender: NativeCommandsSender,
      layoutTreeParser: LayoutTreeParser,
      layoutTreeCrawler: LayoutTreeCrawler,
      commandsObserver: CommandsObserver,
      uniqueIdProvider: UniqueIdProvider,
      optionsProcessor: OptionsProcessor,
      layoutProcessor: LayoutProcessor
    ) = this()
    val commandsObserver: js.Any = js.native
    val layoutProcessor: js.Any = js.native
    val layoutTreeCrawler: js.Any = js.native
    val layoutTreeParser: js.Any = js.native
    val nativeCommandsSender: js.Any = js.native
    val optionsProcessor: js.Any = js.native
    val store: js.Any = js.native
    val uniqueIdProvider: js.Any = js.native
    def dismissAllModals(): js.Promise[_] = js.native
    def dismissAllModals(mergeOptions: Options): js.Promise[_] = js.native
    def dismissModal(componentId: String): js.Promise[_] = js.native
    def dismissModal(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    def dismissOverlay(componentId: String): js.Promise[_] = js.native
    def getLaunchArgs(): js.Promise[_] = js.native
    def mergeOptions(componentId: String, options: Options): Unit = js.native
    def pop(componentId: String): js.Promise[_] = js.native
    def pop(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    def popTo(componentId: String): js.Promise[_] = js.native
    def popTo(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    def popToRoot(componentId: String): js.Promise[_] = js.native
    def popToRoot(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    def push(componentId: String, simpleApi: Layout[js.Object]): js.Promise[_] = js.native
    def setDefaultOptions(options: Options): Unit = js.native
    def setRoot(simpleApi: LayoutRoot): js.Promise[_] = js.native
    def setStackRoot(componentId: String, children: js.Array[Layout[js.Object]]): js.Promise[_] = js.native
    def showModal(layout: Layout[js.Object]): js.Promise[_] = js.native
    def showOverlay(simpleApi: Layout[js.Object]): js.Promise[_] = js.native
    def updateProps(componentId: String, props: js.Object): Unit = js.native
  }
  
}

