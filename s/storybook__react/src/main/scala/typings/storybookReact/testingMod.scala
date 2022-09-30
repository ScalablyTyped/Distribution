package typings.storybookReact

import typings.std.Exclude
import typings.std.Pick
import typings.storybookReact.anon.Call
import typings.storybookReact.storybookReactStrings.__esModule
import typings.storybookReact.storybookReactStrings.__namedExportsOrder
import typings.storybookReact.storybookReactStrings.default
import typings.storybookReact.types60Mod.Meta
import typings.storybookReact.types60Mod.ReactFramework
import typings.storybookStore.typesMod.CSFExports
import typings.storybookStore.typesMod.ComposedStory
import typings.storybookStore.typesMod.StoriesWithPartialProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
