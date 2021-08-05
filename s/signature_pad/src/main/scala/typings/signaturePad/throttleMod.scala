package typings.signaturePad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod {
  
  @JSImport("signature_pad/dist/types/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle(fn: js.Function1[/* repeated */ js.Any, js.Any]): js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Any]]
  inline def throttle(fn: js.Function1[/* repeated */ js.Any, js.Any], wait: Double): js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Any]]
}
