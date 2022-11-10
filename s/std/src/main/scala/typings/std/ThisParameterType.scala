package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends (this : infer U, args : never): any ? U : unknown
  }}}
  */
@js.native
trait ThisParameterType[T] extends StObject
