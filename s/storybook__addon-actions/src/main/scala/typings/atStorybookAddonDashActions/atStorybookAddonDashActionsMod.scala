package typings.atStorybookAddonDashActions

import typings.atStorybookAddonDashActions.atStorybookAddonDashActionsStrings.DOLLAR___storybookDOTisCyclic
import typings.atStorybookAddonDashActions.atStorybookAddonDashActionsStrings.`storybook/actions`
import typings.atStorybookAddonDashActions.distModelsActionOptionsMod.ActionOptions
import typings.atStorybookAddonDashActions.distModelsActionsFunctionMod.ActionsFunction
import typings.atStorybookAddonDashActions.distModelsDecoratorFunctionMod.DecoratorFunction
import typings.atStorybookAddonDashActions.distModelsHandlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions", JSImport.Namespace)
@js.native
object atStorybookAddonDashActionsMod extends js.Object {
  val ADDON_ID: `storybook/actions` = js.native
  val CYCLIC_KEY: DOLLAR___storybookDOTisCyclic = js.native
  val EVENT_ID: String = js.native
  val PANEL_ID: String = js.native
  val PARAM_KEY: typings.atStorybookAddonDashActions.atStorybookAddonDashActionsStrings.actions = js.native
  val actions: ActionsFunction = js.native
  val config: ActionOptions = js.native
  def action(name: String): HandlerFunction = js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  def configureActions(): Unit = js.native
  def configureActions(options: ActionOptions): Unit = js.native
  def createDecorator(actionsFn: js.Any): js.Function1[/* repeated */ js.Any, js.Function1[/* storyFn */ js.Function0[_], _]] = js.native
  def decorate(decorators: js.Array[DecoratorFunction]): Anon_Action = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
  def withActions(args: js.Any*): js.Function1[/* storyFn */ js.Function0[_], _] = js.native
}

