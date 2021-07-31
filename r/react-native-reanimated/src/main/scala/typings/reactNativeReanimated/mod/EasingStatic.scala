package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.mod.Animated.Adaptable
import typings.reactNativeReanimated.mod.Animated.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EasingStatic extends StObject {
  
  def back(): EasingFunction = js.native
  def back(s: Adaptable[Double]): EasingFunction = js.native
  
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = js.native
  
  var bounce: EasingFunction = js.native
  
  var circle: EasingFunction = js.native
  
  var cubic: EasingFunction = js.native
  
  var ease: EasingFunction = js.native
  
  def elastic(): EasingFunction = js.native
  def elastic(bounciness: Adaptable[Double]): EasingFunction = js.native
  
  var exp: EasingFunction = js.native
  
  def in(easing: EasingFunction): EasingFunction = js.native
  
  def inOut(easing: EasingFunction): EasingFunction = js.native
  
  var linear: EasingFunction = js.native
  
  def out(easing: EasingFunction): EasingFunction = js.native
  
  def poly(n: Adaptable[Double]): EasingFunction = js.native
  
  var quad: EasingFunction = js.native
  
  var sin: EasingFunction = js.native
}
