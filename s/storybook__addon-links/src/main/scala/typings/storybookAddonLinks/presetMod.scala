package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-links/dist/preset", "config")
  @js.native
  def config(): js.Array[_] = js.native
  @JSImport("@storybook/addon-links/dist/preset", "config")
  @js.native
  def config(entry: js.UndefOr[scala.Nothing], hasAddDecorator: LinkOptions): js.Array[_] = js.native
  @JSImport("@storybook/addon-links/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_]): js.Array[_] = js.native
  @JSImport("@storybook/addon-links/dist/preset", "config")
  @js.native
  def config(entry: js.Array[_], hasAddDecorator: LinkOptions): js.Array[_] = js.native
  
  @JSImport("@storybook/addon-links/dist/preset", "managerEntries")
  @js.native
  def managerEntries(): js.Array[_] = js.native
  @JSImport("@storybook/addon-links/dist/preset", "managerEntries")
  @js.native
  def managerEntries(entry: js.Array[_]): js.Array[_] = js.native
  
  @js.native
  trait LinkOptions extends StObject {
    
    var addDecorator: js.UndefOr[Boolean] = js.native
  }
  object LinkOptions {
    
    @scala.inline
    def apply(): LinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkOptions]
    }
    
    @scala.inline
    implicit class LinkOptionsMutableBuilder[Self <: LinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDecorator(value: Boolean): Self = StObject.set(x, "addDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddDecoratorUndefined: Self = StObject.set(x, "addDecorator", js.undefined)
    }
  }
}
