package typings.prettier

import typings.prettier.anon.Espree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserEspreeMod {
  
  @JSImport("prettier/parser-espree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-espree", "parsers")
  @js.native
  def parsers: Espree = js.native
  inline def parsers_=(x: Espree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
