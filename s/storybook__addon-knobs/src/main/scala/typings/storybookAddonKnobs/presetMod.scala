package typings.storybookAddonKnobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-knobs/dist/preset", "config")
  @js.native
  def config(): js.Array[_] = js.native
  @JSImport("@storybook/addon-knobs/dist/preset", "config")
  @js.native
  def config(entry: js.UndefOr[scala.Nothing], hasAddDecorator: KnobsOptions): js.Array[_] = js.native
  @JSImport("@storybook/addon-knobs/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_]): js.Array[_] = js.native
  @JSImport("@storybook/addon-knobs/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_], hasAddDecorator: KnobsOptions): js.Array[_] = js.native
  
  @JSImport("@storybook/addon-knobs/dist/preset", "managerEntries")
  @js.native
  def managerEntries(entry: js.UndefOr[scala.Nothing], options: js.Any): js.Array[_] = js.native
  @JSImport("@storybook/addon-knobs/dist/preset", "managerEntries")
  @js.native
  def managerEntries(entry: js.Array[_], options: js.Any): js.Array[_] = js.native
  
  @js.native
  trait KnobsOptions extends StObject {
    
    var addDecorator: js.UndefOr[Boolean] = js.native
  }
  object KnobsOptions {
    
    @scala.inline
    def apply(): KnobsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnobsOptions]
    }
    
    @scala.inline
    implicit class KnobsOptionsMutableBuilder[Self <: KnobsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDecorator(value: Boolean): Self = StObject.set(x, "addDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddDecoratorUndefined: Self = StObject.set(x, "addDecorator", js.undefined)
    }
  }
}
