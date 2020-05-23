package typings.resolve.mod

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
  def apply(name: String, version: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): PackageMeta = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PackageMeta]
  }
}

