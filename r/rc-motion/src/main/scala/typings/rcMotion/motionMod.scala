package typings.rcMotion

import typings.rcMotion.anon.Animationend
import typings.rcMotion.cssmotionMod.MotionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionMod {
  
  @JSImport("rc-motion/es/util/motion", "animationEndName")
  @js.native
  val animationEndName: js.Any = js.native
  
  @JSImport("rc-motion/es/util/motion", "getTransitionName")
  @js.native
  def getTransitionName(transitionName: MotionName, transitionType: String): js.Any = js.native
  
  @JSImport("rc-motion/es/util/motion", "getVendorPrefixedEventName")
  @js.native
  def getVendorPrefixedEventName(eventName: String): js.Any = js.native
  
  @JSImport("rc-motion/es/util/motion", "getVendorPrefixes")
  @js.native
  def getVendorPrefixes(domSupport: Boolean, win: js.Object): Animationend = js.native
  
  @JSImport("rc-motion/es/util/motion", "supportTransition")
  @js.native
  val supportTransition: Boolean = js.native
  
  @JSImport("rc-motion/es/util/motion", "transitionEndName")
  @js.native
  val transitionEndName: js.Any = js.native
}
