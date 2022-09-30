package typings.reactQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLocalStorageMod {
  
  @JSImport("react-query/types/devtools/useLocalStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](key: String): js.Tuple2[
    js.UndefOr[T], 
    js.Function1[/* newVal */ T | (js.Function1[/* prevVal */ T, T]), Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[T], 
    js.Function1[/* newVal */ T | (js.Function1[/* prevVal */ T, T]), Unit]
  ]]
  inline def default[T](key: String, defaultValue: T): js.Tuple2[
    js.UndefOr[T], 
    js.Function1[/* newVal */ T | (js.Function1[/* prevVal */ T, T]), Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[T], 
    js.Function1[/* newVal */ T | (js.Function1[/* prevVal */ T, T]), Unit]
  ]]
}
