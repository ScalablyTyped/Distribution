package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorLanguage extends js.Object {
  val language: java.lang.String
  val languages: ReadonlyArray[java.lang.String]
}

object NavigatorLanguage {
  @scala.inline
  def apply(language: java.lang.String, languages: ReadonlyArray[java.lang.String]): NavigatorLanguage = {
    val __obj = js.Dynamic.literal(language = language, languages = languages)
  
    __obj.asInstanceOf[NavigatorLanguage]
  }
}

