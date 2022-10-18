package typings.rxjsCompat

import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPublishMod {
  
  @JSImport("rxjs-compat/operator/publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publish[T](): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")().asInstanceOf[ConnectableObservable[T]]
  inline def publish[T](selector: js.Function1[/* source */ Observable_[T], Observable_[T]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def publish_TR[T, R](selector: js.Function1[/* source */ Observable_[T], Observable_[R]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  
  type selector[T] = js.Function1[/* source */ Observable_[T], Observable_[T]]
}
