package typings.rrule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easterMod {
  
  @JSImport("rrule/dist/esm/src/iterinfo/easter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def easter(y: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("easter")(y.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def easter(y: Double, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("easter")(y.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
