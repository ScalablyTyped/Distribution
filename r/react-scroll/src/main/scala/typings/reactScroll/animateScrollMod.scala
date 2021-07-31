package typings.reactScroll

import typings.reactScroll.anon.Smooth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateScrollMod {
  
  @JSImport("react-scroll/modules/mixins/animate-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateTopScroll")(y.asInstanceOf[js.Any], options.asInstanceOf[js.Any], to.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationType")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @scala.inline
  def scrollMore(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def scrollMore(toY: Double, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scrollTo(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def scrollTo(toY: Double, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scrollToBottom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")().asInstanceOf[Unit]
  @scala.inline
  def scrollToBottom(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def scrollToTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")().asInstanceOf[Unit]
  @scala.inline
  def scrollToTop(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
