package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RangyClassApplierOptions extends js.Object {
  var applyToEditableOnly: js.UndefOr[scala.Boolean] = js.undefined
  var elementAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var elementProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var elementTagName: js.UndefOr[java.lang.String] = js.undefined
  var ignoreWhiteSpace: js.UndefOr[scala.Boolean] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var onElementCreate: js.UndefOr[
    js.Function2[/* element */ stdLib.Element, /* classApplier */ RangyClassApplier, scala.Unit]
  ] = js.undefined
  var tagNames: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var useExistingElements: js.UndefOr[scala.Boolean] = js.undefined
}

