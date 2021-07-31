package typings.storybookAddonActions

import typings.storybookAddonActions.anon.Action
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decorateActionMod {
  
  @JSImport("@storybook/addon-actions/dist/preview/decorateAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Action]]
  
  @scala.inline
  def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateAction")(_decorators.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
