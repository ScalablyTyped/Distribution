package typings.rcUtil

import typings.rcUtil.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergedStateMod {
  
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Default)
  @js.native
  def default[T, R](defaultStateValue: T): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Default)
  @js.native
  def default[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Default)
  @js.native
  def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  @JSImport("rc-util/lib/hooks/useMergedState", JSImport.Default)
  @js.native
  def default[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
}
