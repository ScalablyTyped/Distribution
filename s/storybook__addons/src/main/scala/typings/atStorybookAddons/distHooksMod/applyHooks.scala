package typings.atStorybookAddons.distHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "applyHooks")
@js.native
object applyHooks extends js.Object {
  def apply(
    applyDecorators: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryGetter */ /* getStory */ js.Any, 
      /* decorators */ js.Array[Decorator], 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryGetter */ _
    ]
  ): js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryGetter */ /* getStory */ js.Any, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryContext */ /* context */ _, 
      _
    ]
  ] = js.native
}

