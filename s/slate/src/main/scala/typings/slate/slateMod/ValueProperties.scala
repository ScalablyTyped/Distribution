package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProperties extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var decorations: js.UndefOr[List[Decoration] | Null] = js.undefined
  var document: js.UndefOr[Document[StringDictionary[_]]] = js.undefined
  var selection: js.UndefOr[Selection] = js.undefined
}

object ValueProperties {
  @scala.inline
  def apply(
    data: Data = null,
    decorations: List[Decoration] = null,
    document: Document[StringDictionary[_]] = null,
    selection: Selection = null
  ): ValueProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (decorations != null) __obj.updateDynamic("decorations")(decorations)
    if (document != null) __obj.updateDynamic("document")(document)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[ValueProperties]
  }
}

