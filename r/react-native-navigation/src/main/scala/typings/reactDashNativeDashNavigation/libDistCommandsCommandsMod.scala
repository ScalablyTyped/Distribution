package typings.reactDashNativeDashNavigation

import typings.reactDashNativeDashNavigation.libDistAdaptersNativeCommandsSenderMod.NativeCommandsSender
import typings.reactDashNativeDashNavigation.libDistAdaptersUniqueIdProviderMod.UniqueIdProvider
import typings.reactDashNativeDashNavigation.libDistCommandsLayoutTreeCrawlerMod.LayoutTreeCrawler
import typings.reactDashNativeDashNavigation.libDistCommandsLayoutTreeParserMod.LayoutTreeParser
import typings.reactDashNativeDashNavigation.libDistCommandsOptionsProcessorMod.OptionsProcessor
import typings.reactDashNativeDashNavigation.libDistComponentsStoreMod.Store
import typings.reactDashNativeDashNavigation.libDistEventsCommandsObserverMod.CommandsObserver
import typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod.Layout
import typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod.LayoutRoot
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/Commands", JSImport.Namespace)
@js.native
object libDistCommandsCommandsMod extends js.Object {
  @js.native
  class Commands protected () extends js.Object {
    def this(
      store: Store,
      nativeCommandsSender: NativeCommandsSender,
      layoutTreeParser: LayoutTreeParser,
      layoutTreeCrawler: LayoutTreeCrawler,
      commandsObserver: CommandsObserver,
      uniqueIdProvider: UniqueIdProvider,
      optionsProcessor: OptionsProcessor
    ) = this()
    val commandsObserver: js.Any = js.native
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

