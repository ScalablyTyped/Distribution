package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTouchDetectionMod {
  
  @JSImport("@react-md/utils/types/interaction/useTouchDetection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/interaction/useTouchDetection", "DEFAULT_TOUCH_TIMEOUT")
  @js.native
  val DEFAULT_TOUCH_TIMEOUT: /* 1200 */ Double = js.native
  
  @scala.inline
  def useTouchDetection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useTouchDetection")().asInstanceOf[Boolean]
  @scala.inline
  def useTouchDetection(touchTimeout: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useTouchDetection")(touchTimeout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
