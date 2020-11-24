package typings.psNode.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  var arguments: js.UndefOr[String | RegExp] = js.native
  
  var command: js.UndefOr[String | RegExp] = js.native
  
  var pid: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  var ppid: js.UndefOr[Double] = js.native
  
  var psargs: js.UndefOr[String | js.Array[String]] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
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
    def setArguments(value: String | RegExp): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setCommand(value: String | RegExp): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setPidVarargs(value: String*): Self = this.set("pid", js.Array(value :_*))
    
    @scala.inline
    def setPid(value: String | js.Array[String] | Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
    
    @scala.inline
    def setPpid(value: Double): Self = this.set("ppid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePpid: Self = this.set("ppid", js.undefined)
    
    @scala.inline
    def setPsargsVarargs(value: String*): Self = this.set("psargs", js.Array(value :_*))
    
    @scala.inline
    def setPsargs(value: String | js.Array[String]): Self = this.set("psargs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePsargs: Self = this.set("psargs", js.undefined)
  }
}
