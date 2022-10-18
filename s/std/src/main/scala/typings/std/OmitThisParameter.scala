package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes the 'this' parameter from a function type.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  unknown extends std.ThisParameterType<T> ? T : T extends (args : infer A): infer R ? (args : A): R : T
  }}}
  */
@js.native
trait OmitThisParameter[T] extends StObject
