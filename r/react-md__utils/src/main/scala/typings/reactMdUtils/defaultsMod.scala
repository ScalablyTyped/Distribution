package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  @JSImport("@react-md/utils/types/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults[O /* <: js.Object */, R /* <: js.Object */](optional: O, required: R): O & R = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(optional.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[O & R]
}
