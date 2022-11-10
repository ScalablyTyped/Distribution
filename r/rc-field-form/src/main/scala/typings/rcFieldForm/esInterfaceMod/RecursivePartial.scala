package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Only return partial when type is not any */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends object ? {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<rc-field-form.rc-field-form/es/interface.RecursivePartial<U>> : T[P] extends object? rc-field-form.rc-field-form/es/interface.RecursivePartial<T[P]> : T[P]} : any
  }}}
  */
@js.native
trait RecursivePartial[T] extends StObject
