package typings.atStorybookAddonDashActions.atStorybookAddonDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def action(name: String): HandlerFunction = js.native
  def configureActions(options: Options): js.UndefOr[scala.Nothing] = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[Options], HandlerFunction] = js.native
}

