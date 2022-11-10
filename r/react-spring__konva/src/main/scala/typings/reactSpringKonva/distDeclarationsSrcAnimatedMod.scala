package typings.reactSpringKonva

import typings.react.mod.ForwardRefExoticComponent
import typings.reactSpringTypes.utilMod.ComponentPropsWithRef
import typings.reactSpringTypes.utilMod.ElementType
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
    {[ P in @react-spring/konva.@react-spring/konva/dist/declarations/src/primitives.Primitives ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedComponent<@react-spring/konva.@react-spring/konva/dist/declarations/src/primitives.KonvaExports[P]>}
    }}}
    */
  @js.native
  trait AnimatedPrimitives extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends object ? [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react.react.CSSProperties>] extends [never] ? DT extends std.ReadonlyArray<any> ? @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyles<DT> : DT : @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyle<T> : DT | @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  type AnimatedProp[T] = Unit
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends object ? {[ P in keyof DT ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyle<DT[P]>} : DT | @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  type AnimatedStyle[T] = Unit
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: [T[P]] extends [infer DT]? DT extends object? [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react.react.CSSProperties>] extends [never]? DT extends std.ReadonlyArray<any>? @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyles<DT> : DT : {[ P in keyof DT ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedProp<DT[P]>} : DT : never}
    }}}
    */
  @js.native
  trait AnimatedStyles[T /* <: js.Array[Any] */] extends StObject
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
