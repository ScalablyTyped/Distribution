package typings
package resolveLib.resolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageMeta
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var name: java.lang.String
  var version: java.lang.String
}

object PackageMeta {
  @scala.inline
  def apply(
    name: java.lang.String,
    version: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): PackageMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PackageMeta]
  }
}

