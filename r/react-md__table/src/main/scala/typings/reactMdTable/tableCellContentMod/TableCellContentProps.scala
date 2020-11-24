package typings.reactMdTable.tableCellContentMod

import typings.react.mod.CSSProperties
import typings.reactMdIcon.textIconSpacingMod.TextIconSpacingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellContentProps extends TextIconSpacingProps {
  
  /**
    * An optional id for the sort order button.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the icon should be rotated.
    */
  var rotated: js.UndefOr[Boolean] = js.native
  
  /**
    * The current sort order for this cell. Setting this to `null` will prevent
    * the button from being rendered.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.native
  
  /**
    * An optional style for the sort order button.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}
object TableCellContentProps {
  
  @scala.inline
  def apply(): TableCellContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellContentProps]
  }
  
  @scala.inline
  implicit class TableCellContentPropsOps[Self <: TableCellContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRotated(value: Boolean): Self = this.set("rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotated: Self = this.set("rotated", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
