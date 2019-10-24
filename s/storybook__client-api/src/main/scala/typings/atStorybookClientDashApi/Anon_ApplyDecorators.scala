package typings.atStorybookClientDashApi

import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyDecorators extends js.Object {
  def applyDecorators(fn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any
  def getDecorators(): js.Array[DecoratorFunction[_]]
}

object Anon_ApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any,
    getDecorators: () => js.Array[DecoratorFunction[_]]
  ): Anon_ApplyDecorators = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators), getDecorators = js.Any.fromFunction0(getDecorators))
  
    __obj.asInstanceOf[Anon_ApplyDecorators]
  }
}

