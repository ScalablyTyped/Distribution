package typings.sharepoint.SP.Taxonomy

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
  
  /* 3 */ val group: typings.sharepoint.SP.Taxonomy.ChangeItemType.group with Double = js.native
  /* 5 */ val site: typings.sharepoint.SP.Taxonomy.ChangeItemType.site with Double = js.native
  /* 1 */ val term: typings.sharepoint.SP.Taxonomy.ChangeItemType.term with Double = js.native
  /* 2 */ val termSet: typings.sharepoint.SP.Taxonomy.ChangeItemType.termSet with Double = js.native
  /* 4 */ val termStore: typings.sharepoint.SP.Taxonomy.ChangeItemType.termStore with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SP.Taxonomy.ChangeItemType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeItemType with Double] = js.native
}

