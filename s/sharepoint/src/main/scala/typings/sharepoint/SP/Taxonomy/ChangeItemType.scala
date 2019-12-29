package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeItemType with Double] = js.native
  /* 3 */ @js.native
  object group extends TopLevel[group with Double]
  
  /* 5 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 1 */ @js.native
  object term extends TopLevel[term with Double]
  
  /* 2 */ @js.native
  object termSet extends TopLevel[termSet with Double]
  
  /* 4 */ @js.native
  object termStore extends TopLevel[termStore with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

