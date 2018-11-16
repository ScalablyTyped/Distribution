package typings
package atStorybookAddonDashActionsLib.addonDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions", JSImport.Namespace)
@js.native
object addonDashActionsModMembers extends js.Object {
  def action(name: java.lang.String): HandlerFunction = js.native
  def configureActions(options: Options): js.UndefOr[scala.Nothing] = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ java.lang.String, /* options */ js.UndefOr[Options], HandlerFunction] = js.native
}

