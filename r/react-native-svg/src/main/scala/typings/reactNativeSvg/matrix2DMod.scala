package typings.reactNativeSvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrix2DMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/Matrix2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def append(a2: Double, b2: Double, c2: Double, d2: Double, tx2: Double, ty2: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(a2.asInstanceOf[js.Any], b2.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], d2.asInstanceOf[js.Any], tx2.asInstanceOf[js.Any], ty2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double,
    regX: Double,
    regY: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], skewX.asInstanceOf[js.Any], skewY.asInstanceOf[js.Any], regX.asInstanceOf[js.Any], regY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-native-svg/lib/typescript/lib/Matrix2D", "identity")
  @js.native
  val identity: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def toArray(): js.Tuple6[Double, Double, Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Tuple6[Double, Double, Double, Double, Double, Double]]
}
