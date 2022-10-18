package typings.reactSpringZdog

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod {
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Exclude<T, object | void> | std.Extract<T, std.ReadonlyArray<number | string>> extends infer U ? [U] extends [never] ? never : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<U | Exclude<T, object | void>> * / any : never
    }}}
    */
  @js.native
  trait AnimatedLeaf[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.Primitives ]: @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedComponent<@react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.Primitives[P]>}
    }}}
    */
  @js.native
  trait AnimatedPrimitives extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends object ? @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedStyle<T> : DT | @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  @js.native
  trait AnimatedProp[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends object ? {[ P in keyof DT ]: @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedStyle<DT[P]>} : DT | @react-spring/zdog.@react-spring/zdog/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  @js.native
  trait AnimatedStyle[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in @react-spring/zdog.@react-spring/zdog/dist/declarations/src/primitives.ZdogElements ]: react.react.ElementType<any>}
    }}}
    */
  @js.native
  trait Primitives extends StObject
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
