package typings.reactNativeAnimatable

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageProperties
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.NativeMethods
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.anon.Finished
import typings.reactNativeAnimatable.anon.Style
import typings.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-animatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-animatable", "Image")
  @js.native
  val Image: AnimatableComponent[ImageProperties, ImageStyle] = js.native
  type Image = AnimatableComponent[ImageProperties, ImageStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Image")
  @js.native
  open class ImageCls protected () extends ClassicComponent[AnimatableProperties[ImageStyle] & ImageProperties, ComponentState] {
    def this(props: AnimatableProperties[ImageStyle] & ImageProperties) = this()
    def this(props: AnimatableProperties[ImageStyle] & ImageProperties, context: Any) = this()
  }
  
  @JSImport("react-native-animatable", "Text")
  @js.native
  val Text: AnimatableComponent[TextProperties, TextStyle] = js.native
  type Text = AnimatableComponent[TextProperties, TextStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Text")
  @js.native
  open class TextCls protected () extends ClassicComponent[AnimatableProperties[TextStyle] & TextProperties, ComponentState] {
    def this(props: AnimatableProperties[TextStyle] & TextProperties) = this()
    def this(props: AnimatableProperties[TextStyle] & TextProperties, context: Any) = this()
  }
  
  @JSImport("react-native-animatable", "View")
  @js.native
  val View: AnimatableComponent[ViewProperties, ViewStyle] = js.native
  type View = AnimatableComponent[ViewProperties, ViewStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "View")
  @js.native
  open class ViewCls protected () extends ClassicComponent[AnimatableProperties[ViewStyle] & ViewProperties, ComponentState] {
    def this(props: AnimatableProperties[ViewStyle] & ViewProperties) = this()
    def this(props: AnimatableProperties[ViewStyle] & ViewProperties, context: Any) = this()
  }
  
  inline def createAnimatableComponent[P /* <: Style */, S](
    Component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<P> */ Any
  ): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  inline def createAnimatableComponent[P /* <: Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  inline def createAnimatableComponent[P /* <: Style */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  
  inline def createAnimation(animation: CustomAnimation[TextStyle & ViewStyle & ImageStyle]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animation.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def initializeRegistryWithDefinitions(animations: StringDictionary[CustomAnimation[TextStyle & ViewStyle & ImageStyle]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeRegistryWithDefinitions")(animations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerAnimation(name: String, animation: CustomAnimation[TextStyle & ViewStyle & ImageStyle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(name.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Partial<{[ k in react-native-animatable.react-native-animatable.Animation ]: (duration : number | undefined): std.Promise<{  finished :boolean}>}> */
  trait AnimatableAnimationMethods extends StObject {
    
    var bounce: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flash: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipInX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipInY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipOutX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipOutY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var jello: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var lightSpeedIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var lightSpeedOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var pulse: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var rotate: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var rubberBand: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var shake: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var swing: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var tada: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var wobble: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
  }
  object AnimatableAnimationMethods {
    
    inline def apply(): AnimatableAnimationMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableAnimationMethods]
    }
    
    extension [Self <: AnimatableAnimationMethods](x: Self) {
      
      inline def setBounce(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounce", js.Any.fromFunction1(value))
      
      inline def setBounceIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceIn", js.Any.fromFunction1(value))
      
      inline def setBounceInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInDown", js.Any.fromFunction1(value))
      
      inline def setBounceInDownUndefined: Self = StObject.set(x, "bounceInDown", js.undefined)
      
      inline def setBounceInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInLeft", js.Any.fromFunction1(value))
      
      inline def setBounceInLeftUndefined: Self = StObject.set(x, "bounceInLeft", js.undefined)
      
      inline def setBounceInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInRight", js.Any.fromFunction1(value))
      
      inline def setBounceInRightUndefined: Self = StObject.set(x, "bounceInRight", js.undefined)
      
      inline def setBounceInUndefined: Self = StObject.set(x, "bounceIn", js.undefined)
      
      inline def setBounceInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInUp", js.Any.fromFunction1(value))
      
      inline def setBounceInUpUndefined: Self = StObject.set(x, "bounceInUp", js.undefined)
      
      inline def setBounceOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOut", js.Any.fromFunction1(value))
      
      inline def setBounceOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutDown", js.Any.fromFunction1(value))
      
      inline def setBounceOutDownUndefined: Self = StObject.set(x, "bounceOutDown", js.undefined)
      
      inline def setBounceOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutLeft", js.Any.fromFunction1(value))
      
      inline def setBounceOutLeftUndefined: Self = StObject.set(x, "bounceOutLeft", js.undefined)
      
      inline def setBounceOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutRight", js.Any.fromFunction1(value))
      
      inline def setBounceOutRightUndefined: Self = StObject.set(x, "bounceOutRight", js.undefined)
      
      inline def setBounceOutUndefined: Self = StObject.set(x, "bounceOut", js.undefined)
      
      inline def setBounceOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutUp", js.Any.fromFunction1(value))
      
      inline def setBounceOutUpUndefined: Self = StObject.set(x, "bounceOutUp", js.undefined)
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setFadeIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeIn", js.Any.fromFunction1(value))
      
      inline def setFadeInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDown", js.Any.fromFunction1(value))
      
      inline def setFadeInDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDownBig", js.Any.fromFunction1(value))
      
      inline def setFadeInDownBigUndefined: Self = StObject.set(x, "fadeInDownBig", js.undefined)
      
      inline def setFadeInDownUndefined: Self = StObject.set(x, "fadeInDown", js.undefined)
      
      inline def setFadeInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeft", js.Any.fromFunction1(value))
      
      inline def setFadeInLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeftBig", js.Any.fromFunction1(value))
      
      inline def setFadeInLeftBigUndefined: Self = StObject.set(x, "fadeInLeftBig", js.undefined)
      
      inline def setFadeInLeftUndefined: Self = StObject.set(x, "fadeInLeft", js.undefined)
      
      inline def setFadeInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRight", js.Any.fromFunction1(value))
      
      inline def setFadeInRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRightBig", js.Any.fromFunction1(value))
      
      inline def setFadeInRightBigUndefined: Self = StObject.set(x, "fadeInRightBig", js.undefined)
      
      inline def setFadeInRightUndefined: Self = StObject.set(x, "fadeInRight", js.undefined)
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setFadeInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUp", js.Any.fromFunction1(value))
      
      inline def setFadeInUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUpBig", js.Any.fromFunction1(value))
      
      inline def setFadeInUpBigUndefined: Self = StObject.set(x, "fadeInUpBig", js.undefined)
      
      inline def setFadeInUpUndefined: Self = StObject.set(x, "fadeInUp", js.undefined)
      
      inline def setFadeOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOut", js.Any.fromFunction1(value))
      
      inline def setFadeOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDown", js.Any.fromFunction1(value))
      
      inline def setFadeOutDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDownBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutDownBigUndefined: Self = StObject.set(x, "fadeOutDownBig", js.undefined)
      
      inline def setFadeOutDownUndefined: Self = StObject.set(x, "fadeOutDown", js.undefined)
      
      inline def setFadeOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeft", js.Any.fromFunction1(value))
      
      inline def setFadeOutLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeftBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutLeftBigUndefined: Self = StObject.set(x, "fadeOutLeftBig", js.undefined)
      
      inline def setFadeOutLeftUndefined: Self = StObject.set(x, "fadeOutLeft", js.undefined)
      
      inline def setFadeOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRight", js.Any.fromFunction1(value))
      
      inline def setFadeOutRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRightBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutRightBigUndefined: Self = StObject.set(x, "fadeOutRightBig", js.undefined)
      
      inline def setFadeOutRightUndefined: Self = StObject.set(x, "fadeOutRight", js.undefined)
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setFadeOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUp", js.Any.fromFunction1(value))
      
      inline def setFadeOutUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUpBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutUpBigUndefined: Self = StObject.set(x, "fadeOutUpBig", js.undefined)
      
      inline def setFadeOutUpUndefined: Self = StObject.set(x, "fadeOutUp", js.undefined)
      
      inline def setFlash(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flash", js.Any.fromFunction1(value))
      
      inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      inline def setFlipInX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInX", js.Any.fromFunction1(value))
      
      inline def setFlipInXUndefined: Self = StObject.set(x, "flipInX", js.undefined)
      
      inline def setFlipInY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInY", js.Any.fromFunction1(value))
      
      inline def setFlipInYUndefined: Self = StObject.set(x, "flipInY", js.undefined)
      
      inline def setFlipOutX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutX", js.Any.fromFunction1(value))
      
      inline def setFlipOutXUndefined: Self = StObject.set(x, "flipOutX", js.undefined)
      
      inline def setFlipOutY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutY", js.Any.fromFunction1(value))
      
      inline def setFlipOutYUndefined: Self = StObject.set(x, "flipOutY", js.undefined)
      
      inline def setJello(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "jello", js.Any.fromFunction1(value))
      
      inline def setJelloUndefined: Self = StObject.set(x, "jello", js.undefined)
      
      inline def setLightSpeedIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedIn", js.Any.fromFunction1(value))
      
      inline def setLightSpeedInUndefined: Self = StObject.set(x, "lightSpeedIn", js.undefined)
      
      inline def setLightSpeedOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedOut", js.Any.fromFunction1(value))
      
      inline def setLightSpeedOutUndefined: Self = StObject.set(x, "lightSpeedOut", js.undefined)
      
      inline def setPulse(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "pulse", js.Any.fromFunction1(value))
      
      inline def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      inline def setRotate(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRubberBand(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rubberBand", js.Any.fromFunction1(value))
      
      inline def setRubberBandUndefined: Self = StObject.set(x, "rubberBand", js.undefined)
      
      inline def setShake(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
      
      inline def setShakeUndefined: Self = StObject.set(x, "shake", js.undefined)
      
      inline def setSlideInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInDown", js.Any.fromFunction1(value))
      
      inline def setSlideInDownUndefined: Self = StObject.set(x, "slideInDown", js.undefined)
      
      inline def setSlideInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInLeft", js.Any.fromFunction1(value))
      
      inline def setSlideInLeftUndefined: Self = StObject.set(x, "slideInLeft", js.undefined)
      
      inline def setSlideInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInRight", js.Any.fromFunction1(value))
      
      inline def setSlideInRightUndefined: Self = StObject.set(x, "slideInRight", js.undefined)
      
      inline def setSlideInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInUp", js.Any.fromFunction1(value))
      
      inline def setSlideInUpUndefined: Self = StObject.set(x, "slideInUp", js.undefined)
      
      inline def setSlideOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutDown", js.Any.fromFunction1(value))
      
      inline def setSlideOutDownUndefined: Self = StObject.set(x, "slideOutDown", js.undefined)
      
      inline def setSlideOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutLeft", js.Any.fromFunction1(value))
      
      inline def setSlideOutLeftUndefined: Self = StObject.set(x, "slideOutLeft", js.undefined)
      
      inline def setSlideOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutRight", js.Any.fromFunction1(value))
      
      inline def setSlideOutRightUndefined: Self = StObject.set(x, "slideOutRight", js.undefined)
      
      inline def setSlideOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutUp", js.Any.fromFunction1(value))
      
      inline def setSlideOutUpUndefined: Self = StObject.set(x, "slideOutUp", js.undefined)
      
      inline def setSwing(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "swing", js.Any.fromFunction1(value))
      
      inline def setSwingUndefined: Self = StObject.set(x, "swing", js.undefined)
      
      inline def setTada(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "tada", js.Any.fromFunction1(value))
      
      inline def setTadaUndefined: Self = StObject.set(x, "tada", js.undefined)
      
      inline def setWobble(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "wobble", js.Any.fromFunction1(value))
      
      inline def setWobbleUndefined: Self = StObject.set(x, "wobble", js.undefined)
      
      inline def setZoomIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
      
      inline def setZoomInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInDown", js.Any.fromFunction1(value))
      
      inline def setZoomInDownUndefined: Self = StObject.set(x, "zoomInDown", js.undefined)
      
      inline def setZoomInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInLeft", js.Any.fromFunction1(value))
      
      inline def setZoomInLeftUndefined: Self = StObject.set(x, "zoomInLeft", js.undefined)
      
      inline def setZoomInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInRight", js.Any.fromFunction1(value))
      
      inline def setZoomInRightUndefined: Self = StObject.set(x, "zoomInRight", js.undefined)
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInUp", js.Any.fromFunction1(value))
      
      inline def setZoomInUpUndefined: Self = StObject.set(x, "zoomInUp", js.undefined)
      
      inline def setZoomOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOut", js.Any.fromFunction1(value))
      
      inline def setZoomOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutDown", js.Any.fromFunction1(value))
      
      inline def setZoomOutDownUndefined: Self = StObject.set(x, "zoomOutDown", js.undefined)
      
      inline def setZoomOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutLeft", js.Any.fromFunction1(value))
      
      inline def setZoomOutLeftUndefined: Self = StObject.set(x, "zoomOutLeft", js.undefined)
      
      inline def setZoomOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutRight", js.Any.fromFunction1(value))
      
      inline def setZoomOutRightUndefined: Self = StObject.set(x, "zoomOutRight", js.undefined)
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
      
      inline def setZoomOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutUp", js.Any.fromFunction1(value))
      
      inline def setZoomOutUpUndefined: Self = StObject.set(x, "zoomOutUp", js.undefined)
    }
  }
  
  @js.native
  trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
    extends StObject
       with NativeMethods
       with AnimatableAnimationMethods
       with ClassicComponentClass[AnimatableProperties[S] & P] {
    
    def stopAnimation(): Unit = js.native
    
    def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Unit, easing: Easing): Unit = js.native
    
    def transitionTo[T /* <: S */](toValues: T): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Unit, easing: Easing): Unit = js.native
  }
  
  trait AnimatableProperties[S /* <: js.Object */] extends StObject {
    
    var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[Easing] = js.undefined
    
    var iterationCount: js.UndefOr[Double | infinite] = js.undefined
    
    var iterationDelay: js.UndefOr[Double] = js.undefined
    
    var onAnimationBegin: js.UndefOr[js.Function] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function] = js.undefined
    
    var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
    
    var transition: js.UndefOr[(/* keyof S */ String) | (js.Array[/* keyof S */ String])] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object AnimatableProperties {
    
    inline def apply[S /* <: js.Object */](): AnimatableProperties[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableProperties[S]]
    }
    
    extension [Self <: AnimatableProperties[?], S /* <: js.Object */](x: Self & AnimatableProperties[S]) {
      
      inline def setAnimation(value: Animation | String | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setIterationCount(value: Double | infinite): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      inline def setIterationDelay(value: Double): Self = StObject.set(x, "iterationDelay", value.asInstanceOf[js.Any])
      
      inline def setIterationDelayUndefined: Self = StObject.set(x, "iterationDelay", js.undefined)
      
      inline def setOnAnimationBegin(value: js.Function): Self = StObject.set(x, "onAnimationBegin", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationBeginUndefined: Self = StObject.set(x, "onAnimationBegin", js.undefined)
      
      inline def setOnAnimationEnd(value: js.Function): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnTransitionBegin(value: /* property */ String => Unit): Self = StObject.set(x, "onTransitionBegin", js.Any.fromFunction1(value))
      
      inline def setOnTransitionBeginUndefined: Self = StObject.set(x, "onTransitionBegin", js.undefined)
      
      inline def setOnTransitionEnd(value: /* property */ String => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setTransition(value: (/* keyof S */ String) | (js.Array[/* keyof S */ String])): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: (/* keyof S */ String)*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounce
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.flash
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.jello
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.pulse
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.rotate
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.shake
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.swing
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.tada
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.wobble
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight
  */
  trait Animation extends StObject
  object Animation {
    
    inline def bounce: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounce = "bounce".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounce]
    
    inline def bounceIn: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn = "bounceIn".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn]
    
    inline def bounceInDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown = "bounceInDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown]
    
    inline def bounceInLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft = "bounceInLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft]
    
    inline def bounceInRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight = "bounceInRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight]
    
    inline def bounceInUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp = "bounceInUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp]
    
    inline def bounceOut: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut = "bounceOut".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut]
    
    inline def bounceOutDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown = "bounceOutDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown]
    
    inline def bounceOutLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft = "bounceOutLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft]
    
    inline def bounceOutRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight = "bounceOutRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight]
    
    inline def bounceOutUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp]
    
    inline def fadeIn: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn = "fadeIn".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn]
    
    inline def fadeInDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown = "fadeInDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown]
    
    inline def fadeInDownBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig = "fadeInDownBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig]
    
    inline def fadeInLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft = "fadeInLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft]
    
    inline def fadeInLeftBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig = "fadeInLeftBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig]
    
    inline def fadeInRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight = "fadeInRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight]
    
    inline def fadeInRightBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig = "fadeInRightBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig]
    
    inline def fadeInUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp = "fadeInUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp]
    
    inline def fadeInUpBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig = "fadeInUpBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig]
    
    inline def fadeOut: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut = "fadeOut".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut]
    
    inline def fadeOutDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown = "fadeOutDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown]
    
    inline def fadeOutDownBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig = "fadeOutDownBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig]
    
    inline def fadeOutLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft = "fadeOutLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft]
    
    inline def fadeOutLeftBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig = "fadeOutLeftBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig]
    
    inline def fadeOutRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight = "fadeOutRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight]
    
    inline def fadeOutRightBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig = "fadeOutRightBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig]
    
    inline def fadeOutUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp = "fadeOutUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp]
    
    inline def fadeOutUpBig: typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig = "fadeOutUpBig".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig]
    
    inline def flash: typings.reactNativeAnimatable.reactNativeAnimatableStrings.flash = "flash".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.flash]
    
    inline def flipInX: typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX = "flipInX".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX]
    
    inline def flipInY: typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY = "flipInY".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY]
    
    inline def flipOutX: typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX = "flipOutX".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX]
    
    inline def flipOutY: typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY = "flipOutY".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY]
    
    inline def jello: typings.reactNativeAnimatable.reactNativeAnimatableStrings.jello = "jello".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.jello]
    
    inline def lightSpeedIn: typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn = "lightSpeedIn".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn]
    
    inline def lightSpeedOut: typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut = "lightSpeedOut".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut]
    
    inline def pulse: typings.reactNativeAnimatable.reactNativeAnimatableStrings.pulse = "pulse".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.pulse]
    
    inline def rotate: typings.reactNativeAnimatable.reactNativeAnimatableStrings.rotate = "rotate".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.rotate]
    
    inline def rubberBand: typings.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand = "rubberBand".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand]
    
    inline def shake: typings.reactNativeAnimatable.reactNativeAnimatableStrings.shake = "shake".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.shake]
    
    inline def slideInDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown = "slideInDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown]
    
    inline def slideInLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft = "slideInLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft]
    
    inline def slideInRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight = "slideInRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight]
    
    inline def slideInUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp = "slideInUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp]
    
    inline def slideOutDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown = "slideOutDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown]
    
    inline def slideOutLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft = "slideOutLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft]
    
    inline def slideOutRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight = "slideOutRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight]
    
    inline def slideOutUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp = "slideOutUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp]
    
    inline def swing: typings.reactNativeAnimatable.reactNativeAnimatableStrings.swing = "swing".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.swing]
    
    inline def tada: typings.reactNativeAnimatable.reactNativeAnimatableStrings.tada = "tada".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.tada]
    
    inline def wobble: typings.reactNativeAnimatable.reactNativeAnimatableStrings.wobble = "wobble".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.wobble]
    
    inline def zoomIn: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn = "zoomIn".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn]
    
    inline def zoomInDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown = "zoomInDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown]
    
    inline def zoomInLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft = "zoomInLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft]
    
    inline def zoomInRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight = "zoomInRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight]
    
    inline def zoomInUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp = "zoomInUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp]
    
    inline def zoomOut: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut = "zoomOut".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut]
    
    inline def zoomOutDown: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown = "zoomOutDown".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown]
    
    inline def zoomOutLeft: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft = "zoomOutLeft".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft]
    
    inline def zoomOutRight: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight = "zoomOutRight".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight]
    
    inline def zoomOutUp: typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp = "zoomOutUp".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp]
  }
  
  trait CustomAnimation[T]
    extends StObject
       with /* progress */ NumberDictionary[T] {
    
    var easing: js.UndefOr[Easing] = js.undefined
    
    var from: js.UndefOr[T] = js.undefined
    
    var style: js.UndefOr[T] = js.undefined
    
    var to: js.UndefOr[T] = js.undefined
  }
  object CustomAnimation {
    
    inline def apply[T](): CustomAnimation[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAnimation[T]]
    }
    
    extension [Self <: CustomAnimation[?], T](x: Self & CustomAnimation[T]) {
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setStyle(value: T): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.normal
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.reverse
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.alternate
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def alternate: typings.reactNativeAnimatable.reactNativeAnimatableStrings.alternate = "alternate".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.alternate]
    
    inline def `alternate-reverse`: typings.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`]
    
    inline def normal: typings.reactNativeAnimatable.reactNativeAnimatableStrings.normal = "normal".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.normal]
    
    inline def reverse: typings.reactNativeAnimatable.reactNativeAnimatableStrings.reverse = "reverse".asInstanceOf[typings.reactNativeAnimatable.reactNativeAnimatableStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typings.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = _Easing | EasingFunction
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  type GetPropertyType[B, K /* <: /* keyof B */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  
  trait _Easing extends StObject
}
