package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Ensures that the props do not include ref at all */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // Pick would not be sufficient for this. We'd like to avoid unnecessary mapping and need a distributive conditional to support unions.
// see: https://www.typescriptlang.org/docs/handbook/2/conditional-types.html#distributive-conditional-types
// https://github.com/Microsoft/TypeScript/issues/28339
P extends any ? 'ref' extends keyof P ? std.Pick<P, std.Exclude<keyof P, 'ref'>> : P : P
  }}}
  */
@js.native
trait PropsWithoutRef[P] extends StObject
