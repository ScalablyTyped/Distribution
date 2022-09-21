package typings.rcMotion

import typings.rcMotion.anon.Animationend
import typings.rcMotion.cssmotionMod.MotionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionMod {
  
  @JSImport("rc-motion/es/util/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-motion/es/util/motion", "animationEndName")
  @js.native
  val animationEndName: Any = js.native
  
  inline def getTransitionName(transitionName: MotionName, transitionType: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionName")(transitionName.asInstanceOf[js.Any], transitionType.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getVendorPrefixedEventName(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getVendorPrefixedEventName")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getVendorPrefixes(domSupport: Boolean, win: js.Object): Animationend = (^.asInstanceOf[js.Dynamic].applyDynamic("getVendorPrefixes")(domSupport.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[Animationend]
  
  @JSImport("rc-motion/es/util/motion", "supportTransition")
  @js.native
  val supportTransition: Boolean = js.native
  
  @JSImport("rc-motion/es/util/motion", "transitionEndName")
  @js.native
  val transitionEndName: Any = js.native
}
