package typings.storybookAddonNotes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/addon-notes/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withMarkdownNotes(text: String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withMarkdownNotes")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withNotes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withNotes")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
