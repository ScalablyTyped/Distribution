package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Layout
import typings.storybookUi.explorerMod.ExplorerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Explorer.stories", JSImport.Namespace)
@js.native
object explorerStoriesMod extends js.Object {
  
  def Simple(): Element = js.native
  
  def WithRefs(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[ExplorerProps] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
}
