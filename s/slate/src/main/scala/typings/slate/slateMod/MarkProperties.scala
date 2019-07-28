package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkProperties extends js.Object {
  var data: js.UndefOr[(Map[String, _]) | StringDictionary[js.Any]] = js.undefined
  var `type`: String
}

object MarkProperties {
  @scala.inline
  def apply(`type`: String, data: (Map[String, _]) | StringDictionary[js.Any] = null): MarkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkProperties]
  }
}

