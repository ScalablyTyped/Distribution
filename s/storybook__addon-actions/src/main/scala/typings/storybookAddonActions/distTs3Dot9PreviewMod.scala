package typings.storybookAddonActions

import typings.storybookAddonActions.anon.Action
import typings.storybookAddonActions.distTs3Dot9ModelsActionOptionsMod.ActionOptions
import typings.storybookAddonActions.distTs3Dot9ModelsActionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.distTs3Dot9ModelsDecoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.distTs3Dot9ModelsHandlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def action(name: String): HandlerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any]).asInstanceOf[HandlerFunction]
  inline def action(name: String, options: ActionOptions): HandlerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlerFunction]
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview", "actions")
  @js.native
  val actions: ActionsFunction = js.native
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview", "config")
  @js.native
  val config: ActionOptions = js.native
  
  inline def configureActions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")().asInstanceOf[Unit]
  inline def configureActions(options: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Action]]
  
  inline def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateAction")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withActions")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
