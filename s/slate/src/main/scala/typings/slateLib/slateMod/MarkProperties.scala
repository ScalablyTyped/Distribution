package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkProperties extends js.Object {
  var data: js.UndefOr[
    (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  var `type`: java.lang.String
}

object MarkProperties {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    data: (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): MarkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkProperties]
  }
}

