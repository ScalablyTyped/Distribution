package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueJSON extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var decorations: js.UndefOr[immutableLib.immutableMod.List[Decoration] | scala.Null] = js.undefined
  var document: js.UndefOr[DocumentJSON] = js.undefined
  var `object`: js.UndefOr[slateLib.slateLibStrings.value] = js.undefined
  var selection: js.UndefOr[Selection] = js.undefined
}

object ValueJSON {
  @scala.inline
  def apply(
    data: Data = null,
    decorations: immutableLib.immutableMod.List[Decoration] = null,
    document: DocumentJSON = null,
    `object`: slateLib.slateLibStrings.value = null,
    selection: Selection = null
  ): ValueJSON = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (decorations != null) __obj.updateDynamic("decorations")(decorations)
    if (document != null) __obj.updateDynamic("document")(document)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[ValueJSON]
  }
}

