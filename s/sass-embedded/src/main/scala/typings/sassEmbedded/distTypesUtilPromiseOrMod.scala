package typings.sassEmbedded

import typings.sassEmbedded.sassEmbeddedStrings.async
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilPromiseOrMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    sync extends 'async' ? T | std.Promise<T> : T
    }}}
    */
  @js.native
  trait PromiseOr[T, sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] extends StObject
}
