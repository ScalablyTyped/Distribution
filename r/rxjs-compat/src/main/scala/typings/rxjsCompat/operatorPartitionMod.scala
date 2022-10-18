package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPartitionMod {
  
  @JSImport("rxjs-compat/operator/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable_[T], Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Observable_[T], Observable_[T]]]
  inline def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): js.Tuple2[Observable_[T], Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable_[T], Observable_[T]]]
}
