package typings.storybookAddonOptions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/addon-options/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setOptions(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withOptions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
