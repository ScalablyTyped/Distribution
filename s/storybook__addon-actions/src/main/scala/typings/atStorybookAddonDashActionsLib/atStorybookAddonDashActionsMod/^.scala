package typings
package atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def action(name: java.lang.String): atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod.HandlerFunction = js.native
  def configureActions(options: atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod.Options): js.UndefOr[scala.Nothing] = js.native
  def decorateAction(
    decorators: js.Array[atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod.DecoratorFunction]
  ): js.Function2[
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod.Options], 
    atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod.HandlerFunction
  ] = js.native
}

