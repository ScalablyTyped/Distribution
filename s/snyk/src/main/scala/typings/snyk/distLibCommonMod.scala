package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommonMod {
  
  @JSImport("snyk/dist/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/common", "contactSupportMessage")
  @js.native
  val contactSupportMessage: /* "If the issue persists contact support@snyk.io" */ String = js.native
  
  @JSImport("snyk/dist/lib/common", "reTryMessage")
  @js.native
  val reTryMessage: /* "Tip: Re-run in debug mode to see more information: DEBUG=*snyk* <COMMAND>" */ String = js.native
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
