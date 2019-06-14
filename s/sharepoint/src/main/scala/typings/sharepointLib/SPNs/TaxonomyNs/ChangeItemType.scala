package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeItemType extends js.Object

@JSGlobal("SP.Taxonomy.ChangeItemType")
@js.native
object ChangeItemType extends js.Object {
  @js.native
  sealed trait group
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  @js.native
  sealed trait term
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  @js.native
  sealed trait termSet
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  @js.native
  sealed trait termStore
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.TaxonomyNs.ChangeItemType
  
  /* 3 */ val group: group with scala.Double = js.native
  /* 5 */ val site: site with scala.Double = js.native
  /* 1 */ val term: term with scala.Double = js.native
  /* 2 */ val termSet: termSet with scala.Double = js.native
  /* 4 */ val termStore: termStore with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.ChangeItemType with scala.Double] = js.native
}

