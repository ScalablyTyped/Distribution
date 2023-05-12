package typings.stagehand

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.PromiseLike<infer TResult> ? TResult : T
    }}}
    */
  type Awaited[T] = T
  
  type HandlerArray[T] = js.Array[HandlerType[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.RemoteType<T[K]>}
    }}}
    */
  @js.native
  trait HandlerFunctionArgs[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (args : infer Args): infer Return ? (args : stagehand.stagehand/lib/utils/types.HandlerFunctionArgs<Args>): stagehand.stagehand/lib/utils/types.MaybePromise<stagehand.stagehand/lib/utils/types.HandlerType<stagehand.stagehand/lib/utils/types.Awaited<Return>>> : T extends std.Array<infer El> ? stagehand.stagehand/lib/utils/types.HandlerArray<El> : T extends std.Record<string, any> ? {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.HandlerType<T[K]>} : T extends std.Array<any> ? {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.HandlerType<T[K]>} : T
    }}}
    */
  @js.native
  trait HandlerType[T] extends StObject
  
  type MaybePromise[T] = T | js.Promise[T]
  
  type MethodsOnly[T] = Pick[T, PropertiesAssignableToType[T, js.Function]]
  
  type Omit[Obj, Keys] = Pick[Obj, Exclude[/* keyof Obj */ String, Keys]]
  
  type PropertiesAssignableToType[T, U] = Values[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never} */ js.Any
  ]
  
  type RemoteArray[T] = js.Array[RemoteType[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.HandlerType<T[K]>}
    }}}
    */
  @js.native
  trait RemoteFunctionArgs[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (args : infer Args): infer Return ? (args : stagehand.stagehand/lib/utils/types.RemoteFunctionArgs<Args>): std.Promise<stagehand.stagehand/lib/utils/types.RemoteType<stagehand.stagehand/lib/utils/types.Awaited<Return>>> : T extends std.Array<infer El> ? stagehand.stagehand/lib/utils/types.RemoteArray<El> : T extends std.Record<string, any> ? {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.RemoteType<T[K]>} : T extends std.Array<any> ? {[ K in keyof T ]: stagehand.stagehand/lib/utils/types.RemoteType<T[K]>} : T
    }}}
    */
  @js.native
  trait RemoteType[T] extends StObject
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
