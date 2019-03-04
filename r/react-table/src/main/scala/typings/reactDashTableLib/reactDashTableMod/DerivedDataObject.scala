package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerivedDataObject
  extends /* p */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _index: scala.Double
  var _nestingLevel: scala.Double
  var _original: js.Any
  var _subRows: js.Any
}

object DerivedDataObject {
  @scala.inline
  def apply(
    _index: scala.Double,
    _nestingLevel: scala.Double,
    _original: js.Any,
    _subRows: js.Any,
    StringDictionary: /* p */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DerivedDataObject = {
    val __obj = js.Dynamic.literal(_index = _index, _nestingLevel = _nestingLevel, _original = _original, _subRows = _subRows)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DerivedDataObject]
  }
}

