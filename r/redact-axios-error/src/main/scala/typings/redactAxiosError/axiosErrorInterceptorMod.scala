package typings.redactAxiosError

import typings.redactAxiosError.axiosErrorGroomerMod.AxiosErrorGroomer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axiosErrorInterceptorMod {
  
  @JSImport("redact-axios-error/axios-error-interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redact-axios-error/axios-error-interceptor", "config")
  @js.native
  val config: AxiosErrorGroomer | Null = js.native
  
  inline def getAxiosErrorInterceptor(): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxiosErrorInterceptor")().asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
  inline def getAxiosErrorInterceptor(axiosErrorGroomer: AxiosErrorGroomer): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxiosErrorInterceptor")(axiosErrorGroomer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
}
