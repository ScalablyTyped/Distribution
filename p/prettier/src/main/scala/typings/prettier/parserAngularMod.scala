package typings.prettier

import typings.prettier.anon.Ngaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserAngularMod {
  
  @JSImport("prettier/parser-angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-angular", "parsers")
  @js.native
  def parsers: Ngaction = js.native
  inline def parsers_=(x: Ngaction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
