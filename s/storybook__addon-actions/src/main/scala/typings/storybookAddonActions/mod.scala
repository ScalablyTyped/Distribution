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

object mod {
  
  @JSImport("@storybook/addon-actions", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybook/actions" */ String = js.native
  
  @JSImport("@storybook/addon-actions", "CYCLIC_KEY")
  @js.native
  val CYCLIC_KEY: /* "$___storybook.isCyclic" */ String = js.native
  
  @JSImport("@storybook/addon-actions", "EVENT_ID")
  @js.native
  val EVENT_ID: String = js.native
  
  @JSImport("@storybook/addon-actions", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-actions", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "actions" */ String = js.native
  
  @JSImport("@storybook/addon-actions", "action")
  @js.native
  def action(name: String): HandlerFunction = js.native
  @JSImport("@storybook/addon-actions", "action")
  @js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  
  @JSImport("@storybook/addon-actions", "actions")
  @js.native
  val actions: ActionsFunction = js.native
  
  @JSImport("@storybook/addon-actions", "config")
  @js.native
  val config: ActionOptions = js.native
  
  @JSImport("@storybook/addon-actions", "configureActions")
  @js.native
  def configureActions(): Unit = js.native
  @JSImport("@storybook/addon-actions", "configureActions")
  @js.native
  def configureActions(options: ActionOptions): Unit = js.native
  
  @JSImport("@storybook/addon-actions", "decorate")
  @js.native
  def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = js.native
  
  @JSImport("@storybook/addon-actions", "decorateAction")
  @js.native
  def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = js.native
  
  @JSImport("@storybook/addon-actions", "withActions")
  @js.native
  def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
