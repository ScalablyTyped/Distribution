package typings.reselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVersionedTypesTs47MergeParametersMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    N extends keyof T ? T[N] : unknown
    }}}
    */
  @js.native
  trait ElementAt[T /* <: js.Array[Any] */, N /* <: /* keyof any */ String */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: reselect.reselect/es/versionedTypes/ts47-mergeParameters.ElementAt<T[K], N>}
    }}}
    */
  @js.native
  trait ElementsAt[T /* <: js.Array[js.Array[Any]] */, N /* <: /* keyof any */ String */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: std.Parameters<T[K]>}
    }}}
    */
  @js.native
  trait ExtractParameters[T /* <: js.Array[UnknownFunction] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [] ? unknown : T extends [infer H, ...infer T] ? H & reselect.reselect/es/versionedTypes/ts47-mergeParameters.Intersect<T> : T[number]
    }}}
    */
  @js.native
  trait Intersect[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer U] ? U : T extends [infer U, ...infer R] ? reselect.reselect/es/versionedTypes/ts47-mergeParameters.MostProperties<U, reselect.reselect/es/versionedTypes/ts47-mergeParameters.LongestTuple<R>> : never
    }}}
    */
  @js.native
  trait LongestTuple[T /* <: js.Array[js.Array[Any]] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    '0' extends keyof T ? reselect.reselect/es/versionedTypes/ts47-mergeParameters.MergeTuples<reselect.reselect/es/versionedTypes/ts47-mergeParameters.ExtractParameters<T>, reselect.reselect/es/versionedTypes/ts47-mergeParameters.LongestTuple<reselect.reselect/es/versionedTypes/ts47-mergeParameters.ExtractParameters<T>>> : std.Parameters<T[number]>
    }}}
    */
  @js.native
  trait MergeParameters[T /* <: js.Array[UnknownFunction] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof L ]: reselect.reselect/es/versionedTypes/ts47-mergeParameters.Intersect<reselect.reselect/es/versionedTypes/ts47-mergeParameters.ElementsAt<T, K>>}
    }}}
    */
  @js.native
  trait MergeTuples[T /* <: js.Array[js.Array[Any]] */, L /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    keyof U extends keyof T ? T : U
    }}}
    */
  @js.native
  trait MostProperties[T, U] extends StObject
  
  @js.native
  trait UnknownFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
