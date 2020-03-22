package typings.seleniumStandalone

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictx
  extends /* x */ StringDictionary[js.Any] {
  var installPath: String
}

object AnonDictx {
  @scala.inline
  def apply(installPath: String, StringDictionary: /* x */ StringDictionary[js.Any] = null): AnonDictx = {
    val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictx]
  }
}

