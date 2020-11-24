package typings.spectacle.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends js.Object {
  
  var from: Record[String, Double | String] = js.native
  
  var to: Record[String, Double | String] = js.native
}
object From {
  
  @scala.inline
  def apply(from: Record[String, Double | String], to: Record[String, Double | String]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Record[String, Double | String]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Record[String, Double | String]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
