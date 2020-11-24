package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookUi.typesMod.PreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/preview/preview.stories", JSImport.Namespace)
@js.native
object previewStoriesMod extends js.Object {
  
  def noTabs(): Element = js.native
  
  def withTabs(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: NamedExoticComponent[PreviewProps] = js.native
    
    var decorators: js.Array[DecoratorFunction[StoryFnReactReturnType]] = js.native
    
    var title: String = js.native
  }
}
