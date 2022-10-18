package typings.recoil.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]: recoil.recoil.Loadable<recoil.recoil.UnwrapRecoilValue<T[P]>>}
  }}}
  */
@js.native
trait UnwrapRecoilValueLoadables[T /* <: js.Array[RecoilValue[Any]] | StringDictionary[RecoilValue[Any]] */] extends StObject
