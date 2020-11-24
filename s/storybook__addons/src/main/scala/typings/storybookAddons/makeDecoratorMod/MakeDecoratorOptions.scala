package typings.storybookAddons.makeDecoratorMod

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import typings.storybookAddons.typesMod.StoryWrapper
import typings.storybookAddons.typesMod.WrapperSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeDecoratorOptions extends js.Object {
  
  var name: String = js.native
  
  var parameterName: String = js.native
  
  var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.native
  
  var wrapper: StoryWrapper = js.native
}
object MakeDecoratorOptions {
  
  @scala.inline
  def apply(
    name: String,
    parameterName: String,
    wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
  ): MakeDecoratorOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
    __obj.asInstanceOf[MakeDecoratorOptions]
  }
  
  @scala.inline
  implicit class MakeDecoratorOptionsOps[Self <: MakeDecoratorOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(
      value: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
    ): Self = this.set("wrapper", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSkipIfNoParametersOrOptions(value: Boolean): Self = this.set("skipIfNoParametersOrOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipIfNoParametersOrOptions: Self = this.set("skipIfNoParametersOrOptions", js.undefined)
  }
}
