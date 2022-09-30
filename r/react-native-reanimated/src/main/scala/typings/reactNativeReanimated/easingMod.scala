package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingMod {
  
  object Easing {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.back")
    @js.native
    def back: js.Function1[/* s */ js.UndefOr[Double], js.Function1[/* t */ Double, Double]] = js.native
    inline def back_=(x: js.Function1[/* s */ js.UndefOr[Double], js.Function1[/* t */ Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.bezier")
    @js.native
    def bezier: js.Function4[/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, Factory] = js.native
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.bezierFn")
    @js.native
    def bezierFn: js.Function4[
        /* x1 */ Double, 
        /* y1 */ Double, 
        /* x2 */ Double, 
        /* y2 */ Double, 
        js.Function1[/* x */ Double, Double]
      ] = js.native
    inline def bezierFn_=(
      x: js.Function4[
          /* x1 */ Double, 
          /* y1 */ Double, 
          /* x2 */ Double, 
          /* y2 */ Double, 
          js.Function1[/* x */ Double, Double]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bezierFn")(x.asInstanceOf[js.Any])
    
    inline def bezier_=(x: js.Function4[/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, Factory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bezier")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.bounce")
    @js.native
    def bounce: js.Function1[/* t */ Double, Double] = js.native
    inline def bounce_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounce")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.circle")
    @js.native
    def circle: js.Function1[/* t */ Double, Double] = js.native
    inline def circle_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.cubic")
    @js.native
    def cubic: js.Function1[/* t */ Double, Double] = js.native
    inline def cubic_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.ease")
    @js.native
    def ease: js.Function1[/* t */ Double, Double] = js.native
    inline def ease_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.elastic")
    @js.native
    def elastic: js.Function1[/* bounciness */ js.UndefOr[Double], EasingFn] = js.native
    inline def elastic_=(x: js.Function1[/* bounciness */ js.UndefOr[Double], EasingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elastic")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.exp")
    @js.native
    def exp: js.Function1[/* t */ Double, Double] = js.native
    inline def exp_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exp")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.in")
    @js.native
    def in: js.Function1[/* easing */ EasingFn, EasingFn] = js.native
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.inOut")
    @js.native
    def inOut: js.Function1[/* easing */ EasingFn, EasingFn] = js.native
    inline def inOut_=(x: js.Function1[/* easing */ EasingFn, EasingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inOut")(x.asInstanceOf[js.Any])
    
    inline def in_=(x: js.Function1[/* easing */ EasingFn, EasingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("in")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.linear")
    @js.native
    def linear: js.Function1[/* t */ Double, Double] = js.native
    inline def linear_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.out")
    @js.native
    def out: js.Function1[/* easing */ EasingFn, EasingFn] = js.native
    inline def out_=(x: js.Function1[/* easing */ EasingFn, EasingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("out")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.poly")
    @js.native
    def poly: js.Function1[/* n */ Double, EasingFn] = js.native
    inline def poly_=(x: js.Function1[/* n */ Double, EasingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poly")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.quad")
    @js.native
    def quad: js.Function1[/* t */ Double, Double] = js.native
    inline def quad_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/Easing", "Easing.sin")
    @js.native
    def sin: js.Function1[/* t */ Double, Double] = js.native
    inline def sin_=(x: js.Function1[/* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sin")(x.asInstanceOf[js.Any])
  }
  
  trait EasingFactoryFn extends StObject {
    
    def factory(): EasingFn
  }
  object EasingFactoryFn {
    
    inline def apply(factory: () => EasingFn): EasingFactoryFn = {
      val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
      __obj.asInstanceOf[EasingFactoryFn]
    }
    
    extension [Self <: EasingFactoryFn](x: Self) {
      
      inline def setFactory(value: () => EasingFn): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    }
  }
  
  type EasingFn = js.Function1[/* t */ Double, Double]
}
