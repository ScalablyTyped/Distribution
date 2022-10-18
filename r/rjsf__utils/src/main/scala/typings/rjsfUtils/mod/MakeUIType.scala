package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This type remaps the keys of `Type` to prepend `ui:` onto them. As a result it does not need to be exported */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ Property in keyof Type as / * template literal string: ui:${string&Property} * / string ]: Type[Property]}
  }}}
  */
@js.native
trait MakeUIType[Type] extends StObject
