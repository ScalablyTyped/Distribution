package typings.rcUtil

import typings.rcUtil.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseMergedStateMod {
  
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, R](defaultStateValue: T): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def default[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def default[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  
  type Updater[T] = js.Function2[
    /* updater */ T | (js.Function1[/* origin */ T, T]), 
    /* ignoreDestroy */ js.UndefOr[Boolean], 
    Unit
  ]
}
