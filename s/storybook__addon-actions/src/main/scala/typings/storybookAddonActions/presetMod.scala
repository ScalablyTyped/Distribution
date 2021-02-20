package typings.storybookAddonActions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-actions/dist/preset", "config")
  @js.native
  def config(): js.Array[_] = js.native
  @JSImport("@storybook/addon-actions/dist/preset", "config")
  @js.native
  def config(entry: js.UndefOr[scala.Nothing], hasAddDecorator: ActionsOptions): js.Array[_] = js.native
  @JSImport("@storybook/addon-actions/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_]): js.Array[_] = js.native
  @JSImport("@storybook/addon-actions/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_], hasAddDecorator: ActionsOptions): js.Array[_] = js.native
  
  @JSImport("@storybook/addon-actions/dist/preset", "managerEntries")
  @js.native
  def managerEntries(entry: js.Array[_], options: js.Any): js.Array[_] = js.native
  
  @js.native
  trait ActionsOptions extends StObject {
    
    var addDecorator: js.UndefOr[Boolean] = js.native
  }
  object ActionsOptions {
    
    @scala.inline
    def apply(): ActionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionsOptions]
    }
    
    @scala.inline
    implicit class ActionsOptionsMutableBuilder[Self <: ActionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDecorator(value: Boolean): Self = StObject.set(x, "addDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddDecoratorUndefined: Self = StObject.set(x, "addDecorator", js.undefined)
    }
  }
}
