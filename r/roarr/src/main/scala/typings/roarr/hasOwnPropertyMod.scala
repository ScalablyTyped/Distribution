package typings.roarr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasOwnPropertyMod {
  
  @JSImport("roarr/dist/src/utilities/hasOwnProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasOwnProperty_[X /* <: js.Object */](`object`: X, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[X /* <: js.Object */](`object`: X, property: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[X /* <: js.Object */](`object`: X, property: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
