package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRequestPromiseMod {
  
  @JSImport("snyk/dist/lib/request/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRequest[T](payload: Any): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def makeRequestRest[T](payload: Any): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestRest")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
