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
  
  val group: group with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val term: term with java.lang.String = js.native
  val termSet: termSet with java.lang.String = js.native
  val termStore: termStore with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.ChangeItemType with java.lang.String] = js.native
}

