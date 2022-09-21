package typings.redactAxiosError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redact-axios-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redact-axios-error", "AxiosErrorGroomer")
  @js.native
  /**
    * @param includeRequestData default true, false redacts request data
    * @param includeResponseData default true, false redacts response data
    * @param includeQueryData default true, false redacts query string data
    */
  open class AxiosErrorGroomer ()
    extends typings.redactAxiosError.axiosErrorGroomerMod.AxiosErrorGroomer {
    def this(includeRequestData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Boolean, includeQueryData: Boolean) = this()
    def this(includeRequestData: Boolean, includeResponseData: Unit, includeQueryData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Boolean, includeQueryData: Boolean) = this()
    def this(includeRequestData: Unit, includeResponseData: Unit, includeQueryData: Boolean) = this()
  }
  
  @JSImport("redact-axios-error", "config")
  @js.native
  val config: typings.redactAxiosError.axiosErrorGroomerMod.AxiosErrorGroomer | Null = js.native
  
  inline def getAxiosErrorInterceptor(): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxiosErrorInterceptor")().asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
  inline def getAxiosErrorInterceptor(axiosErrorGroomer: typings.redactAxiosError.axiosErrorGroomerMod.AxiosErrorGroomer): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxiosErrorInterceptor")(axiosErrorGroomer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
}
