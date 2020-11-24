package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.ISourceKeyRecord
import typings.qlikEngineapi.EngineAPI.ITableRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Qk extends js.Object {
  
  var qk: js.Array[ISourceKeyRecord] = js.native
  
  var qtr: js.Array[ITableRecord] = js.native
}
object Qk {
  
  @scala.inline
  def apply(qk: js.Array[ISourceKeyRecord], qtr: js.Array[ITableRecord]): Qk = {
    val __obj = js.Dynamic.literal(qk = qk.asInstanceOf[js.Any], qtr = qtr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qk]
  }
  
  @scala.inline
  implicit class QkOps[Self <: Qk] (val x: Self) extends AnyVal {
    
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
    def setQkVarargs(value: ISourceKeyRecord*): Self = this.set("qk", js.Array(value :_*))
    
    @scala.inline
    def setQk(value: js.Array[ISourceKeyRecord]): Self = this.set("qk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQtrVarargs(value: ITableRecord*): Self = this.set("qtr", js.Array(value :_*))
    
    @scala.inline
    def setQtr(value: js.Array[ITableRecord]): Self = this.set("qtr", value.asInstanceOf[js.Any])
  }
}
