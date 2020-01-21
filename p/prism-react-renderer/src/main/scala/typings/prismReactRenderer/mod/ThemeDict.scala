package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeDict extends /* type */ StringDictionary[StyleObj] {
  var plain: StyleObj
  var root: StyleObj
}

object ThemeDict {
  @scala.inline
  def apply(plain: StyleObj, root: StyleObj, StringDictionary: /* type */ StringDictionary[StyleObj] = null): ThemeDict = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ThemeDict]
  }
}

