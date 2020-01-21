package typings.storybookClientApi

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyDecorators extends js.Object {
  def applyDecorators(fn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any
  def getDecorators(): js.Array[DecoratorFunction[_]]
}

object AnonApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any,
    getDecorators: () => js.Array[DecoratorFunction[_]]
  ): AnonApplyDecorators = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators), getDecorators = js.Any.fromFunction0(getDecorators))
  
    __obj.asInstanceOf[AnonApplyDecorators]
  }
}

