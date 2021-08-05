package typings.storybookAddonKnobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-knobs/dist/preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[js.Array[js.Any]]
  inline def config(entry: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def config(entry: js.Array[js.Any], hasAddDecorator: KnobsOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any], hasAddDecorator.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def config(entry: Unit, hasAddDecorator: KnobsOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(entry.asInstanceOf[js.Any], hasAddDecorator.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def managerEntries(entry: js.Array[js.Any], options: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def managerEntries(entry: Unit, options: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  trait KnobsOptions extends StObject {
    
    var addDecorator: js.UndefOr[Boolean] = js.undefined
  }
  object KnobsOptions {
    
    inline def apply(): KnobsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnobsOptions]
    }
    
    extension [Self <: KnobsOptions](x: Self) {
      
      inline def setAddDecorator(value: Boolean): Self = StObject.set(x, "addDecorator", value.asInstanceOf[js.Any])
      
      inline def setAddDecoratorUndefined: Self = StObject.set(x, "addDecorator", js.undefined)
    }
  }
}
