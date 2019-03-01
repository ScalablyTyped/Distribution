package typings
package reactDashTextDashMaskLib.reactDashTextDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait conformToMaskResult extends js.Object {
  var conformedValue: java.lang.String
  var meta: reactDashTextDashMaskLib.Anon_SomeCharsRejected
}

object conformToMaskResult {
  @scala.inline
  def apply(conformedValue: java.lang.String, meta: reactDashTextDashMaskLib.Anon_SomeCharsRejected): conformToMaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conformedValue")(conformedValue)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[conformToMaskResult]
  }
}

