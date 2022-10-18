package typings.rxjsCompat

import typings.rxjs.mod.ConnectableObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPublishLastMod {
  
  @JSImport("rxjs-compat/operator/publishLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishLast[T](): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[ConnectableObservable[T]]
}
