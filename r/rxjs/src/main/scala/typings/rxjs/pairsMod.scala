package typings.rxjs

import typings.rxjs.anon.Index
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairsMod {
  
  @JSImport("rxjs/internal/observable/pairs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch[T](state: Index[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
}
