package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityMod {
  
  type OneOf[T] = ValueOf[OneOfByKey[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof Obj ]: sigstore.sigstore/dist/types/utility.OneOnly<Obj, key>}
    }}}
    */
  @js.native
  trait OneOfByKey[Obj] extends StObject
  
  @js.native
  trait OneOnly[Obj, K /* <: /* keyof Obj */ String */] extends StObject
  
  type ValueOf[Obj] = /* import warning: importer.ImportType#apply Failed type conversion: Obj[keyof Obj] */ js.Any
  
  type WithRequired[T, K /* <: /* keyof T */ String */] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: -? std.NonNullable<T[P]>} */ js.Any)
}
