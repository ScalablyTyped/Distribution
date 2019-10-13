package typings.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyDecorators extends js.Object {
  def applyDecorators(
    fn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any,
    decorators: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecoratorFunction */ _
    ]
  ): js.Any
  def getDecorators(): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecoratorFunction */ _
  ]
}

object Anon_ApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any, js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecoratorFunction */ _
    ]) => js.Any,
    getDecorators: () => js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecoratorFunction */ _
    ]
  ): Anon_ApplyDecorators = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators), getDecorators = js.Any.fromFunction0(getDecorators))
  
    __obj.asInstanceOf[Anon_ApplyDecorators]
  }
}

