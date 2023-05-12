package typings.remixRunWebFetch

import typings.remixRunWebFetch.distSrcErrorsBaseMod.FetchBaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsFetchErrorMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/errors/fetch-error", "FetchError")
  @js.native
  open class FetchError protected () extends FetchBaseError {
    /**
      * @param  {string} message -      Error message for human
      * @param  {string} type -        Error type for machine
      * @param  {SystemError} [systemError] - For Node.js system error
      */
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: SystemError) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    var erroredSysCall: js.UndefOr[String] = js.native
  }
  
  trait SystemError extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var dest: js.UndefOr[String] = js.undefined
    
    var errno: Double
    
    var info: js.UndefOr[js.Object] = js.undefined
    
    var message: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var syscall: String
  }
  object SystemError {
    
    inline def apply(code: String, errno: Double, message: String, syscall: String): SystemError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], syscall = syscall.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemError] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: js.Object): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
    }
  }
}
