package typings.atStorybookClientDashApi.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryContext * / any */ trait StoreItem extends js.Object {
  var hooks: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HooksContext */ js.Any
  var story: String
  var storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
  def getDecorated(): js.Any
  def getOriginal(): js.Any
}

object StoreItem {
  @scala.inline
  def apply(
    getDecorated: () => js.Any,
    getOriginal: () => js.Any,
    hooks: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HooksContext */ js.Any,
    story: String,
    storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
  ): StoreItem = {
    val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks, story = story, storyFn = storyFn)
  
    __obj.asInstanceOf[StoreItem]
  }
}

