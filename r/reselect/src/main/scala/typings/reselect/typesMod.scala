package typings.reselect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reselect.anon.Length
import typings.reselect.anon.ToStringTag
import typings.std.Generator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AllArrayKeys[A /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: K}[number] */ js.Any
  
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
    - typings.reselect.reselectNumbers.`0`
    - typings.reselect.reselectNumbers.`1`
  */
  trait Boolean2 extends StObject
  object Boolean2 {
    
    inline def `0`: typings.reselect.reselectNumbers.`0` = 0.asInstanceOf[typings.reselect.reselectNumbers.`0`]
    
    inline def `1`: typings.reselect.reselectNumbers.`1` = 1.asInstanceOf[typings.reselect.reselectNumbers.`1`]
  }
  
  type BuiltIn = js.Function | js.Error | js.Date | ToStringTag | js.RegExp | (Generator[Any, Any, Any])
  
  type DropFirst[T /* <: js.Array[Any] */] = Any
  
  /** An object with no fields */
  type EmptyObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in any ]: never}
    */ typings.reselect.reselectStrings.EmptyObject & TopLevel[Any]
  
  type EqualityFn = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  type Expand[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K]}
    */ typings.reselect.reselectStrings.Expand & TopLevel[Any]) | (js.Function1[/* args */ Any, Any])
  
  type ExpandItems[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ index in keyof T ]: T[index] extends T[number]? reselect.reselect/es/types.Expand<T[index]> : never}
    */ typings.reselect.reselectStrings.ExpandItems & TopLevel[Any]
  
  type ExpandRecursively[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any}
    */ typings.reselect.reselectStrings.ExpandRecursively & TopLevel[Any]) | (js.Function1[/* args */ Any, Any])
  
  type ExtractParams[T /* <: js.Array[UnknownFunction] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ index in keyof T ]: T[index] extends T[number]? std.Parameters<T[index]> : never}
    */ typings.reselect.reselectStrings.ExtractParams & TopLevel[Any]
  
  type ExtractReturnType[T /* <: js.Array[UnknownFunction] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ index in keyof T ]: T[index] extends T[number]? std.ReturnType<T[index]> : never}
    */ typings.reselect.reselectStrings.ExtractReturnType & TopLevel[Any]
  
  type GetParamsFromSelectors[S /* <: SelectorArray */, RemainingItems /* <: js.Array[Any] */] = RemainingItems
  
  type GetStateFromSelectors[S /* <: SelectorArray */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.reselect/es/types.MergeParameters<S, reselect.reselect/es/types.ExtractParams<S>, reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.TuplifyUnion<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.LastOf<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>>, [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>] extends [never] ? true : false>, reselect.reselect/es/types.LongestArray<reselect.reselect/es/types.TuplifyUnion<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>, reselect.reselect/es/types.LastOf<reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>>, [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<S>>] extends [never] ? true : false>>>[0] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.reselect.reselectNumbers.`0`
    - typings.reselect.reselectNumbers.`1`
  */
  trait Has[U, U1] extends StObject
  
  type Head[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  
  type Identity[T] = T
  
  type If2[B /* <: Boolean2 */, Then, Else] = Else | Then
  
  type IfJustNullish[T, True, False] = False | True
  
  type IgnoreInvalidIntersections[T] = T
  
  type InstanceOf[V, T] = And[Matches[V, T], Not[Matches[T, V]]]
  
  type IntersectAll[T /* <: js.Array[Any] */] = (_IntersectAll[T, Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  
  type IsArrayType[T] = Matches[T, js.Array[Any]]
  
  type IsTuple[T /* <: Length */] = And[
    IsArrayType[T], 
    InstanceOf[
      /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any, 
      Double
    ]
  ]
  
  type Key = String | Double | js.Symbol
  
  type LastOf[T] = Any
  
  type List[A] = js.Array[A]
  
  type Longest[L /* <: List[Any] */, L1 /* <: List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.anon.0<L1, L>[reselect.reselect/es/types.Has<keyof L, keyof L1>] */ js.Any
  
  type LongestArray[S /* <: js.Array[js.Array[Any]] */] = (/* import warning: importer.ImportType#apply Failed type conversion: S[0] */ js.Any) | (Longest[
    (/* import warning: importer.ImportType#apply Failed type conversion: S[0] */ js.Any) | (Longest[
      /* import warning: importer.ImportType#apply Failed type conversion: S[0] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: S[1] */ js.Any
    ]), 
    (/* import warning: importer.ImportType#apply Failed type conversion: S[1] */ js.Any) | js.Array[Any]
  ])
  
  type Mapped[T] = Identity[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k]}
    */ typings.reselect.reselectStrings.Mapped & TopLevel[T]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reselect.reselectStrings.`0`
    - typings.reselect.reselectStrings.`1`
  */
  trait Matches[V, T] extends StObject
  
  type MergeParameters[T /* <: js.Array[UnknownFunction] */, ParamsArrays /* <: js.Array[js.Array[Any]] */, TransposedArrays, TuplifiedArrays /* <: js.Array[Any] */, LongestParamsArray /* <: js.Array[Any] */] = ExpandItems[
    RemoveNames[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ index in keyof LongestParamsArray ]: LongestParamsArray[index] extends LongestParamsArray[number]? reselect.reselect/es/types.IgnoreInvalidIntersections<reselect.reselect/es/types.IntersectAll<LongestParamsArray[index]>> : never}
    */ typings.reselect.reselectStrings.MergeParameters & TopLevel[Any]
    ]
  ]
  
  type Not[T /* <: Bool */] = /* import warning: importer.ImportType#apply Failed type conversion: reselect.anon.1[T] */ js.Any
  
  type Obj[T] = StringDictionary[T]
  
  type ObjValueTuple[T, KS /* <: js.Array[Any] */, R /* <: js.Array[Any] */] = R
  
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
  type RemoveNames[T /* <: js.Array[Any] */] = Any
  
  type Selector[State, Result, Params /* <: scala.Nothing | js.Array[Any] */] = (js.Function2[/* state */ State, /* params */ Params, Result]) | (js.Function1[/* state */ State, Result])
  
  type SelectorArray = js.Array[Selector[Any, Any, js.Array[Any]]]
  
  type SelectorResultArray[Selectors /* <: SelectorArray */] = ExtractReturnType[Selectors]
  
  type Tail[A] = Any
  
  /**
    * Transposes nested arrays
    * Source: https://stackoverflow.com/a/66303933/62937
    */
  type Transpose[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: {[ L in keyof T ]: K extends keyof T[L]? T[L][K] : undefined}}
    */ typings.reselect.reselectStrings.Transpose & TopLevel[T]
  
  type TuplifyUnion[T, L, N] = js.Array[Any]
  
  type UnionToIntersection[Union] = Any
  
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
  type _IntersectAll[T, R] = R
}
