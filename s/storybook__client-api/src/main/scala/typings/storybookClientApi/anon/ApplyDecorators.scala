package typings.storybookClientApi.anon

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyDecorators extends js.Object {
  def applyDecorators(fn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any = js.native
  def getDecorators(): js.Array[DecoratorFunction[_]] = js.native
}

object ApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any,
    getDecorators: () => js.Array[DecoratorFunction[_]]
  ): ApplyDecorators = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators), getDecorators = js.Any.fromFunction0(getDecorators))
    __obj.asInstanceOf[ApplyDecorators]
  }
  @scala.inline
  implicit class ApplyDecoratorsOps[Self <: ApplyDecorators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyDecorators(value: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): Self = this.set("applyDecorators", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDecorators(value: () => js.Array[DecoratorFunction[_]]): Self = this.set("getDecorators", js.Any.fromFunction0(value))
  }
  
}

