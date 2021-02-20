package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeItemType extends StObject
@JSGlobal("SP.Taxonomy.ChangeItemType")
@js.native
object ChangeItemType extends StObject {
  
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
}
