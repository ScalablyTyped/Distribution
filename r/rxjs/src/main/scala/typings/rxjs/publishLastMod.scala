package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishLastMod {
  
  @JSImport("rxjs/internal/operators/publishLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
}
