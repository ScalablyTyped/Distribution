package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.SequenceAnimation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationSequenceMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequence(_animations: NextAnimation[SequenceAnimation]*): Animation[SequenceAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(_animations.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Animation[SequenceAnimation]]
  
  inline def withSequence(_animations: NextAnimation[AnimationObject]*): Animation[SequenceAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSequence")(_animations.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Animation[SequenceAnimation]]
}
