package typings.resolve.resolveMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageMeta
  extends /* key */ StringDictionary[js.Any] {
  var name: String
  var version: String
}

object PackageMeta {
  @scala.inline
  def apply(name: String, version: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): PackageMeta = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PackageMeta]
  }
}

