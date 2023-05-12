package typings.reactSpringTypes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.reactSpringTypes.reactSpringTypesBooleans.`false`
import typings.reactSpringTypes.reactSpringTypesStrings.prototype
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Use `[T] extends [Any]` to know if a type parameter is `any` */
  @JSImport("@react-spring/types", "Any")
  @js.native
  open class Any () extends StObject {
    
    /* private */ @JSName("_")
    var _underscore: scala.Any = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? keyof T : never
    }}}
    */
  type AllKeys[T] = /* keyof T */ String
  
  /** These types can be animated */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends number ? number : T extends string ? string : T extends std.ReadonlyArray<number | string> ? std.Array<number | string> extends T ? std.ReadonlyArray<number | string> : {[ P in keyof T ]: @react-spring/types.@react-spring/types.Animatable<T[P]>} : never
    }}}
    */
  type Animatable[T] = Double
  
  type AnyFn[In /* <: js.Array[scala.Any] */, Out] = js.Function1[/* args */ In, Out]
  
  /**
    * MIT License
    * Copyright (c) Alec Larson
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in all
    * copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    * SOFTWARE.
    */
  /** Ensure each type of `T` is an array */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends std.ReadonlyArray<any> ? std.Array<DT[number]> extends DT ? std.ReadonlyArray<T extends std.ReadonlyArray<infer U> ? U : T> : DT : std.ReadonlyArray<T extends std.ReadonlyArray<infer U> ? U : T> : never
    }}}
    */
  @js.native
  trait Arrify[T] extends StObject
  
  /** Return the keys of `T` with values that are assignable to `U` */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends object ? U extends object ? {[ P in std.Extract<keyof T, keyof U> ]: T[P] extends U[P]? P : never}[std.Extract<keyof T, keyof U>] : never : never
    }}}
    */
  @js.native
  trait AssignableKeys[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends react.react.ComponentClass<infer P, react.react.ComponentState> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
    }}}
    */
  type ComponentPropsWithRef[T /* <: ElementType[scala.Any] */] = ComponentProps[T]
  
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | LeafFunctionComponent[P]
  
  /** Better type errors for overloads with generic types */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [@react-spring/types.@react-spring/types.Any] ? U : [T] extends [U] ? T : U
    }}}
    */
  type Constrain[T, U] = U
  
  /** An object that needs to be manually disposed of */
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  type ElementType[P] = typings.react.mod.ElementType[P] | LeafFunctionComponent[P]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    @react-spring/types.@react-spring/types.AllKeys<T> extends infer K ? T extends any ? @react-spring/types.@react-spring/types.Remap<@react-spring/types.@react-spring/types.LoosePick<T, K> & {[ P in std.Exclude<K & keyof any, keyof T> ]:? undefined}> : never : never
    }}}
    */
  @js.native
  trait Exclusive[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringTypes.reactSpringTypesStrings.identity
    - typings.reactSpringTypes.reactSpringTypesStrings.clamp
    - typings.reactSpringTypes.reactSpringTypesStrings.extend
  */
  trait ExtrapolateType extends StObject
  object ExtrapolateType {
    
    inline def clamp: typings.reactSpringTypes.reactSpringTypesStrings.clamp = "clamp".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.clamp]
    
    inline def extend: typings.reactSpringTypes.reactSpringTypesStrings.extend = "extend".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.extend]
    
    inline def identity: typings.reactSpringTypes.reactSpringTypesStrings.identity = "identity".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.identity]
  }
  
  type Falsy = js.UndefOr[`false` | Null]
  
  type InterpolatorArgs[Input, Output] = (js.Array[InterpolatorConfig[Output] | (InterpolatorFn[Arrify[Input], Output])]) | (js.Tuple3[
    js.Array[Double], 
    js.Array[Constrain[Output, Animatable[scala.Any]]], 
    js.UndefOr[ExtrapolateType]
  ])
  
  trait InterpolatorConfig[Output] extends StObject {
    
    /**
      * Custom easing to apply in interpolator.
      */
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    /**
      * What happens when the spring exceeds its target value.
      * Shortcut to set `extrapolateLeft` and `extrapolateRight`.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * What happens when the spring goes below its target value.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * What happens when the spring exceeds its target value.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * Transformation to apply to the value before interpolation.
      */
    var map: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    
    /**
      * Output values from the interpolation function. Should match the length of the `range` array.
      */
    var output: js.Array[Constrain[Output, Animatable[scala.Any]]]
    
    /**
      * Input ranges mapping the interpolation to the output values.
      *
      * @example
      *
      *   range: [0, 0.5, 1], output: ['yellow', 'orange', 'red']
      *
      * @default [0,1]
      */
    var range: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object InterpolatorConfig {
    
    inline def apply[Output](output: js.Array[Constrain[Output, Animatable[scala.Any]]]): InterpolatorConfig[Output] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolatorConfig[Output]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpolatorConfig[?], Output] (val x: Self & InterpolatorConfig[Output]) extends AnyVal {
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExtrapolate(value: ExtrapolateType): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateLeft(value: ExtrapolateType): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
      
      inline def setExtrapolateRight(value: ExtrapolateType): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
      
      inline def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
      
      inline def setMap(value: /* value */ Double => Double): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOutput(value: js.Array[Constrain[Output, Animatable[scala.Any]]]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: (Constrain[Output, Animatable[scala.Any]])*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  @js.native
  trait InterpolatorFactory extends StObject {
    
    def apply[Output](config: InterpolatorConfig[Output]): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Output](range: js.Array[Double], output: js.Array[Constrain[Output, Animatable[scala.Any]]]): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Output](
      range: js.Array[Double],
      output: js.Array[Constrain[Output, Animatable[scala.Any]]],
      extrapolate: ExtrapolateType
    ): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Input, Output](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<Input, Output> is not an array type */ args: InterpolatorArgs[Input, Output]
    ): InterpolatorFn[Input, Output] = js.native
    def apply[Input, Output](interpolator: InterpolatorFn[Input, Output]): scala.Any = js.native
  }
  
  type InterpolatorFn[Input, Output] = js.Function1[/* inputs */ Arrify[Input], Output]
  
  /** Convert a union to an intersection */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait Intersect[U] extends StObject
  
  @js.native
  trait LeafFunctionComponent[P] extends StObject {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type Lookup[T] = StringDictionary[T]
  
  type LoosePick[T, K] = Pick[T, K & (/* keyof T */ String)]
  
  /** Override the property types of `A` with `B` and merge any new properties */
  type Merge[A, B] = Remap[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof A ]: P extends keyof B? B[P] : A[P]} */ js.Any) & (Omit[B, /* keyof A */ String])
  ]
  
  type MergeDefaults[T /* <: js.Object */, U /* <: Partial[T] */] = Remap[
    (Omit[T, /* keyof U */ String]) & (Partial[Pick[T, Extract[/* keyof U */ String, /* keyof T */ String]]])
  ]
  
  type MergeUnknown[T, U] = Remap[T & (Omit[U, /* keyof T */ String])]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
  
  /** Intersect a union of objects but merge property types with _unions_ */
  type ObjectFromUnion[T /* <: js.Object */] = Remap[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof @react-spring/types.@react-spring/types.Intersect<T> ]: T extends infer U? P extends keyof U? U[P] : never : never} */ js.Any
  ]
  
  /** Ensure the given type is an object type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends object ? T : {}
    }}}
    */
  type ObjectType[T] = T
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OneOrMore[T] = T | js.Array[T]
  
  type Overwrite[T, U] = Remap[(Omit[T, /* keyof U */ String]) & U]
  
  type Partial[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? T[P] | undefined} */ js.Any
  
  type Pick[T, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: T[P]} */ js.Any
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
  
  /** Try to simplify `&` out of an object type */
  type Remap[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any
  
  type StaticProps[T] = Omit[T, (/* keyof T */ String) & prototype]
  
  /** Intersected with other object types to allow for unknown properties */
  type UnknownProps = Lookup[scala.Any]
}
