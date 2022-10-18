package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]: T[P] extends (args : any): any? raphael.raphael.RaphaelPaperPluginMethod<TTechnology, std.Parameters<T[P]>, std.ReturnType<T[P]>> : raphael.raphael.RaphaelPaperPluginRegistry<TTechnology, T[P]>}
  }}}
  */
@js.native
trait RaphaelPaperPluginRegistry[TTechnology /* <: RaphaelTechnology */, T] extends StObject
