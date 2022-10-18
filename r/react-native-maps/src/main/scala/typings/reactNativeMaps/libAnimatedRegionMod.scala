package typings.reactNativeMaps

import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNativeMaps.anon.PartialRegion
import typings.reactNativeMaps.libSharedTypesMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimatedRegionMod {
  
  @JSImport("react-native-maps/lib/AnimatedRegion", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AnimatedMapRegion {
    def this(valueIn: Props) = this()
    
    /* private */ /* CompleteClass */
    var __attach: Any = js.native
    
    /* private */ /* CompleteClass */
    var __detach: Any = js.native
    
    /* private */ /* CompleteClass */
    var __getValue: Any = js.native
    
    /* CompleteClass */
    override def addListener(callback: js.Function1[/* region */ Region, Unit]): String = js.native
    
    /* CompleteClass */
    override def flattenOffset(): Unit = js.native
    
    /* CompleteClass */
    override def removeListener(id: String): Unit = js.native
    
    /* CompleteClass */
    override def setOffset(offset: Region): Unit = js.native
    
    /* CompleteClass */
    override def setValue(value: Region): Unit = js.native
    
    /* CompleteClass */
    override def spring(config: SpringAnimationConfig & Region): CompositeAnimation = js.native
    
    /* CompleteClass */
    override def stopAnimation(callback: js.Function1[/* region */ Region, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def timing(config: TimingAnimationConfig & Region): CompositeAnimation = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait AnimatedMapRegion extends StObject {
    
    /* private */ var __attach: Any
    
    /* private */ var __detach: Any
    
    /* private */ var __getValue: Any
    
    def addListener(callback: js.Function1[/* region */ Region, Unit]): String
    
    def flattenOffset(): Unit
    
    def removeListener(id: String): Unit
    
    def setOffset(offset: Region): Unit
    
    def setValue(value: Region): Unit
    
    def spring(config: SpringAnimationConfig & Region): CompositeAnimation
    
    def stopAnimation(callback: js.Function1[/* region */ Region, Unit]): Unit
    
    def timing(config: TimingAnimationConfig & Region): CompositeAnimation
  }
  object AnimatedMapRegion {
    
    inline def apply(
      __attach: Any,
      __detach: Any,
      __getValue: Any,
      addListener: js.Function1[/* region */ Region, Unit] => String,
      flattenOffset: () => Unit,
      removeListener: String => Unit,
      setOffset: Region => Unit,
      setValue: Region => Unit,
      spring: SpringAnimationConfig & Region => CompositeAnimation,
      stopAnimation: js.Function1[/* region */ Region, Unit] => Unit,
      timing: TimingAnimationConfig & Region => CompositeAnimation
    ): AnimatedMapRegion = {
      val __obj = js.Dynamic.literal(__attach = __attach.asInstanceOf[js.Any], __detach = __detach.asInstanceOf[js.Any], __getValue = __getValue.asInstanceOf[js.Any], addListener = js.Any.fromFunction1(addListener), flattenOffset = js.Any.fromFunction0(flattenOffset), removeListener = js.Any.fromFunction1(removeListener), setOffset = js.Any.fromFunction1(setOffset), setValue = js.Any.fromFunction1(setValue), spring = js.Any.fromFunction1(spring), stopAnimation = js.Any.fromFunction1(stopAnimation), timing = js.Any.fromFunction1(timing))
      __obj.asInstanceOf[AnimatedMapRegion]
    }
    
    extension [Self <: AnimatedMapRegion](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* region */ Region, Unit] => String): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setFlattenOffset(value: () => Unit): Self = StObject.set(x, "flattenOffset", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(value: String => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      inline def setSetOffset(value: Region => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: Region => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setSpring(value: SpringAnimationConfig & Region => CompositeAnimation): Self = StObject.set(x, "spring", js.Any.fromFunction1(value))
      
      inline def setStopAnimation(value: js.Function1[/* region */ Region, Unit] => Unit): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction1(value))
      
      inline def setTiming(value: TimingAnimationConfig & Region => CompositeAnimation): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      inline def set__attach(value: Any): Self = StObject.set(x, "__attach", value.asInstanceOf[js.Any])
      
      inline def set__detach(value: Any): Self = StObject.set(x, "__detach", value.asInstanceOf[js.Any])
      
      inline def set__getValue(value: Any): Self = StObject.set(x, "__getValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = js.UndefOr[PartialRegion]
}
