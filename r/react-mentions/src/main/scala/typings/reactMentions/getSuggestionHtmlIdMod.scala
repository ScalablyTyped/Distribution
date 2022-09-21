package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSuggestionHtmlIdMod {
  
  @JSImport("react-mentions/lib/utils/getSuggestionHtmlId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSuggestionHtmlId(prefix: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionHtmlId")(prefix.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSuggestionHtmlId(prefix: String, id: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionHtmlId")(prefix.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
}
