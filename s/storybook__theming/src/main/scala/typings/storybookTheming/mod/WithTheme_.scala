package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends {  theme :infer Theme} ? P & {  theme :std.Exclude<Theme, undefined>} : P & {  theme :T}
  }}}
  */
@js.native
trait WithTheme_[P, T] extends StObject
