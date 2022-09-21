package typings.stablelibConstantTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/constant-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equal(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lessOrEqual(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lessOrEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def select(subject: Double, resultIfOne: Double, resultIfZero: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(subject.asInstanceOf[js.Any], resultIfOne.asInstanceOf[js.Any], resultIfZero.asInstanceOf[js.Any])).asInstanceOf[Double]
}
