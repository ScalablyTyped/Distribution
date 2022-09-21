package typings.prettier

import typings.prettier.anon.Flow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserFlowMod {
  
  @JSImport("prettier/parser-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-flow", "parsers")
  @js.native
  def parsers: Flow = js.native
  inline def parsers_=(x: Flow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
