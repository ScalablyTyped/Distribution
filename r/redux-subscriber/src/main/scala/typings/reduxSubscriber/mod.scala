package typings.reduxSubscriber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-subscriber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(store: Any): Subscribe_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any]).asInstanceOf[Subscribe_]
  
  @JSImport("redux-subscriber", "subscribe")
  @js.native
  val subscribe: Subscribe_ = js.native
  
  type Subscribe_ = js.Function2[/* key */ String, /* cb */ js.Function1[/* state */ Any, Unit], Unsubscribe]
  
  type Unsubscribe = js.Function0[Unit]
}
