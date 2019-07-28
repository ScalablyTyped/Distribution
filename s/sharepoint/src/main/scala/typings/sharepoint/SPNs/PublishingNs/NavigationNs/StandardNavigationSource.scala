package typings.sharepoint.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 3 */ val inheritFromParentWeb: typings.sharepoint.SPNs.PublishingNs.NavigationNs.StandardNavigationSource.inheritFromParentWeb with Double = js.native
  /* 1 */ val portalProvider: typings.sharepoint.SPNs.PublishingNs.NavigationNs.StandardNavigationSource.portalProvider with Double = js.native
  /* 2 */ val taxonomyProvider: typings.sharepoint.SPNs.PublishingNs.NavigationNs.StandardNavigationSource.taxonomyProvider with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SPNs.PublishingNs.NavigationNs.StandardNavigationSource.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StandardNavigationSource with Double] = js.native
}

