package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// remove indexers
// https://stackoverflow.com/questions/51465182/how-to-remove-index-signature-using-mapped-types
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T as string extends K? never : number extends K? never : K ]: T[K]}
  }}}
  */
@js.native
trait KnownKeys[T] extends StObject
