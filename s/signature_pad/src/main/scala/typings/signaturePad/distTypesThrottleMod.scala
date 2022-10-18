package typings.signaturePad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThrottleMod {
  
  @JSImport("signature_pad/dist/types/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle(fn: js.Function1[/* repeated */ Any, Any]): js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any]]
  inline def throttle(fn: js.Function1[/* repeated */ Any, Any], wait: Double): js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any]]
}
