package typings.rxjsCompat

import typings.rxjs.mod.ConnectableObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPublishBehaviorMod {
  
  @JSImport("rxjs-compat/operator/publishBehavior", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishBehavior[T](value: T): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(value.asInstanceOf[js.Any]).asInstanceOf[ConnectableObservable[T]]
}
