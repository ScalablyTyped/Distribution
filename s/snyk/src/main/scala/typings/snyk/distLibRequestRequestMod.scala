package typings.snyk

import typings.needle.mod.ReadableStream
import typings.snyk.anon.Body
import typings.snyk.distLibRequestTypesMod.Payload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRequestRequestMod {
  
  @JSImport("snyk/dist/lib/request/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRequest(payload: Payload): js.Promise[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body]]
  
  inline def streamRequest(payload: Payload): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
}
