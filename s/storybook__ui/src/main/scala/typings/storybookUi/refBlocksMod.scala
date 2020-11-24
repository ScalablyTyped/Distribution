package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookUi.anon.Error
import typings.storybookUi.anon.IsMain
import typings.storybookUi.anon.LoginUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", JSImport.Namespace)
@js.native
object refBlocksMod extends js.Object {
  
  val AuthBlock: FunctionComponent[LoginUrl] = js.native
  
  val EmptyBlock: FunctionComponent[js.Any] = js.native
  
  val ErrorBlock: FunctionComponent[Error] = js.native
  
  val LoaderBlock: FunctionComponent[IsMain] = js.native
}
