package typings.seleniumStandalone.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  var installPath: String
}

object Dictx {
  @scala.inline
  def apply(installPath: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictx = {
    val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictx]
  }
}

