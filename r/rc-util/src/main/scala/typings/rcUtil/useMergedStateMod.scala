package typings.rcUtil

import typings.rcUtil.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergedStateMod {
  
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, R](defaultStateValue: T): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, js.Function1[/* value */ T, Unit]]]
  inline def default[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, js.Function1[/* value */ T, Unit]]]
  inline def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, js.Function1[/* value */ T, Unit]]]
  inline def default[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, js.Function1[/* value */ T, Unit]]]
}
