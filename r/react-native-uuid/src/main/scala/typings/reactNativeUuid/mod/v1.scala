package typings.reactNativeUuid.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait v1 extends js.Object {
  
  var clockseq: Double = js.native
  
  var msecs: Double | Date = js.native
  
  var node: js.Array[Double] = js.native
  
  var nsecs: Double = js.native
}
object v1 {
  
  @scala.inline
  def apply(clockseq: Double, msecs: Double | Date, node: js.Array[Double], nsecs: Double): v1 = {
    val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[v1]
  }
  
  @scala.inline
  implicit class v1Ops[Self <: v1] (val x: Self) extends AnyVal {
    
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
    def setClockseq(value: Double): Self = this.set("clockseq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsecs(value: Double | Date): Self = this.set("msecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeVarargs(value: Double*): Self = this.set("node", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: js.Array[Double]): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsecs(value: Double): Self = this.set("nsecs", value.asInstanceOf[js.Any])
  }
}
