package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("@storybook/addon-actions/dist/preview/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def action(name: String): HandlerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any]).asInstanceOf[HandlerFunction]
  inline def action(name: String, options: ActionOptions): HandlerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlerFunction]
}
