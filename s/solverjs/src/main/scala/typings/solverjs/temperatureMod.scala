package typings.solverjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object temperatureMod {
  
  @JSImport("solverjs/temperature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def celToFah(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("celToFah")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def celToKel(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("celToKel")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fahToCel(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fahToCel")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fahToKel(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fahToKel")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def kelToCel(k: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("kelToCel")(k.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def kelToFah(k: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("kelToFah")(k.asInstanceOf[js.Any]).asInstanceOf[Double]
}
