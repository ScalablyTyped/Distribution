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
  
  val exactMatch: exactMatch with java.lang.String = js.native
  val startsWith: startsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.StringMatchOption with java.lang.String] = js.native
}

