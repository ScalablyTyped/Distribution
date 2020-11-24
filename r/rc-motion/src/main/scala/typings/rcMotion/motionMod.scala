package typings.rcMotion

import typings.rcMotion.anon.Animationend
import typings.rcMotion.cssmotionMod.MotionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/util/motion", JSImport.Namespace)
@js.native
object motionMod extends js.Object {
  
  val animationEndName: js.Any = js.native
  
  def getTransitionName(transitionName: MotionName, transitionType: String): js.Any = js.native
  
  def getVendorPrefixedEventName(eventName: String): js.Any = js.native
  
  def getVendorPrefixes(domSupport: Boolean, win: js.Object): Animationend = js.native
  
  val supportTransition: Boolean = js.native
  
  val transitionEndName: js.Any = js.native
}
