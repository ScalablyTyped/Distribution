package typings.prettier

import typings.prettier.anon.Css
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserPostcssMod {
  
  @JSImport("prettier/parser-postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-postcss", "parsers")
  @js.native
  def parsers: Css = js.native
  inline def parsers_=(x: Css): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
