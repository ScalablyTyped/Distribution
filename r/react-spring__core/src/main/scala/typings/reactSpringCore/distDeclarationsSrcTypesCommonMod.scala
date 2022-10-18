package typings.reactSpringCore

import typings.reactSpringTypes.utilMod.Remap
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesCommonMod {
  
  /** Return a union type of every key whose `T` value is incompatible with its `U` value */
  type InvalidKeys[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T & keyof U ]: T[P] extends U[P]? never : P}[keyof T & keyof U] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.ReadonlyArray<any> ? @react-spring/types.@react-spring/types.Any : T extends object ? object : @react-spring/types.@react-spring/types.Any
    }}}
    */
  @js.native
  trait IsPlainObject[T] extends StObject
  
  /** Replace the type of each `P` property with `never` */
  type NeverProps[T, P /* <: /* keyof T */ String */] = Remap[
    (Pick[T, Exclude[/* keyof T */ String, P]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: never} */ js.Any)
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<infer U> * / any? U : T[P]}
    }}}
    */
  @js.native
  trait RawValues[T /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends @react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T> ? string & keyof T : string
    }}}
    */
  @js.native
  trait StringKeys[T] extends StObject
  
  type Valid[T, U] = NeverProps[T, InvalidKeys[T, U]]
}
