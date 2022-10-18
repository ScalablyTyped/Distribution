package typings.snyk

import typings.snyk.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRequestMod {
  
  @JSImport("snyk/dist/lib/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRequest(payload: Any): js.Promise[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body]]
  inline def makeRequest(
    payload: Any,
    callback: js.Function3[/* err */ js.Error | Null, /* res */ js.UndefOr[Any], /* body */ js.UndefOr[Any], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(payload.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
