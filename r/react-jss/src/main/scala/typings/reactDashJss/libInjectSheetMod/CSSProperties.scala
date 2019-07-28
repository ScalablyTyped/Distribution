package typings.reactDashJss.libInjectSheetMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperties[Props] extends // Allow pseudo selectors and media queries
/* k */ StringDictionary[DynamicCSSRule[Props] | CSSProperties[Props]]

object CSSProperties {
  @scala.inline
  def apply[Props](
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ StringDictionary[DynamicCSSRule[Props] | CSSProperties[Props]] = null
  ): CSSProperties[Props] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSProperties[Props]]
  }
}

