package typings.reactSpinners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("react-spinners/cjs/helpers/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnimation(loaderName: String, frames: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(loaderName.asInstanceOf[js.Any], frames.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
}
