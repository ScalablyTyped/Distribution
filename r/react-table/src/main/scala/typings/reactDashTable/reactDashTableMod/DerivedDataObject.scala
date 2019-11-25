package typings.reactDashTable.reactDashTableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerivedDataObject
  extends /* p */ StringDictionary[js.Any] {
  var _index: Double
  var _nestingLevel: Double
  var _original: js.Any
  var _subRows: js.Any
}

object DerivedDataObject {
  @scala.inline
  def apply(
    _index: Double,
    _nestingLevel: Double,
    _original: js.Any,
    _subRows: js.Any,
    StringDictionary: /* p */ StringDictionary[js.Any] = null
  ): DerivedDataObject = {
    val __obj = js.Dynamic.literal(_index = _index.asInstanceOf[js.Any], _nestingLevel = _nestingLevel.asInstanceOf[js.Any], _original = _original.asInstanceOf[js.Any], _subRows = _subRows.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DerivedDataObject]
  }
}

