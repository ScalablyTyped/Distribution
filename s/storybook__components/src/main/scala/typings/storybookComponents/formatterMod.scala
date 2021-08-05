package typings.storybookComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("@storybook/components/dist/syntaxhighlighter/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatter(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
}
