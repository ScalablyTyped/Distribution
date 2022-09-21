package typings.stablelibInt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/int", "MAX_SAFE_INTEGER")
  @js.native
  val MAX_SAFE_INTEGER: /* 9007199254740991.0 */ Double = js.native
  
  inline def add(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafeInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mul(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotl(x: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotl")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotr(x: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotr")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sub(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
