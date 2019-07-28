package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndecoratedTableProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with DOMAttributes[UndecoratedTable]
     with ShadowedComponent {
  var name: js.UndefOr[String] = js.undefined
  var rowKeyColumn: js.UndefOr[String] = js.undefined
  var rows: js.Array[_]
  var title: js.UndefOr[String] = js.undefined
}

object UndecoratedTableProps {
  @scala.inline
  def apply(
    rows: js.Array[_],
    ClassAttributes: ClassAttributes[js.Any] = null,
    DOMAttributes: DOMAttributes[UndecoratedTable] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    ShadowedComponent: ShadowedComponent = null,
    name: String = null,
    rowKeyColumn: String = null,
    title: String = null
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

