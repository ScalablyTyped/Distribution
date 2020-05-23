package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictparameterName
  extends /* key */ StringDictionary[js.Any] {
  var filename: String
  var options: Dictkey
}

object DictparameterName {
  @scala.inline
  def apply(filename: String, options: Dictkey, StringDictionary: /* name */ StringDictionary[js.Any] = null): DictparameterName = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictparameterName]
  }
}

