package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelPoolConfig extends StObject {
  
  var autostart: js.UndefOr[Boolean] = js.native
  
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var testOnBorrow: js.UndefOr[Boolean] = js.native
}
object ChannelPoolConfig {
  
  @scala.inline
  def apply(): ChannelPoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelPoolConfig]
  }
  
  @scala.inline
  implicit class ChannelPoolConfigMutableBuilder[Self <: ChannelPoolConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
  }
}
