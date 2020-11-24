package typings.rusha.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RushaWorkerRequest extends js.Object {
  
  var data: String | js.Array[Double] | ArrayBuffer | Buffer | Blob = js.native
  
  var id: String = js.native
}
object RushaWorkerRequest {
  
  @scala.inline
  def apply(data: String | js.Array[Double] | ArrayBuffer | Buffer | Blob, id: String): RushaWorkerRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RushaWorkerRequest]
  }
  
  @scala.inline
  implicit class RushaWorkerRequestOps[Self <: RushaWorkerRequest] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Double*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | js.Array[Double] | ArrayBuffer | Buffer | Blob): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
