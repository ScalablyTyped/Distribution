package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autostart extends js.Object {
  
  var autostart: Boolean = js.native
  
  var evictionRunIntervalMillis: Double = js.native
  
  var idleTimeoutMillis: Double = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var testOnBorrow: Boolean = js.native
}
object Autostart {
  
  @scala.inline
  def apply(
    autostart: Boolean,
    evictionRunIntervalMillis: Double,
    idleTimeoutMillis: Double,
    max: Double,
    min: Double,
    testOnBorrow: Boolean
  ): Autostart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], evictionRunIntervalMillis = evictionRunIntervalMillis.asInstanceOf[js.Any], idleTimeoutMillis = idleTimeoutMillis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], testOnBorrow = testOnBorrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autostart]
  }
  
  @scala.inline
  implicit class AutostartOps[Self <: Autostart] (val x: Self) extends AnyVal {
    
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
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = this.set("evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = this.set("testOnBorrow", value.asInstanceOf[js.Any])
  }
}
