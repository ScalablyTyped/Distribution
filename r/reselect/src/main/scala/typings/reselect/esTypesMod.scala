package typings.reselect

import org.scalablytyped.runtime.StringDictionary
import typings.reselect.anon.Length
import typings.reselect.anon.ToStringTag
import typings.reselect.reselectInts.`1`
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends (args : infer A): infer R ? (args : reselect.reselect/es/types.ExpandRecursively<A>): reselect.reselect/es/types.ExpandRecursively<R> : T extends object ? T extends infer O ? {[ K in keyof O ]: reselect.reselect/es/types.ExpandRecursively<O[K]>} : never : T
    }}}
    */
  type ExpandRecursively[T] = T
  
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
  
  type GetStateFromSelectors[S /* <: SelectorArray */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.reselect/es/versionedTypes/ts47-mergeParameters.MergeParameters<S>[0] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [U1] extends [U] ? 1 : 0
    }}}
    */
  type Has[U, U1] = `1`
  
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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    B extends 1 ? Then : Else
    }}}
    */
  type If2[B /* <: Boolean2 */, Then, Else] = Then
  
  type InstanceOf[V, T] = And[Matches[V, T], Not[Matches[T, V]]]
  
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
  
  type Mapped[T] = Identity[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: T[k]} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends T ? '1' : '0'
    }}}
    */
  type Matches[V, T] = typings.reselect.reselectStrings.`1`
  
  type Not[T /* <: Bool */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.anon.0[T] */ js.Any
  
  type Obj[T] = StringDictionary[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    KS extends [infer K, ...infer KT] ? reselect.reselect/es/types.ObjValueTuple<T, KT, [...R, T[K & keyof T]]> : R
    }}}
    */
  type ObjValueTuple[T, KS /* <: js.Array[Any] */, R /* <: js.Array[Any] */] = R
  
  type OutputParametricSelector[State, Props, Result, Combiner /* <: UnknownFunction */, Keys] = (ParametricSelector[State, Props, Result]) & (OutputSelectorFields[Combiner, Keys])
  
  type OutputSelector[S /* <: SelectorArray */, Result, Combiner /* <: UnknownFunction */, Params /* <: js.Array[Any] */, // MergeParameters<S>
  Keys] = (Selector[GetStateFromSelectors[S], Result, Params]) & (OutputSelectorFields[Combiner, Keys])
  
  trait OutputSelectorFields[Combiner /* <: UnknownFunction */, Keys] extends StObject {
    
    /** An array of the input selectors */
    var dependencies: SelectorArray
    
    /** Returns the last result calculated by the selector */
    def lastResult(): ReturnType[Combiner]
    
    /** The same function, memoized */
    var memoizedResultFunc: Combiner & Keys
    
    /** Counts the number of times the output has been recalculated */
    def recomputations(): Double
    
    /** Resets the count of recomputations count to 0 */
    def resetRecomputations(): Double
    
    /** The final function passed to `createSelector` */
    var resultFunc: Combiner
  }
  object OutputSelectorFields {
    
    inline def apply[Combiner /* <: UnknownFunction */, Keys](
      dependencies: SelectorArray,
      lastResult: () => ReturnType[Combiner],
      memoizedResultFunc: Combiner & Keys,
      recomputations: () => Double,
      resetRecomputations: () => Double,
      resultFunc: Combiner
    ): OutputSelectorFields[Combiner, Keys] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lastResult = js.Any.fromFunction0(lastResult), memoizedResultFunc = memoizedResultFunc.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputSelectorFields[Combiner, Keys]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputSelectorFields[?, ?], Combiner /* <: UnknownFunction */, Keys] (val x: Self & (OutputSelectorFields[Combiner, Keys])) extends AnyVal {
      
      inline def setDependencies(value: SelectorArray): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: (Selector[Any, Any, js.Array[Any]])*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setLastResult(value: () => ReturnType[Combiner]): Self = StObject.set(x, "lastResult", js.Any.fromFunction0(value))
      
      inline def setMemoizedResultFunc(value: Combiner & Keys): Self = StObject.set(x, "memoizedResultFunc", value.asInstanceOf[js.Any])
      
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    reselect.reselect/es/types.Tail<S> extends [unknown] ? S : reselect.reselect/es/types.Tail<S> extends std.Array<std.Array<unknown>> ? reselect.reselect/es/types.ReverseHead<reselect.reselect/es/types.Tail<S>> : never
    }}}
    */
  type ReverseHead[S /* <: js.Array[js.Array[Any]] */] = S
  
  type ReverseTail[S] = _ReverseTail[_ReverseTail[S]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [Params] extends [never] ? (state : State): Result : (state : State, params : Params): Result
    }}}
    */
  type Selector[State, Result, Params /* <: scala.Nothing | js.Array[Any] */] = js.Function1[/* state */ State, Result]
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    true extends N ? [] : reselect.reselect/es/types.Push<reselect.reselect/es/types.TuplifyUnion<std.Exclude<T, L>, reselect.reselect/es/types.LastOf<std.Exclude<T, L>>, [std.Exclude<T, L>] extends [never] ? true : false>, L>
    }}}
    */
  type TuplifyUnion[T, L, N] = js.Array[Any]
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    reselect.reselect/es/types.Tail<S> extends [unknown] ? [reselect.reselect/es/types.Head<S>] : reselect.reselect/es/types.Tail<S> extends std.Array<unknown> ? [reselect.reselect/es/types.Head<S>, ...reselect.reselect/es/types._ReverseTail<reselect.reselect/es/types.Tail<S>>] : never
    }}}
    */
  type _ReverseTail[S] = js.Array[Head[S]]
}
