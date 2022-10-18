package typings.storybookReact

import typings.node.NodeModule
import typings.std.Exclude
import typings.std.Pick
import typings.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typings.storybookAddons.distTs3Dot9TypesMod.Loadable
import typings.storybookAddons.distTs3Dot9TypesMod.Parameters
import typings.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typings.storybookReact.anon.Call
import typings.storybookReact.distTs3Dot9ClientPreviewTypes60Mod.Meta
import typings.storybookReact.distTs3Dot9ClientPreviewTypes60Mod.ReactFramework
import typings.storybookReact.distTs3Dot9ClientPreviewTypesMod.IStorybookSection
import typings.storybookReact.storybookReactStrings.__esModule
import typings.storybookReact.storybookReactStrings.__namedExportsOrder
import typings.storybookReact.storybookReactStrings.default
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.CSFExports
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.ComposedStory
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.StoriesWithPartialProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ], 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/react", "addParameters")
  @js.native
  val addParameters: js.Function1[
    /* parameter */ Parameters, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  inline def composeStories[TModule /* <: CSFExports[ReactFramework] */](csfExports: TModule): Pick[
    StoriesWithPartialProps[ReactFramework, TModule], 
    Exclude[/* keyof TModule */ String, default | __esModule | __namedExportsOrder]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeStories")(csfExports.asInstanceOf[js.Any]).asInstanceOf[Pick[
    StoriesWithPartialProps[ReactFramework, TModule], 
    Exclude[/* keyof TModule */ String, default | __esModule | __namedExportsOrder]
  ]]
  inline def composeStories[TModule /* <: CSFExports[ReactFramework] */](
    csfExports: TModule,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
  ): Pick[
    StoriesWithPartialProps[ReactFramework, TModule], 
    Exclude[/* keyof TModule */ String, default | __esModule | __namedExportsOrder]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStories")(csfExports.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Pick[
    StoriesWithPartialProps[ReactFramework, TModule], 
    Exclude[/* keyof TModule */ String, default | __esModule | __namedExportsOrder]
  ]]
  
  inline def composeStory[TArgs](story: ComposedStory[ReactFramework, TArgs], componentAnnotations: Meta[TArgs | Any]): Call[TArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(story.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs]]
  inline def composeStory[TArgs](
    story: ComposedStory[ReactFramework, TArgs],
    componentAnnotations: Meta[TArgs | Any],
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
  ): Call[TArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(story.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs]]
  inline def composeStory[TArgs](
    story: ComposedStory[ReactFramework, TArgs],
    componentAnnotations: Meta[TArgs | Any],
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any,
    exportsName: String
  ): Call[TArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(story.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs]]
  inline def composeStory[TArgs](
    story: ComposedStory[ReactFramework, TArgs],
    componentAnnotations: Meta[TArgs | Any],
    projectAnnotations: Unit,
    exportsName: String
  ): Call[TArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(story.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs]]
  
  @JSImport("@storybook/react", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/react", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/react", "raw")
  @js.native
  val raw: js.Function0[Any] = js.native
  
  @JSImport("@storybook/react", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ Any, Unit] = js.native
  
  inline def setGlobalConfig(
    projectAnnotations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalConfig")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setGlobalConfig(
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalConfig")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setProjectAnnotations(
    projectAnnotations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setProjectAnnotations(
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<ReactFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@storybook/react", "storiesOf")
  @js.native
  val storiesOf: js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ /* kind */ Any, 
    /* module */ NodeModule, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
}
