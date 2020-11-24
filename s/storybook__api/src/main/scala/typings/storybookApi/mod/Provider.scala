package typings.storybookApi.mod

import typings.storybookApi.anon.CustomQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api", "Provider")
@js.native
class Provider protected () extends ManagerProvider {
  def this(props: ManagerProviderProps) = this()
}
/* static members */
@JSImport("@storybook/api", "Provider")
@js.native
object Provider extends js.Object {
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: ManagerProviderProps, state: State): CustomQueryParams = js.native
}
