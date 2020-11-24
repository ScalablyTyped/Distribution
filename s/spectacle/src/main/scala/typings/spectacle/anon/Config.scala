package typings.spectacle.anon

import typings.spectacle.mod.TransitionEffect
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends TransitionEffect {
  
  var config: Record[String, Double | String] = js.native
  
  var enter: Record[String, Double | String] = js.native
  
  var from: Record[String, Double | String] = js.native
  
  var leave: Record[String, Double | String] = js.native
}
object Config {
  
  @scala.inline
  def apply(
    config: Record[String, Double | String],
    enter: Record[String, Double | String],
    from: Record[String, Double | String],
    leave: Record[String, Double | String]
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: Record[String, Double | String]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: Record[String, Double | String]): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Record[String, Double | String]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeave(value: Record[String, Double | String]): Self = this.set("leave", value.asInstanceOf[js.Any])
  }
}
