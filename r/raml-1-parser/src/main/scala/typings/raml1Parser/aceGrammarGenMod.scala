package typings.raml1Parser

import typings.ramlDefinitionSystem.ramlDefinitionSystemMod.Universe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aceGrammarGenMod {
  
  @JSImport("raml-1-parser/dist/parser/tools/grammargen/aceGrammarGen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeGrammar(u: Universe): String = ^.asInstanceOf[js.Dynamic].applyDynamic("composeGrammar")(u.asInstanceOf[js.Any]).asInstanceOf[String]
}
