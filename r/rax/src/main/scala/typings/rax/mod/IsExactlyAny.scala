package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// naked 'any' type in a conditional type will short circuit and union both the then/else branches
// so boolean is only resolved for T = any
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  boolean extends T extends never ? true : false ? true : false
  }}}
  */
@js.native
trait IsExactlyAny[T] extends StObject
