package typings.reactSpringZdog

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedMod {
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]]]
  
  type AnimatedLeaf[T] = Any
  
  type AnimatedPrimitives = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.Primitives ]: @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedComponent<@react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.Primitives[P]>}
    */ typings.reactSpringZdog.reactSpringZdogStrings.AnimatedPrimitives & TopLevel[Primitives]
  
  type AnimatedProp[T] = js.UndefOr[Any | AnimatedLeaf[Any] | AnimatedStyle[Any]]
  
  type AnimatedProps[Props /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    */ typings.reactSpringZdog.reactSpringZdogStrings.AnimatedProps & TopLevel[Any]
  
  type AnimatedStyle[T] = js.UndefOr[
    Any | AnimatedLeaf[Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedStyle<any[P]>}
    */ typings.reactSpringZdog.reactSpringZdogStrings.AnimatedStyle & TopLevel[Any])
  ]
  
  type Primitives = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in @react-spring/zdog.@react-spring/zdog/dist/declarations/src/primitives.ZdogElements ]: react.react.ElementType<any>}
    */ typings.reactSpringZdog.reactSpringZdogStrings.Primitives & TopLevel[Any]
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
