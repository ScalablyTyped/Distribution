package typings.reactMasonryLayout.mod.ReactMasonryLayoutExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasonryLayoutSizes extends js.Object {
  
  /**
    * the number of vertical columns
    */
  var columns: Double = js.native
  
  /**
    * the space (in px) between the columns and grid items
    */
  var gutter: Double = js.native
  
  /**
    * the minimum viewport width (String CSS unit: em, px, rem)
    */
  var mq: js.UndefOr[String] = js.native
}
object MasonryLayoutSizes {
  
  @scala.inline
  def apply(columns: Double, gutter: Double): MasonryLayoutSizes = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryLayoutSizes]
  }
  
  @scala.inline
  implicit class MasonryLayoutSizesOps[Self <: MasonryLayoutSizes] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMq(value: String): Self = this.set("mq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMq: Self = this.set("mq", js.undefined)
  }
}
