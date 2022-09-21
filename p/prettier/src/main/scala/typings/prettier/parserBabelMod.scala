package typings.prettier

import typings.prettier.anon.Babel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserBabelMod {
  
  @JSImport("prettier/parser-babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-babel", "parsers")
  @js.native
  def parsers: Babel = js.native
  inline def parsers_=(x: Babel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
