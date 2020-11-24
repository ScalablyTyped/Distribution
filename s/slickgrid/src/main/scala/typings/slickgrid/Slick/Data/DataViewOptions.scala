package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataViewOptions[T /* <: SlickData */] extends js.Object {
  
  var groupItemMetadataProvider: js.UndefOr[GroupItemMetadataProvider[T]] = js.native
  
  var inlineFilters: js.UndefOr[Boolean] = js.native
}
object DataViewOptions {
  
  @scala.inline
  def apply[T /* <: SlickData */](): DataViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewOptions[T]]
  }
  
  @scala.inline
  implicit class DataViewOptionsOps[Self <: DataViewOptions[_], T /* <: SlickData */] (val x: Self with DataViewOptions[T]) extends AnyVal {
    
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
    def setGroupItemMetadataProvider(value: GroupItemMetadataProvider[T]): Self = this.set("groupItemMetadataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupItemMetadataProvider: Self = this.set("groupItemMetadataProvider", js.undefined)
    
    @scala.inline
    def setInlineFilters(value: Boolean): Self = this.set("inlineFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineFilters: Self = this.set("inlineFilters", js.undefined)
  }
}
