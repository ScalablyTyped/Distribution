package typings.prettier

import typings.prettier.anon.Meriyah
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMeriyahMod {
  
  @JSImport("prettier/parser-meriyah", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-meriyah", "parsers")
  @js.native
  def parsers: Meriyah = js.native
  inline def parsers_=(x: Meriyah): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
