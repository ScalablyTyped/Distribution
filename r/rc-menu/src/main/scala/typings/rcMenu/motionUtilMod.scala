package typings.rcMenu

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionUtilMod {
  
  @JSImport("rc-menu/es/utils/motionUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMotion(mode: String): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  inline def getMotion(mode: String, motion: Unit, defaultMotions: Record[String, CSSMotionProps]): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], defaultMotions.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  inline def getMotion(mode: String, motion: CSSMotionProps): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  inline def getMotion(mode: String, motion: CSSMotionProps, defaultMotions: Record[String, CSSMotionProps]): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], defaultMotions.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
}
