package typings.storybookStore.anon

import typings.storybookStore.ts39TypesMod.NormalizedComponentAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedStoryAnnotations
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallStoryAnnotationsComponentAnnotationsProjectAnnotations extends StObject {
  
  def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyAnnotations: NormalizedStoryAnnotations[TFramework],
    componentAnnotations: NormalizedComponentAnnotations[TFramework],
    projectAnnotations: NormalizedProjectAnnotations[TFramework]
  ): Story[TFramework] = js.native
}
