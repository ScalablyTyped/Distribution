package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseAnimationBuilde
  extends StObject
     with Instantiable0[BaseAnimationBuilder] {
  
  def build(): EntryExitAnimationFunction | LayoutAnimationFunction = js.native
  
  def createInstance(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def delay(delayMs: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def duration(durationMs: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def getDuration(): Double = js.native
  
  def randomDelay(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
}
