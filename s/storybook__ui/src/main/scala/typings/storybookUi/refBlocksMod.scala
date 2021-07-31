package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookUi.anon.Error
import typings.storybookUi.anon.IsMain
import typings.storybookUi.anon.LoginUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refBlocksMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", "AuthBlock")
  @js.native
  val AuthBlock: FunctionComponent[LoginUrl] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", "EmptyBlock")
  @js.native
  val EmptyBlock: FunctionComponent[js.Any] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", "ErrorBlock")
  @js.native
  val ErrorBlock: FunctionComponent[Error] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", "LoaderBlock")
  @js.native
  val LoaderBlock: FunctionComponent[IsMain] = js.native
}
