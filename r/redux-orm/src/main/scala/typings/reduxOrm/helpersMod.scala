package typings.reduxOrm

import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]]
  
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: string extends K? never : number extends K? never : K} extends {[ _ in keyof T ]: infer U} ? U : never
    }}}
    */
  @js.native
  trait KnownKeys[T] extends StObject
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? K : never}[keyof T] */ js.Any
  
  type PickByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: T[Key] extends ValueType? Key : never}[keyof T] */ js.Any
  ]
}
