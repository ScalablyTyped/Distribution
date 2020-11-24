package typings.storybookUi.sidebarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedDataset extends js.Object {
  
  var entries: js.Array[js.Tuple2[String, RefType]] = js.native
  
  var hash: Refs = js.native
}
object CombinedDataset {
  
  @scala.inline
  def apply(entries: js.Array[js.Tuple2[String, RefType]], hash: Refs): CombinedDataset = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedDataset]
  }
  
  @scala.inline
  implicit class CombinedDatasetOps[Self <: CombinedDataset] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: (js.Tuple2[String, RefType])*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[js.Tuple2[String, RefType]]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Refs): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
}
