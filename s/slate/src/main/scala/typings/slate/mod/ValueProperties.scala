package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Map
import typings.slate.slateStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProperties extends js.Object {
  var annotations: js.UndefOr[(Map[String, Annotation]) | StringDictionary[AnnotationJSON]] = js.undefined
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
  var `object`: js.UndefOr[value] = js.undefined
  var selection: js.UndefOr[Selection] = js.undefined
}

object ValueProperties {
  @scala.inline
  def apply(
    annotations: (Map[String, Annotation]) | StringDictionary[AnnotationJSON] = null,
    data: Data | StringDictionary[js.Any] = null,
    document: Document = null,
    `object`: value = null,
    selection: Selection = null
  ): ValueProperties = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProperties]
  }
}

