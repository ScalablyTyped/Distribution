package typings.reselect

import typings.reselect.esTypesMod.UnknownFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVersionedTypesTs46MergeParametersMod {
  
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
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: T[index] extends T[number]? reselect.reselect/es/types.Expand<T[index]> : never}
    }}}
    */
  @js.native
  trait ExpandItems[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: T[index] extends T[number]? std.Parameters<T[index]> : never}
    }}}
    */
  @js.native
  trait ExtractParams[T /* <: js.Array[UnknownFunction] */] extends StObject
  
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
    T extends reselect.reselect/es/versionedTypes/ts46-mergeParameters.EmptyObject ? never : T
    }}}
    */
  @js.native
  trait IgnoreInvalidIntersections[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    reselect.reselect/es/types.IsTuple<T> extends '0' ? T[0] : reselect.reselect/es/versionedTypes/ts46-mergeParameters._IntersectAll<T, unknown>
    }}}
    */
  @js.native
  trait IntersectAll[T /* <: js.Array[Any] */] extends StObject
  
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
    reselect.reselect/es/types.IsTuple<S> extends '0' ? S[0] : S extends [std.Array<any>, std.Array<any>] ? reselect.reselect/es/versionedTypes/ts46-mergeParameters.Longest<S[0], S[1]> : S extends [std.Array<any>, std.Array<any>, ...infer Rest] ? reselect.reselect/es/versionedTypes/ts46-mergeParameters.Longest<reselect.reselect/es/versionedTypes/ts46-mergeParameters.Longest<S[0], S[1]>, Rest extends std.Array<std.Array<any>> ? reselect.reselect/es/versionedTypes/ts46-mergeParameters.LongestArray<Rest> : []> : S extends [std.Array<any>] ? S[0] : never
    }}}
    */
  @js.native
  trait LongestArray[S /* <: js.Array[js.Array[Any]] */] extends StObject
  
  type MergeParameters[T /* <: js.Array[UnknownFunction] */, ParamsArrays /* <: js.Array[js.Array[Any]] */, TransposedArrays, TuplifiedArrays /* <: js.Array[Any] */, LongestParamsArray /* <: js.Array[Any] */] = ExpandItems[
    RemoveNames[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ index in keyof LongestParamsArray ]: LongestParamsArray[index] extends LongestParamsArray[number]? reselect.reselect/es/versionedTypes/ts46-mergeParameters.IgnoreInvalidIntersections<reselect.reselect/es/versionedTypes/ts46-mergeParameters.IntersectAll<LongestParamsArray[index]>> : never} */ js.Any
    ]
  ]
  
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
    T extends [infer First, ...infer Rest] ? reselect.reselect/es/versionedTypes/ts46-mergeParameters._IntersectAll<Rest, reselect.reselect/es/versionedTypes/ts46-mergeParameters.IfJustNullish<First, R, R & First>> : R
    }}}
    */
  @js.native
  trait _IntersectAll[T, R] extends StObject
}
