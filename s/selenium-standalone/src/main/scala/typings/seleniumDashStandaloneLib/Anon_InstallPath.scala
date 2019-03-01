package typings
package seleniumDashStandaloneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstallPath
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var installPath: java.lang.String
}

object Anon_InstallPath {
  @scala.inline
  def apply(
    installPath: java.lang.String,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_InstallPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("installPath")(installPath)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_InstallPath]
  }
}

