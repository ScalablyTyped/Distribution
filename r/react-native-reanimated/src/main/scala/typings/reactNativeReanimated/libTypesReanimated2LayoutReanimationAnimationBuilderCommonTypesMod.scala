package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.libTypesReanimated2EasingMod.EasingFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod {
  
  type AnimationConfigFunction[T] = js.Function1[/* targetValues */ T, LayoutAnimation]
  
  type AnimationFunction = js.Function3[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], /* c */ js.UndefOr[Any], Any]
  
  trait BaseBuilderAnimationConfig
    extends StObject
       with BaseLayoutAnimationConfig {
    
    var rotate: js.UndefOr[Double | String] = js.undefined
  }
  object BaseBuilderAnimationConfig {
    
    inline def apply(): BaseBuilderAnimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBuilderAnimationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseBuilderAnimationConfig] (val x: Self) extends AnyVal {
      
      inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    }
  }
  
  trait BaseLayoutAnimationConfig extends StObject {
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFn] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var overshootClamping: js.UndefOr[Double] = js.undefined
    
    var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
    
    var restSpeedThreshold: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[AnimationFunction] = js.undefined
  }
  object BaseLayoutAnimationConfig {
    
    inline def apply(): BaseLayoutAnimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLayoutAnimationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseLayoutAnimationConfig] (val x: Self) extends AnyVal {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setOvershootClamping(value: Double): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
      
      inline def setOvershootClampingUndefined: Self = StObject.set(x, "overshootClamping", js.undefined)
      
      inline def setRestDisplacementThreshold(value: Double): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
      
      inline def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
      
      inline def setRestSpeedThreshold(value: Double): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
      
      inline def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setType(value: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], /* c */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EntryAnimationsValues extends StObject {
    
    var targetGlobalOriginX: Double
    
    var targetGlobalOriginY: Double
    
    var targetHeight: Double
    
    var targetOriginX: Double
    
    var targetOriginY: Double
    
    var targetWidth: Double
  }
  object EntryAnimationsValues {
    
    inline def apply(
      targetGlobalOriginX: Double,
      targetGlobalOriginY: Double,
      targetHeight: Double,
      targetOriginX: Double,
      targetOriginY: Double,
      targetWidth: Double
    ): EntryAnimationsValues = {
      val __obj = js.Dynamic.literal(targetGlobalOriginX = targetGlobalOriginX.asInstanceOf[js.Any], targetGlobalOriginY = targetGlobalOriginY.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetOriginX = targetOriginX.asInstanceOf[js.Any], targetOriginY = targetOriginY.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryAnimationsValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryAnimationsValues] (val x: Self) extends AnyVal {
      
      inline def setTargetGlobalOriginX(value: Double): Self = StObject.set(x, "targetGlobalOriginX", value.asInstanceOf[js.Any])
      
      inline def setTargetGlobalOriginY(value: Double): Self = StObject.set(x, "targetGlobalOriginY", value.asInstanceOf[js.Any])
      
      inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginX(value: Double): Self = StObject.set(x, "targetOriginX", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginY(value: Double): Self = StObject.set(x, "targetOriginY", value.asInstanceOf[js.Any])
      
      inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type EntryExitAnimationFunction = js.Function1[/* targetValues */ EntryAnimationsValues | ExitAnimationsValues, LayoutAnimation]
  
  trait ExitAnimationsValues extends StObject {
    
    var currentGlobalOriginX: Double
    
    var currentGlobalOriginY: Double
    
    var currentHeight: Double
    
    var currentOriginX: Double
    
    var currentOriginY: Double
    
    var currentWidth: Double
  }
  object ExitAnimationsValues {
    
    inline def apply(
      currentGlobalOriginX: Double,
      currentGlobalOriginY: Double,
      currentHeight: Double,
      currentOriginX: Double,
      currentOriginY: Double,
      currentWidth: Double
    ): ExitAnimationsValues = {
      val __obj = js.Dynamic.literal(currentGlobalOriginX = currentGlobalOriginX.asInstanceOf[js.Any], currentGlobalOriginY = currentGlobalOriginY.asInstanceOf[js.Any], currentHeight = currentHeight.asInstanceOf[js.Any], currentOriginX = currentOriginX.asInstanceOf[js.Any], currentOriginY = currentOriginY.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitAnimationsValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExitAnimationsValues] (val x: Self) extends AnyVal {
      
      inline def setCurrentGlobalOriginX(value: Double): Self = StObject.set(x, "currentGlobalOriginX", value.asInstanceOf[js.Any])
      
      inline def setCurrentGlobalOriginY(value: Double): Self = StObject.set(x, "currentGlobalOriginY", value.asInstanceOf[js.Any])
      
      inline def setCurrentHeight(value: Double): Self = StObject.set(x, "currentHeight", value.asInstanceOf[js.Any])
      
      inline def setCurrentOriginX(value: Double): Self = StObject.set(x, "currentOriginX", value.asInstanceOf[js.Any])
      
      inline def setCurrentOriginY(value: Double): Self = StObject.set(x, "currentOriginY", value.asInstanceOf[js.Any])
      
      inline def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEntryAnimationBuilder extends StObject {
    
    def build(): AnimationConfigFunction[EntryAnimationsValues]
  }
  object IEntryAnimationBuilder {
    
    inline def apply(build: () => AnimationConfigFunction[EntryAnimationsValues]): IEntryAnimationBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[IEntryAnimationBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntryAnimationBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: () => AnimationConfigFunction[EntryAnimationsValues]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  trait IEntryExitAnimationBuilder extends StObject {
    
    def build(): EntryExitAnimationFunction
  }
  object IEntryExitAnimationBuilder {
    
    inline def apply(build: () => EntryExitAnimationFunction): IEntryExitAnimationBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[IEntryExitAnimationBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntryExitAnimationBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: () => EntryExitAnimationFunction): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  trait IExitAnimationBuilder extends StObject {
    
    def build(): AnimationConfigFunction[ExitAnimationsValues]
  }
  object IExitAnimationBuilder {
    
    inline def apply(build: () => AnimationConfigFunction[ExitAnimationsValues]): IExitAnimationBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[IExitAnimationBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExitAnimationBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: () => AnimationConfigFunction[ExitAnimationsValues]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  trait ILayoutAnimationBuilder extends StObject {
    
    def build(): LayoutAnimationFunction
  }
  object ILayoutAnimationBuilder {
    
    inline def apply(build: () => LayoutAnimationFunction): ILayoutAnimationBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[ILayoutAnimationBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILayoutAnimationBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: () => LayoutAnimationFunction): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  trait KeyframeProps
    extends StObject
       with StyleProps {
    
    var easing: js.UndefOr[EasingFn] = js.undefined
  }
  object KeyframeProps {
    
    inline def apply(): KeyframeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyframeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyframeProps] (val x: Self) extends AnyVal {
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait LayoutAnimation extends StObject {
    
    var animations: StyleProps
    
    var callback: js.UndefOr[js.Function1[/* finished */ Boolean, Unit]] = js.undefined
    
    var initialValues: StyleProps
  }
  object LayoutAnimation {
    
    inline def apply(animations: StyleProps, initialValues: StyleProps): LayoutAnimation = {
      val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutAnimation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutAnimation] (val x: Self) extends AnyVal {
      
      inline def setAnimations(value: StyleProps): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: /* finished */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setInitialValues(value: StyleProps): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutAnimationAndConfig = js.Tuple2[AnimationFunction, BaseBuilderAnimationConfig]
  
  type LayoutAnimationFunction = js.Function1[/* targetValues */ LayoutAnimationsValues, LayoutAnimation]
  
  trait LayoutAnimationsValues extends StObject {
    
    var currentGlobalOriginX: Double
    
    var currentGlobalOriginY: Double
    
    var currentHeight: Double
    
    var currentOriginX: Double
    
    var currentOriginY: Double
    
    var currentWidth: Double
    
    var targetGlobalOriginX: Double
    
    var targetGlobalOriginY: Double
    
    var targetHeight: Double
    
    var targetOriginX: Double
    
    var targetOriginY: Double
    
    var targetWidth: Double
    
    var windowHeight: Double
    
    var windowWidth: Double
  }
  object LayoutAnimationsValues {
    
    inline def apply(
      currentGlobalOriginX: Double,
      currentGlobalOriginY: Double,
      currentHeight: Double,
      currentOriginX: Double,
      currentOriginY: Double,
      currentWidth: Double,
      targetGlobalOriginX: Double,
      targetGlobalOriginY: Double,
      targetHeight: Double,
      targetOriginX: Double,
      targetOriginY: Double,
      targetWidth: Double,
      windowHeight: Double,
      windowWidth: Double
    ): LayoutAnimationsValues = {
      val __obj = js.Dynamic.literal(currentGlobalOriginX = currentGlobalOriginX.asInstanceOf[js.Any], currentGlobalOriginY = currentGlobalOriginY.asInstanceOf[js.Any], currentHeight = currentHeight.asInstanceOf[js.Any], currentOriginX = currentOriginX.asInstanceOf[js.Any], currentOriginY = currentOriginY.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], targetGlobalOriginX = targetGlobalOriginX.asInstanceOf[js.Any], targetGlobalOriginY = targetGlobalOriginY.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetOriginX = targetOriginX.asInstanceOf[js.Any], targetOriginY = targetOriginY.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutAnimationsValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutAnimationsValues] (val x: Self) extends AnyVal {
      
      inline def setCurrentGlobalOriginX(value: Double): Self = StObject.set(x, "currentGlobalOriginX", value.asInstanceOf[js.Any])
      
      inline def setCurrentGlobalOriginY(value: Double): Self = StObject.set(x, "currentGlobalOriginY", value.asInstanceOf[js.Any])
      
      inline def setCurrentHeight(value: Double): Self = StObject.set(x, "currentHeight", value.asInstanceOf[js.Any])
      
      inline def setCurrentOriginX(value: Double): Self = StObject.set(x, "currentOriginX", value.asInstanceOf[js.Any])
      
      inline def setCurrentOriginY(value: Double): Self = StObject.set(x, "currentOriginY", value.asInstanceOf[js.Any])
      
      inline def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
      
      inline def setTargetGlobalOriginX(value: Double): Self = StObject.set(x, "targetGlobalOriginX", value.asInstanceOf[js.Any])
      
      inline def setTargetGlobalOriginY(value: Double): Self = StObject.set(x, "targetGlobalOriginY", value.asInstanceOf[js.Any])
      
      inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginX(value: Double): Self = StObject.set(x, "targetOriginX", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginY(value: Double): Self = StObject.set(x, "targetOriginY", value.asInstanceOf[js.Any])
      
      inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
      
      inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    }
  }
}
