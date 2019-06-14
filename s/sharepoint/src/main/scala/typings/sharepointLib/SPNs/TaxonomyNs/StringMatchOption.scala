package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StringMatchOption extends js.Object

@JSGlobal("SP.Taxonomy.StringMatchOption")
@js.native
object StringMatchOption extends js.Object {
  @js.native
  sealed trait exactMatch
    extends sharepointLib.SPNs.TaxonomyNs.StringMatchOption
  
  @js.native
  sealed trait startsWith
    extends sharepointLib.SPNs.TaxonomyNs.StringMatchOption
  
  /* 1 */ val exactMatch: exactMatch with scala.Double = js.native
  /* 0 */ val startsWith: startsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.StringMatchOption with scala.Double] = js.native
}

