package typings.quadstore.distCjsTypesMod

import typings.quadstore.quadstoreStrings.F
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  E extends 'T' ? {write (node : T, serialized : quadstore.quadstore/dist/cjs/types.SerializedTerm, prefixes : quadstore.quadstore/dist/cjs/types.Prefixes, rangeMode : boolean, encodedValue : string): void} : {write (node : T, serialized : quadstore.quadstore/dist/cjs/types.SerializedTerm, prefixes : quadstore.quadstore/dist/cjs/types.Prefixes): void}
  }}}
  */
@js.native
trait TermWriter[T /* <: Term */, E /* <: typings.quadstore.quadstoreStrings.T | F */] extends StObject
