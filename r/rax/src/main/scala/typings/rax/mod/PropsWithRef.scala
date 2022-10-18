package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Ensures that the props do not include string ref, which cannot be forwarded */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? string extends R ? rax.rax.PropsWithoutRef<P> & {  ref :std.Exclude<R, string> | undefined} : P : P : P
  }}}
  */
@js.native
trait PropsWithRef[P] extends StObject
