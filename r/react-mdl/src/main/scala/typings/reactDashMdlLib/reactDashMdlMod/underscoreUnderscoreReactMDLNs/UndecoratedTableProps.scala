package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndecoratedTableProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[UndecoratedTable]
     with ShadowedComponent {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rowKeyColumn: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.Array[_]
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UndecoratedTableProps {
  @scala.inline
  def apply(
    rows: js.Array[_],
    ClassAttributes: reactLib.reactMod.ReactNs.ClassAttributes[js.Any] = null,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[UndecoratedTable] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    ShadowedComponent: ShadowedComponent = null,
    name: java.lang.String = null,
    rowKeyColumn: java.lang.String = null,
    title: java.lang.String = null
  ): UndecoratedTableProps = {
    val __obj = js.Dynamic.literal(rows = rows)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rowKeyColumn != null) __obj.updateDynamic("rowKeyColumn")(rowKeyColumn)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UndecoratedTableProps]
  }
}

