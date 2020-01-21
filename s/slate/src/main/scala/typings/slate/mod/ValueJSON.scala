package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueJSON extends js.Object {
  var annotations: js.UndefOr[StringDictionary[AnnotationJSON]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var document: js.UndefOr[DocumentJSON] = js.undefined
  var `object`: js.UndefOr[value] = js.undefined
  var selection: js.UndefOr[SelectionJSON] = js.undefined
}

object ValueJSON {
  @scala.inline
  def apply(
    annotations: StringDictionary[AnnotationJSON] = null,
    data: StringDictionary[js.Any] = null,
    document: DocumentJSON = null,
    `object`: value = null,
    selection: SelectionJSON = null
  ): ValueJSON = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueJSON]
  }
}

