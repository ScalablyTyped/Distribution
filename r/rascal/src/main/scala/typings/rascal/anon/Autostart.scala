package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autostart extends StObject {
  
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
  implicit class AutostartMutableBuilder[Self <: Autostart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
  }
}
