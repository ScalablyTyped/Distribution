package typings.sqlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandPhrasesMod {
  
  @JSImport("sql-formatter/lib/src/expandPhrases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandPhrases(phrases: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPhrases")(phrases.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def expandSinglePhrase(phrase: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandSinglePhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
