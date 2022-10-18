package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  O extends {  xmlns :true} ? saxes.saxes.SaxesTagNS : O extends {  xmlns :false | undefined} ? saxes.saxes.SaxesTagPlain : saxes.saxes.SaxesTag
  }}}
  */
@js.native
trait TagForOptions[O /* <: SaxesOptions */] extends StObject
