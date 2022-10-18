package typings.storybookReact

import typings.storybookAddons.distTs3Dot9TypesMod.Parameters
import typings.storybookReact.anon.ExtractArgTypes
import typings.storybookReact.distTs3Dot9ClientPreviewTypesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsConfigMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/config", "argTypesEnhancers")
  @js.native
  val argTypesEnhancers: js.Array[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StoryContextForEnhancers<TFramework, imported_csf.Args> */ /* context */ Any, 
      Parameters | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StrictArgTypes<imported_csf.Args> */ Any)
    ]
  ] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/config", "decorators")
  @js.native
  val decorators: js.Array[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<ReactFramework, imported_csf.Args> */ /* storyFn */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StoryContext<ReactFramework, imported_csf.Args> */ /* context */ Any, 
      StoryFnReactReturnType
    ]
  ] = js.native
  
  object parameters {
    
    @JSImport("@storybook/react/dist/ts3.9/client/docs/config", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/react/dist/ts3.9/client/docs/config", "parameters.docs")
    @js.native
    def docs: ExtractArgTypes = js.native
    inline def docs_=(x: ExtractArgTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docs")(x.asInstanceOf[js.Any])
  }
}
