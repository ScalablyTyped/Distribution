package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFTPStreamConfig extends StObject {
  
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, Any]] = js.undefined
  
  /**
    * This is the highWaterMark to use for the stream.
    */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.undefined
}
object SFTPStreamConfig {
  
  inline def apply(): SFTPStreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFTPStreamConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFTPStreamConfig] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* information */ String => Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setServer(value: Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
