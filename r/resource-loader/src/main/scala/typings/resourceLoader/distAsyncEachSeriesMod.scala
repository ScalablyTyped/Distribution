package typings.resourceLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAsyncEachSeriesMod {
  
  @JSImport("resource-loader/dist/async/eachSeries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eachSeries[T](
    array: js.Array[T],
    iterator: js.Function2[/* item */ T, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachSeries[T](
    array: js.Array[T],
    iterator: js.Function2[/* item */ T, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachSeries[T](
    array: js.Array[T],
    iterator: js.Function2[/* item */ T, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
    deferNext: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferNext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachSeries[T](
    array: js.Array[T],
    iterator: js.Function2[/* item */ T, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit],
    callback: Unit,
    deferNext: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferNext.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
