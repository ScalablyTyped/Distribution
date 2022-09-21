package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorLanguage extends StObject {
  
  /* standard dom */
  val language: java.lang.String
  
  /* standard dom */
  val languages: js.Array[java.lang.String]
}
object NavigatorLanguage {
  
  inline def apply(language: java.lang.String, languages: js.Array[java.lang.String]): NavigatorLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorLanguage]
  }
  
  extension [Self <: NavigatorLanguage](x: Self) {
    
    inline def setLanguage(value: java.lang.String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: js.Array[java.lang.String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: java.lang.String*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
