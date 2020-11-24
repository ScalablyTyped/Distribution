package typings.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding extends js.Object {
  
  var args: js.UndefOr[js.Object] = js.native
  
  var destination: Exchange | Queue = js.native
  
  var routingPattern: js.UndefOr[String] = js.native
  
  var source: Exchange = js.native
}
object Binding {
  
  @scala.inline
  def apply(destination: Exchange | Queue, source: Exchange): Binding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Exchange | Queue): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Exchange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: js.Object): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setRoutingPattern(value: String): Self = this.set("routingPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingPattern: Self = this.set("routingPattern", js.undefined)
  }
}
