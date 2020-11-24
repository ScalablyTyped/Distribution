package typings.servicenowLondon.snWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIRequestBody extends js.Object {
  
  val data: js.Any = js.native
  
  val dataStream: js.Object = js.native
  
  val dataString: String = js.native
  
  def hasNext(): Boolean = js.native
  
  def nextEntry(): js.Any = js.native
}
object RESTAPIRequestBody {
  
  @scala.inline
  def apply(
    data: js.Any,
    dataStream: js.Object,
    dataString: String,
    hasNext: () => Boolean,
    nextEntry: () => js.Any
  ): RESTAPIRequestBody = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any], hasNext = js.Any.fromFunction0(hasNext), nextEntry = js.Any.fromFunction0(nextEntry))
    __obj.asInstanceOf[RESTAPIRequestBody]
  }
  
  @scala.inline
  implicit class RESTAPIRequestBodyOps[Self <: RESTAPIRequestBody] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStream(value: js.Object): Self = this.set("dataStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataString(value: String): Self = this.set("dataString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNext(value: () => Boolean): Self = this.set("hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextEntry(value: () => js.Any): Self = this.set("nextEntry", js.Any.fromFunction0(value))
  }
}
