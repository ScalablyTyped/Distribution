package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.anon.Action
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/addon-actions/dist/preview", "action")
  @js.native
  def action(name: String): HandlerFunction = js.native
  @JSImport("@storybook/addon-actions/dist/preview", "action")
  @js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "actions")
  @js.native
  val actions: ActionsFunction = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "config")
  @js.native
  val config: ActionOptions = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "configureActions")
  @js.native
  def configureActions(): Unit = js.native
  @JSImport("@storybook/addon-actions/dist/preview", "configureActions")
  @js.native
  def configureActions(options: ActionOptions): Unit = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "decorate")
  @js.native
  def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "decorateAction")
  @js.native
  def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "withActions")
  @js.native
  def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
