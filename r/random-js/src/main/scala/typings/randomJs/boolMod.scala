package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boolMod {
  
  @JSImport("random-js/dist/distribution/bool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bool(): Distribution[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[Distribution[Boolean]]
  inline def bool(numerator: Double, denominator: Double): Distribution[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("bool")(numerator.asInstanceOf[js.Any], denominator.asInstanceOf[js.Any])).asInstanceOf[Distribution[Boolean]]
  inline def bool(percentage: Double): Distribution[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(percentage.asInstanceOf[js.Any]).asInstanceOf[Distribution[Boolean]]
}
