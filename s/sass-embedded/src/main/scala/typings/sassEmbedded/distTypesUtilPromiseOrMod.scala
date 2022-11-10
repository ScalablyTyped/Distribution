package typings.sassEmbedded

import typings.sassEmbedded.sassEmbeddedStrings.async
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilPromiseOrMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    sync extends 'async' ? T | std.Promise<T> : T
    }}}
    */
  type PromiseOr[T, sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] = T
}
