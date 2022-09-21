package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale
  extends StObject
     with LocaleOptions {
  
  /** A string containing the language, and the script and region if available. */
  /* standard es2020.intl */
  @JSName("baseName")
  var baseName_Locale: String
  
  /** The primary language subtag associated with the locale. */
  /* standard es2020.intl */
  @JSName("language")
  var language_Locale: String
  
  /** Gets the most likely values for the language, script, and region of the locale based on existing values. */
  /* standard es2020.intl */
  def maximize(): Locale
  
  /** Attempts to remove information about the locale that would be added by calling `Locale.maximize()`. */
  /* standard es2020.intl */
  def minimize(): Locale
}
object Locale {
  
  inline def apply(baseName: String, language: String, maximize: () => Locale, minimize: () => Locale): Locale = {
    val __obj = js.Dynamic.literal(baseName = baseName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], maximize = js.Any.fromFunction0(maximize), minimize = js.Any.fromFunction0(minimize))
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setMaximize(value: () => Locale): Self = StObject.set(x, "maximize", js.Any.fromFunction0(value))
    
    inline def setMinimize(value: () => Locale): Self = StObject.set(x, "minimize", js.Any.fromFunction0(value))
  }
}
