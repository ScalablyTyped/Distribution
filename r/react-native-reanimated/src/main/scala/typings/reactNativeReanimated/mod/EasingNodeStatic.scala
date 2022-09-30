package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.mod.Animated.EasingNodeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EasingNodeStatic extends StObject {
  
  def back(): EasingNodeFunction = js.native
  def back(s: typings.reactNativeReanimated.mod.Animated.Adaptable[Double]): EasingNodeFunction = js.native
  
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingNodeFunction = js.native
  
  var bounce: EasingNodeFunction = js.native
  
  var circle: EasingNodeFunction = js.native
  
  var cubic: EasingNodeFunction = js.native
  
  var ease: EasingNodeFunction = js.native
  
  def elastic(): EasingNodeFunction = js.native
  def elastic(bounciness: typings.reactNativeReanimated.mod.Animated.Adaptable[Double]): EasingNodeFunction = js.native
  
  var exp: EasingNodeFunction = js.native
  
  def in(easing: EasingNodeFunction): EasingNodeFunction = js.native
  
  def inOut(easing: EasingNodeFunction): EasingNodeFunction = js.native
  
  var linear: EasingNodeFunction = js.native
  
  def out(easing: EasingNodeFunction): EasingNodeFunction = js.native
  
  def poly(n: typings.reactNativeReanimated.mod.Animated.Adaptable[Double]): EasingNodeFunction = js.native
  
  var quad: EasingNodeFunction = js.native
  
  var sin: EasingNodeFunction = js.native
}
