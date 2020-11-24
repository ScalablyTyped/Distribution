package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Layout
import typings.storybookUi.distMod.RootProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/app.stories", JSImport.Namespace)
@js.native
object appStoriesMod extends js.Object {
  
  @JSName("Default")
  def Default_(): Element = js.native
  
  def LoadingState(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[RootProps] = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
}
