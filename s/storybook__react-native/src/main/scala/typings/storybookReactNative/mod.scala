package typings.storybookReactNative

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookClientApi.typesMod.GetStorybookKind
import typings.storybookClientApi.typesMod.PublishedStoreItem
import typings.storybookReactNative.anon.Instantiable
import typings.storybookReactNative.anon.PartialParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/react-native/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react-native/dist", "addDecorator")
  @js.native
  val addDecorator: js.Function1[/* decorator */ DecoratorFunction[js.Any], Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameters */ Parameters, Unit] = js.native
  
  @JSImport("@storybook/react-native/dist", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  inline def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(loadStories.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@storybook/react-native/dist", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[GetStorybookKind]] = js.native
  
  inline def getStorybookUI(): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookUI")().asInstanceOf[Instantiable]
  inline def getStorybookUI(params: PartialParams): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookUI")(params.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  
  @JSImport("@storybook/react-native/dist", "raw")
  @js.native
  val raw: js.Function0[js.Array[PublishedStoreItem]] = js.native
  
  @JSImport("@storybook/react-native/dist", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  inline def storiesOf(kind: String, module: NodeModule): StoryApi[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("storiesOf")(kind.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[StoryApi[js.Any]]
}
