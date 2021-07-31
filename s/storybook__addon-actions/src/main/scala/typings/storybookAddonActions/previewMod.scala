package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.anon.Action
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/addon-actions/dist/preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def action(name: String): HandlerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any]).asInstanceOf[HandlerFunction]
  @scala.inline
  def action(name: String, options: ActionOptions): HandlerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlerFunction]
  
  @JSImport("@storybook/addon-actions/dist/preview", "actions")
  @js.native
  val actions: ActionsFunction = js.native
  
  @JSImport("@storybook/addon-actions/dist/preview", "config")
  @js.native
  val config: ActionOptions = js.native
  
  @scala.inline
  def configureActions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")().asInstanceOf[Unit]
  @scala.inline
  def configureActions(options: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Action]]
  
  @scala.inline
  def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateAction")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withActions")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
