package typings.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.anon.Animated
import typings.reactSpringAnimated.anon.PartialHostConfig
import typings.reactSpringAnimated.distDeclarationsSrcWithAnimatedMod.AnimatableComponent
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCreateHostMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/createHost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHost(components: js.Array[AnimatableComponent]): Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[Animated]
  inline def createHost(
    components: js.Array[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[Animated]
  inline def createHost(components: StringDictionary[AnimatableComponent]): Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[Animated]
  inline def createHost(
    components: StringDictionary[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[Animated]
  
  trait HostConfig extends StObject {
    
    /** Provide custom logic for native updates */
    def applyAnimatedValues(node: Any, props: Lookup[Any]): Boolean | Unit
    
    /** Wrap the `style` prop with an animated node */
    def createAnimatedStyle(style: Lookup[Any]): typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]
    
    /** Intercept props before they're passed to an animated component */
    def getComponentProps(props: Lookup[Any]): Any
  }
  object HostConfig {
    
    inline def apply(
      applyAnimatedValues: (Any, Lookup[Any]) => Boolean | Unit,
      createAnimatedStyle: Lookup[Any] => typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any],
      getComponentProps: Lookup[Any] => Any
    ): HostConfig = {
      val __obj = js.Dynamic.literal(applyAnimatedValues = js.Any.fromFunction2(applyAnimatedValues), createAnimatedStyle = js.Any.fromFunction1(createAnimatedStyle), getComponentProps = js.Any.fromFunction1(getComponentProps))
      __obj.asInstanceOf[HostConfig]
    }
    
    extension [Self <: HostConfig](x: Self) {
      
      inline def setApplyAnimatedValues(value: (Any, Lookup[Any]) => Boolean | Unit): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      inline def setCreateAnimatedStyle(value: Lookup[Any] => typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      inline def setGetComponentProps(value: Lookup[Any] => Any): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WithAnimated
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def apply(Component: AnimatableComponent): Any = js.native
  }
}
