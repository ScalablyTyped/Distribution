package typings.reduxSubscriber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-subscriber", JSImport.Default)
  @js.native
  def default(store: js.Any): Subscribe_ = js.native
  
  @JSImport("redux-subscriber", "subscribe")
  @js.native
  val subscribe: Subscribe_ = js.native
  
  type Subscribe_ = js.Function2[/* key */ String, /* cb */ js.Function1[/* state */ js.Any, Unit], Unsubscribe]
  
  type Unsubscribe = js.Function0[Unit]
}
