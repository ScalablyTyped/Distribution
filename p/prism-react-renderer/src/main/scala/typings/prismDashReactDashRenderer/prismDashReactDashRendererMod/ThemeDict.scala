package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

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
    val __obj = js.Dynamic.literal(plain = plain, root = root)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ThemeDict]
  }
}

