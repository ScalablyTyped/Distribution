package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TBase extends raphael.raphael.RaphaelSet<TTechnology> ? raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]> : TBase
  }}}
  */
@js.native
trait RaphaelUnwrapElement[TTechnology /* <: RaphaelTechnology */, TBase /* <: RaphaelBaseElement[TTechnology] */] extends StObject
