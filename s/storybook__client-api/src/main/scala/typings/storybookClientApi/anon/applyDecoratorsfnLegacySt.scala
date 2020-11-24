package typings.storybookClientApi.anon

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LegacyStoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {applyDecorators (fn : @storybook/addons.@storybook/addons.LegacyStoryFn<unknown>, decorators : std.Array<@storybook/client-api.@storybook/client-api/dist/types.DecoratorFunction<unknown>>): any} & @storybook/client-api.@storybook/client-api/dist/story_store.AllowUnsafeOption */
@js.native
trait applyDecoratorsfnLegacySt extends js.Object {
  
  var allowUnsafe: js.UndefOr[Boolean] = js.native
  
  def applyDecorators(fn: LegacyStoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any = js.native
}
object applyDecoratorsfnLegacySt {
  
  @scala.inline
  def apply(applyDecorators: (LegacyStoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): applyDecoratorsfnLegacySt = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators))
    __obj.asInstanceOf[applyDecoratorsfnLegacySt]
  }
  
  @scala.inline
  implicit class applyDecoratorsfnLegacyStOps[Self <: applyDecoratorsfnLegacySt] (val x: Self) extends AnyVal {
    
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
    def setApplyDecorators(value: (LegacyStoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): Self = this.set("applyDecorators", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowUnsafe(value: Boolean): Self = this.set("allowUnsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnsafe: Self = this.set("allowUnsafe", js.undefined)
  }
}
