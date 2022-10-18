package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.XY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerUtilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TEST_MAX_IF_NOT_NAN(value: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TEST_MAX_IF_NOT_NAN")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def TEST_MIN_IF_NOT_NAN(value: Double, limit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TEST_MIN_IF_NOT_NAN")(value.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def VEC_LEN_SQ(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("VEC_LEN_SQ")().asInstanceOf[Double]
  inline def VEC_LEN_SQ(hasXY: XY): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("VEC_LEN_SQ")(hasXY.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fireAfterInterval(method: js.Function0[Unit]): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAfterInterval")(method.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def fireAfterInterval(method: js.Function0[Unit], interval: Boolean): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAfterInterval")(method.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def fireAfterInterval(method: js.Function0[Unit], interval: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAfterInterval")(method.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def isValidNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isnan(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isnan")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
