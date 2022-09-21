package typings.prettier

import typings.prettier.anon.Angular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserHtmlMod {
  
  @JSImport("prettier/parser-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-html", "parsers")
  @js.native
  def parsers: Angular = js.native
  inline def parsers_=(x: Angular): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
