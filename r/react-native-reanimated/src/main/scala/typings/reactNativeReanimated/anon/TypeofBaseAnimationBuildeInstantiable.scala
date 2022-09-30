package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseAnimationBuildeInstantiable
  extends StObject
     with Instantiable0[BaseAnimationBuilder] {
  
  def build(): EntryExitAnimationFunction | LayoutAnimationFunction = js.native
  
  def createInstance(): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def delay(delayMs: Double): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def duration(durationMs: Double): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def getDuration(): Double = js.native
  
  def randomDelay(): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = js.native
}
