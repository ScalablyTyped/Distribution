package typings.storybookApi.mod

import typings.storybookApi.anon.CustomQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api", "Provider")
@js.native
class Provider protected () extends ManagerProvider {
  def this(props: Props) = this()
}

/* static members */
@JSImport("@storybook/api", "Provider")
@js.native
object Provider extends js.Object {
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State): CustomQueryParams = js.native
}

