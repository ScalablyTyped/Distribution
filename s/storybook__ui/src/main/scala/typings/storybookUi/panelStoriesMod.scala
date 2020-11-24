package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Actions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/panel/panel.stories", JSImport.Namespace)
@js.native
object panelStoriesMod extends js.Object {
  
  @JSName("Default")
  def Default_(): Element = js.native
  
  def NoPanels(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: NamedExoticComponent[Actions] = js.native
    
    var title: String = js.native
  }
}
