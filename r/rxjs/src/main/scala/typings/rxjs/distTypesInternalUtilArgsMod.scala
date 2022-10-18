package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilArgsMod {
  
  @JSImport("rxjs/dist/types/internal/util/args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popNumber(args: js.Array[Any], defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("popNumber")(args.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def popResultSelector(args: js.Array[Any]): js.UndefOr[js.Function1[/* repeated */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("popResultSelector")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]
  
  inline def popScheduler(args: js.Array[Any]): js.UndefOr[SchedulerLike] = ^.asInstanceOf[js.Dynamic].applyDynamic("popScheduler")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SchedulerLike]]
}
