package typings.storybookStore

import typings.storybookStore.ts39TypesMod.NormalizedStoryAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeStoryMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf/normalizeStory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryAnnotationsOrFn<TFramework> */ Any,
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework> */ Any
  ): NormalizedStoryAnnotations[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStory")(key.asInstanceOf[js.Any], storyAnnotations.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[NormalizedStoryAnnotations[TFramework]]
}
