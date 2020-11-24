package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.Id
import typings.storybookUi.anon.Layout
import typings.storybookUi.anon.themeThemeundefinedchildr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", JSImport.Namespace)
@js.native
object headingStoriesMod extends js.Object {
  
  def customBrandImage(): Element = js.native
  
  def linkAndText(): Element = js.native
  
  def longText(): Element = js.native
  
  def menuHighlighted(): Element = js.native
  
  def onlyText(): Element = js.native
  
  def standard(): Element = js.native
  
  def standardNoLink(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[themeThemeundefinedchildr] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var excludeStories: RegExp = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object standardData extends js.Object {
    
    var menu: js.Array[Id] = js.native
  }
}
