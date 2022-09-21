package typings.redactAxiosError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axiosErrorGroomerMod {
  
  @JSImport("redact-axios-error/axios-error-groomer", "AxiosErrorGroomer")
  @js.native
  /**
    * @param includeRequestData default true, false redacts request data
    * @param includeResponseData default true, false redacts response data
    * @param includeQueryData default true, false redacts query string data
    */
  open class AxiosErrorGroomer () extends StObject {
    def this(includeRequestData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Boolean, includeQueryData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Unit, includeQueryData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Boolean, includeQueryData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Unit, includeQueryData: Boolean) = this()
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    def getGroomedAxiosError(err: Any): Any = js.native
    
    def includeQueryData(flag: Boolean): Unit = js.native
    
    def includeRequestData(flag: Boolean): Unit = js.native
    
    def includeResponseData(flag: Boolean): Unit = js.native
  }
}
