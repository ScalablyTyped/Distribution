package typings.storybookStore

import typings.storybookStore.ts39TypesMod.NormalizedComponentAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedStoryAnnotations
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prepareStoryMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf/prepareStory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyAnnotations: NormalizedStoryAnnotations[TFramework],
    componentAnnotations: NormalizedComponentAnnotations[TFramework],
    projectAnnotations: NormalizedProjectAnnotations[TFramework]
  ): Story[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Story[TFramework]]
}
