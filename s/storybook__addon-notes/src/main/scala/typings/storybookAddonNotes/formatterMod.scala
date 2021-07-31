package typings.storybookAddonNotes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("@storybook/addon-notes/dist/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatter(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
}
