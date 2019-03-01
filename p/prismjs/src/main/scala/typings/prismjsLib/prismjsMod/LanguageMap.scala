package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageMap
  extends /** Get a defined language's definition */
/* key */ org.scalablytyped.runtime.StringDictionary[LanguageDefinition]

object LanguageMap {
  @scala.inline
  def apply(
    StringDictionary: /** Get a defined language's definition */
  /* key */ org.scalablytyped.runtime.StringDictionary[LanguageDefinition] = null
  ): LanguageMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LanguageMap]
  }
}

