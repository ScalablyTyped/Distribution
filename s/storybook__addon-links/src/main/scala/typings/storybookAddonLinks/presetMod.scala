package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-links/dist/preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[js.Array[js.Any]]
  inline def config(entry: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def config(entry: js.Array[js.Any], hasAddDecorator: LinkOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any], hasAddDecorator.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def config(entry: Unit, hasAddDecorator: LinkOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any], hasAddDecorator.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def managerEntries(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")().asInstanceOf[js.Array[js.Any]]
  inline def managerEntries(entry: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  trait LinkOptions extends StObject {
    
    var addDecorator: js.UndefOr[Boolean] = js.undefined
  }
  object LinkOptions {
    
    inline def apply(): LinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkOptions]
    }
    
    extension [Self <: LinkOptions](x: Self) {
      
      inline def setAddDecorator(value: Boolean): Self = StObject.set(x, "addDecorator", value.asInstanceOf[js.Any])
      
      inline def setAddDecoratorUndefined: Self = StObject.set(x, "addDecorator", js.undefined)
    }
  }
}
