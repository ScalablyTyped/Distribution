package typings.storybookAddonJest

import typings.storybookAddonJest.anon.Disabled
import typings.storybookAddons.distTs3Dot9TypesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9SharedMod {
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/shared", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/test" */ String = js.native
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/shared", "ADD_TESTS")
  @js.native
  val ADD_TESTS: String = js.native
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/shared", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/shared", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "test" */ String = js.native
  
  inline def defineJestParameter(parameters: AddonParameters): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defineJestParameter")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  
  trait AddonParameters
    extends StObject
       with Parameters {
    
    var jest: js.UndefOr[String | js.Array[String] | Disabled] = js.undefined
  }
  object AddonParameters {
    
    inline def apply(): AddonParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddonParameters]
    }
    
    extension [Self <: AddonParameters](x: Self) {
      
      inline def setJest(value: String | js.Array[String] | Disabled): Self = StObject.set(x, "jest", value.asInstanceOf[js.Any])
      
      inline def setJestUndefined: Self = StObject.set(x, "jest", js.undefined)
      
      inline def setJestVarargs(value: String*): Self = StObject.set(x, "jest", js.Array(value*))
    }
  }
}
