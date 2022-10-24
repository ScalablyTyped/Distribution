package typings.reactStatelyUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-stately/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def clamp(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def snapValueToStep(value: Double, min: Double, max: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapValueToStep")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toFixedNumber(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixedNumber")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toFixedNumber(value: Double, digits: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixedNumber")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useControlledState[T](value: T, defaultValue: T, onChange: js.Function2[/* value */ T, /* repeated */ Any, Unit]): js.Tuple2[T, js.Function2[/* value */ T, /* repeated */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function2[/* value */ T, /* repeated */ Any, Unit]]]
}
