package typings.reselect

import org.scalablytyped.runtime.StringDictionary
import typings.reselect.anon.Length
import typings.reselect.anon.ToStringTag
import typings.std.Generator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends any ? {[ K in keyof A ]: K}[number] : never
    }}}
    */
  @js.native
  trait AllArrayKeys[A /* <: js.Array[Any] */] extends StObject
  
  type And[A /* <: Bool */, B /* <: Bool */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.anon.111Obj0ObjObj0[A][B] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.reselect.reselectStrings.`0`
    - typings.reselect.reselectStrings.`1`
  */
  trait Bool extends StObject
  object Bool {
    
    inline def `0`: typings.reselect.reselectStrings.`0` = "0".asInstanceOf[typings.reselect.reselectStrings.`0`]
    
    inline def `1`: typings.reselect.reselectStrings.`1` = "1".asInstanceOf[typings.reselect.reselectStrings.`1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reselect.reselectInts.`0`
    - typings.reselect.reselectInts.`1`
  */
  trait Boolean2 extends StObject
  object Boolean2 {
    
    inline def `0`: typings.reselect.reselectInts.`0` = 0.asInstanceOf[typings.reselect.reselectInts.`0`]
    
    inline def `1`: typings.reselect.reselectInts.`1` = 1.asInstanceOf[typings.reselect.reselectInts.`1`]
  }
  
  type BuiltIn = js.Function | js.Error | js.Date | ToStringTag | js.RegExp | (Generator[Any, Any, Any])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [unknown, ...infer U] ? U : never
    }}}
    */
  @js.native
  trait DropFirst[T /* <: js.Array[Any] */] extends StObject
  
  /** An object with no fields */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in any ]: never}
    }}}
    */
  @js.native
  trait EmptyObject extends StObject
  
  type EqualityFn = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : infer A): infer R ? (args : reselect.reselect/es/types.Expand<A>): reselect.reselect/es/types.Expand<R> : T extends infer O ? {[ K in keyof O ]: O[K]} : never
    }}}
    */
  @js.native
  trait Expand[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: T[index] extends T[number]? reselect.reselect/es/types.Expand<T[index]> : never}
    }}}
    */
  @js.native
  trait ExpandItems[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : infer A): infer R ? (args : reselect.reselect/es/types.ExpandRecursively<A>): reselect.reselect/es/types.ExpandRecursively<R> : T extends object ? T extends infer O ? {[ K in keyof O ]: reselect.reselect/es/types.ExpandRecursively<O[K]>} : never : T
    }}}
    */
  @js.native
  trait ExpandRecursively[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: T[index] extends T[number]? std.Parameters<T[index]> : never}
    }}}
    */
  @js.native
  trait ExtractParams[T /* <: js.Array[UnknownFunction] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: T[index] extends T[number]? std.ReturnType<T[index]> : never}
    }}}
    */
  @js.native
  trait ExtractReturnType[T /* <: js.Array[UnknownFunction] */] extends StObject
  
  type GetParamsFromSelectors[S /* <: SelectorArray */, RemainingItems /* <: js.Array[Any] */] = RemainingItems
  
  type GetStateFromSelectors[S /* <: SelectorArray */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.reselect/es/types.MergeParameters<S, reselect.reselect/es/types.ExtractParams<S>, reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.TuplifyUnion<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.LastOf<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>>, [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>] extends [never] ? true : false>, reselect.reselect/es/types.LongestArray<reselect.reselect/es/types.TuplifyUnion<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.LastOf<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>>, [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>] extends [never] ? true : false>>>[0] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [U1] extends [U] ? 1 : 0
    }}}
    */
  @js.native
  trait Has[U, U1] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [any, ...std.Array<any>] ? T[0] : never
    }}}
    */
  @js.native
  trait Head[T] extends StObject
  
  type Identity[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    B extends 1 ? Then : Else
    }}}
    */
  @js.native
  trait If2[B /* <: Boolean2 */, Then, Else] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [undefined | null] ? True : False
    }}}
    */
  @js.native
  trait IfJustNullish[T, True, False] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends reselect.reselect/es/types.EmptyObject ? never : T
    }}}
    */
  @js.native
  trait IgnoreInvalidIntersections[T] extends StObject
  
  type InstanceOf[V, T] = And[Matches[V, T], Not[Matches[T, V]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    reselect.reselect/es/types.IsTuple<T> extends '0' ? T[0] : reselect.reselect/es/types._IntersectAll<T, unknown>
    }}}
    */
  @js.native
  trait IntersectAll[T /* <: js.Array[Any] */] extends StObject
  
  type IsArrayType[T] = Matches[T, js.Array[Any]]
  
  type IsTuple[T /* <: Length */] = And[
    IsArrayType[T], 
    InstanceOf[
      /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any, 
      Double
    ]
  ]
  
  type Key = String | Double | js.Symbol
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    reselect.reselect/es/types.UnionToIntersection<T extends any ? (): T : never> extends (): infer R ? R : never
    }}}
    */
  @js.native
  trait LastOf[T] extends StObject
  
  type List[A] = js.Array[A]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? L1 extends unknown ? {  0 :L1,   1 :L}[reselect.reselect/es/types.Has<keyof L, keyof L1>] : never : never
    }}}
    */
  @js.native
  trait Longest[L /* <: typings.reselect.esTypesMod.List[Any] */, L1 /* <: typings.reselect.esTypesMod.List[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    reselect.reselect/es/types.IsTuple<S> extends '0' ? S[0] : S extends [std.Array<any>, std.Array<any>] ? reselect.reselect/es/types.Longest<S[0], S[1]> : S extends [std.Array<any>, std.Array<any>, ...infer Rest] ? reselect.reselect/es/types.Longest<reselect.reselect/es/types.Longest<S[0], S[1]>, Rest extends std.Array<std.Array<any>> ? reselect.reselect/es/types.LongestArray<Rest> : []> : S extends [std.Array<any>] ? S[0] : never
    }}}
    */
  @js.native
  trait LongestArray[S /* <: js.Array[js.Array[Any]] */] extends StObject
  
  type Mapped[T] = Identity[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: T[k]} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends T ? '1' : '0'
    }}}
    */
  @js.native
  trait Matches[V, T] extends StObject
  
  type MergeParameters[T /* <: js.Array[UnknownFunction] */, ParamsArrays /* <: js.Array[js.Array[Any]] */, TransposedArrays, TuplifiedArrays /* <: js.Array[Any] */, LongestParamsArray /* <: js.Array[Any] */] = ExpandItems[
    RemoveNames[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ index in keyof LongestParamsArray ]: LongestParamsArray[index] extends LongestParamsArray[number]? reselect.reselect/es/types.IgnoreInvalidIntersections<reselect.reselect/es/types.IntersectAll<LongestParamsArray[index]>> : never} */ js.Any
    ]
  ]
  
  type Not[T /* <: Bool */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.anon.0[T] */ js.Any
  
  type Obj[T] = StringDictionary[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    KS extends [infer K, ...infer KT] ? reselect.reselect/es/types.ObjValueTuple<T, KT, [...R, T[K & keyof T]]> : R
    }}}
    */
  @js.native
  trait ObjValueTuple[T, KS /* <: js.Array[Any] */, R /* <: js.Array[Any] */] extends StObject
  
  type OutputParametricSelector[State, Props, Result, Combiner /* <: UnknownFunction */] = (ParametricSelector[State, Props, Result]) & OutputSelectorFields[Combiner]
  
  type OutputSelector[S /* <: SelectorArray */, Result, Combiner /* <: UnknownFunction */, Params /* <: js.Array[Any] */] = (Selector[GetStateFromSelectors[S], Result, Params]) & OutputSelectorFields[Combiner]
  
  trait OutputSelectorFields[Combiner /* <: UnknownFunction */] extends StObject {
    
    /** An array of the input selectors */
    var dependencies: SelectorArray
    
    /** Returns the last result calculated by the selector */
    def lastResult(): ReturnType[Combiner]
    
    /** The same function, memoized */
    var memoizedResultFunc: Combiner
    
    /** Counts the number of times the output has been recalculated */
    def recomputations(): Double
    
    /** Resets the count of recomputations count to 0 */
    def resetRecomputations(): Double
    
    /** The final function passed to `createSelector` */
    var resultFunc: Combiner
  }
  object OutputSelectorFields {
    
    inline def apply[Combiner /* <: UnknownFunction */](
      dependencies: SelectorArray,
      lastResult: () => ReturnType[Combiner],
      memoizedResultFunc: Combiner,
      recomputations: () => Double,
      resetRecomputations: () => Double,
      resultFunc: Combiner
    ): OutputSelectorFields[Combiner] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lastResult = js.Any.fromFunction0(lastResult), memoizedResultFunc = memoizedResultFunc.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputSelectorFields[Combiner]]
    }
    
    extension [Self <: OutputSelectorFields[?], Combiner /* <: UnknownFunction */](x: Self & OutputSelectorFields[Combiner]) {
      
      inline def setDependencies(value: SelectorArray): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: (Selector[Any, Any, js.Array[Any]])*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setLastResult(value: () => ReturnType[Combiner]): Self = StObject.set(x, "lastResult", js.Any.fromFunction0(value))
      
      inline def setMemoizedResultFunc(value: Combiner): Self = StObject.set(x, "memoizedResultFunc", value.asInstanceOf[js.Any])
      
      inline def setRecomputations(value: () => Double): Self = StObject.set(x, "recomputations", js.Any.fromFunction0(value))
      
      inline def setResetRecomputations(value: () => Double): Self = StObject.set(x, "resetRecomputations", js.Any.fromFunction0(value))
      
      inline def setResultFunc(value: Combiner): Self = StObject.set(x, "resultFunc", value.asInstanceOf[js.Any])
    }
  }
  
  type ParametricSelector[State, Props, Result] = Selector[
    State, 
    Result, 
    /* import warning: importer.ImportType#apply c repeated non-array type: any */ js.Array[Any]
  ]
  
  /**
    * Code to convert a union of values into a tuple.
    * Source: https://stackoverflow.com/a/55128956/62937
    */
  type Push[T /* <: js.Array[Any] */, V] = /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
  
  /**
    * Removes field names from a tuple
    * Source: https://stackoverflow.com/a/63571175/62937
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [any, ...T] extends [any, ...infer U] ? U : never
    }}}
    */
  @js.native
  trait RemoveNames[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [Params] extends [never] ? (state : State): Result : (state : State, params : Params): Result
    }}}
    */
  @js.native
  trait Selector[State, Result, Params /* <: scala.Nothing | js.Array[Any] */] extends StObject
  
  type SelectorArray = js.Array[Selector[Any, Any, js.Array[Any]]]
  
  type SelectorResultArray[Selectors /* <: SelectorArray */] = ExtractReturnType[Selectors]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends [any, ...infer Rest] ? Rest : never
    }}}
    */
  @js.native
  trait Tail[A] extends StObject
  
  /**
    * Transposes nested arrays
    * Source: https://stackoverflow.com/a/66303933/62937
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T[std.Extract<keyof T, T extends std.Array<any> ? number : unknown>] extends infer V ? {[ K in keyof V ]: {[ L in keyof T ]: K extends keyof T[L]? T[L][K] : undefined}} : never
    }}}
    */
  @js.native
  trait Transpose[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    true extends N ? [] : reselect.reselect/es/types.Push<reselect.reselect/es/types.TuplifyUnion<std.Exclude<T, L>, reselect.reselect/es/types.LastOf<std.Exclude<T, L>>, [std.Exclude<T, L>] extends [never] ? true : false>, L>
    }}}
    */
  @js.native
  trait TuplifyUnion[T, L, N] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Union extends unknown ? (distributedUnion : Union): void : never extends (mergedIntersection : infer Intersection): void ? Intersection : never
    }}}
    */
  @js.native
  trait UnionToIntersection[Union] extends StObject
  
  @js.native
  trait UnknownFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  /** Intersect a pair of types together, for use in parameter type calculation.
    * This is made much more complex because we need to correctly handle cases
    * where a function has fewer parameters and the type is `undefined`, as well as
    * optional params or params that have `null` or `undefined` as part of a union.
    *
    * If the next type by itself is `null` or `undefined`, we exclude it and return
    * the other type. Otherwise, intersect them together.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer First, ...infer Rest] ? reselect.reselect/es/types._IntersectAll<Rest, reselect.reselect/es/types.IfJustNullish<First, R, R & First>> : R
    }}}
    */
  @js.native
  trait _IntersectAll[T, R] extends StObject
}
