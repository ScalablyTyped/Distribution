package typings.sharepoint.SP.Publishing.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StandardNavigationSource extends js.Object
@JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
@js.native
object StandardNavigationSource extends js.Object {
  
  @js.native
  sealed trait inheritFromParentWeb extends StandardNavigationSource
  
  @js.native
  sealed trait portalProvider extends StandardNavigationSource
  
  @js.native
  sealed trait taxonomyProvider extends StandardNavigationSource
  
  @js.native
  sealed trait unknown extends StandardNavigationSource
}
