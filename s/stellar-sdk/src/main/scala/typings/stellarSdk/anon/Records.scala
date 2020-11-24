package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Records[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  
  var records: js.Array[T] = js.native
}
object Records {
  
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](records: js.Array[T]): Records[T] = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Records[T]]
  }
  
  @scala.inline
  implicit class RecordsOps[Self <: Records[_], T /* <: BaseResponse[scala.Nothing] */] (val x: Self with Records[T]) extends AnyVal {
    
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
    def setRecordsVarargs(value: T*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[T]): Self = this.set("records", value.asInstanceOf[js.Any])
  }
}
