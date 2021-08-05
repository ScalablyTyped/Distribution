package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.anon.Action
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def action(name: String): HandlerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any]).asInstanceOf[HandlerFunction]
  inline def action(name: String, options: ActionOptions): HandlerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlerFunction]
  
  @JSImport("@storybook/addon-actions", "actions")
  @js.native
  val actions: ActionsFunction = js.native
  
  @JSImport("@storybook/addon-actions", "config")
  @js.native
  val config: ActionOptions = js.native
  
  inline def configureActions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")().asInstanceOf[Unit]
  inline def configureActions(options: ActionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureActions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Action]]
  
  inline def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateAction")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withActions")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
