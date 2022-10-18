package typings.reactScroll

import typings.reactScroll.anon.Smooth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsAnimateScrollMod {
  
  @JSImport("react-scroll/modules/mixins/animate-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animateTopScroll(y: Double, options: Any, to: String, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateTopScroll")(y.asInstanceOf[js.Any], options.asInstanceOf[js.Any], to.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationType")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  inline def scrollMore(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollMore(toY: Double, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollTo(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollTo(toY: Double, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollToBottom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")().asInstanceOf[Unit]
  inline def scrollToBottom(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def scrollToTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")().asInstanceOf[Unit]
  inline def scrollToTop(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
