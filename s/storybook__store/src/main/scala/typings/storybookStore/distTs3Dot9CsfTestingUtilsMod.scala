package typings.storybookStore

import typings.storybookStore.anon.Call
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.CSFExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CsfTestingUtilsMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf/testing-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeStories[TModule /* <: CSFExports[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
  ] */](
    storiesImport: TModule,
    globalConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<AnyFramework> */ Any,
    composeStoryFn: ComposeStory_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStories")(storiesImport.asInstanceOf[js.Any], globalConfig.asInstanceOf[js.Any], composeStoryFn.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ComposeStory_[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */] = js.Function4[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* storyAnnotations */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ /* componentAnnotations */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ /* projectAnnotations */ Any, 
    /* exportsName */ js.UndefOr[String], 
    Call[TArgs, TFramework]
  ]
}
