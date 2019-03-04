package typings
package reactDashLocalizationLib.reactDashLocalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedStringsMethods extends js.Object {
  /**
    * Format the passed string replacing the numbered placeholders
    * i.e. I'd like some {0} and {1}, or just {0}
    * Use example:
    *   strings.formatString(strings.question, strings.bread, strings.butter)
    */
  def formatString[T /* <: Formatted */](str: java.lang.String, values: (T | FormatObject[T])*): (js.Array[java.lang.String | T]) | java.lang.String
  /**
    * Return an array containing the available languages passed as props in the constructor
    */
  def getAvailableLanguages(): js.Array[java.lang.String]
  /**
    * The current interface language (could differ from the language displayed)
    */
  def getInterfaceLanguage(): java.lang.String
  /**
    *  The current language displayed (could differ from the interface language
    *  if it has been forced manually and a matching translation has been found)
    */
  def getLanguage(): java.lang.String
  /**
    * Return a string with the passed key in a different language
    * @param key 
    * @param language 
    */
  def getString(key: java.lang.String, language: java.lang.String): java.lang.String
  /**
    * Replace the NamedLocalization object without reinstantiating the object
    * @param props 
    */
  def setContent(props: js.Any): scala.Unit
  /**
    * Can be used from ouside the class to force a particular language
    * indipendently from the interface one
    * @param language 
    */
  def setLanguage(language: java.lang.String): scala.Unit
}

object LocalizedStringsMethods {
  @scala.inline
  def apply(
    formatString: js.Function2[
      java.lang.String, 
      /* repeated */ js.Any | FormatObject[js.Any], 
      (js.Array[java.lang.String | js.Any]) | java.lang.String
    ],
    getAvailableLanguages: js.Function0[js.Array[java.lang.String]],
    getInterfaceLanguage: js.Function0[java.lang.String],
    getLanguage: js.Function0[java.lang.String],
    getString: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    setContent: js.Function1[js.Any, scala.Unit],
    setLanguage: js.Function1[java.lang.String, scala.Unit]
  ): LocalizedStringsMethods = {
    val __obj = js.Dynamic.literal(formatString = formatString, getAvailableLanguages = getAvailableLanguages, getInterfaceLanguage = getInterfaceLanguage, getLanguage = getLanguage, getString = getString, setContent = setContent, setLanguage = setLanguage)
  
    __obj.asInstanceOf[LocalizedStringsMethods]
  }
}

