package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkJSON extends js.Object {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var `object`: slateLib.slateLibStrings.mark
  var `type`: java.lang.String
}

object MarkJSON {
  @scala.inline
  def apply(
    `object`: slateLib.slateLibStrings.mark,
    `type`: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): MarkJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[MarkJSON]
  }
}

