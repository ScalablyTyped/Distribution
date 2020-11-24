package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryData extends js.Object {
  
  var entries: HistoryEntries = js.native
  
  var index: Double = js.native
  
  var length: Double = js.native
}
object HistoryData {
  
  @scala.inline
  def apply(entries: HistoryEntries, index: Double, length: Double): HistoryData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryData]
  }
  
  @scala.inline
  implicit class HistoryDataOps[Self <: HistoryData] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: Pathname*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: HistoryEntries): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
