package typings.sharepoint.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeItemType extends js.Object

@JSGlobal("SP.Taxonomy.ChangeItemType")
@js.native
object ChangeItemType extends js.Object {
  @js.native
  sealed trait group extends ChangeItemType
  
  @js.native
  sealed trait site extends ChangeItemType
  
  @js.native
  sealed trait term extends ChangeItemType
  
  @js.native
  sealed trait termSet extends ChangeItemType
  
  @js.native
  sealed trait termStore extends ChangeItemType
  
  @js.native
  sealed trait unknown extends ChangeItemType
  
  /* 3 */ val group: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.group with Double = js.native
  /* 5 */ val site: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.site with Double = js.native
  /* 1 */ val term: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.term with Double = js.native
  /* 2 */ val termSet: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.termSet with Double = js.native
  /* 4 */ val termStore: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.termStore with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SPNs.TaxonomyNs.ChangeItemType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeItemType with Double] = js.native
}

