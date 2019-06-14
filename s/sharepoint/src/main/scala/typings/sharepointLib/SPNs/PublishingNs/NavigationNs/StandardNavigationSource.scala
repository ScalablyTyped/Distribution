package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardNavigationSource extends js.Object

@JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
@js.native
object StandardNavigationSource extends js.Object {
  @js.native
  sealed trait inheritFromParentWeb
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource
  
  @js.native
  sealed trait portalProvider
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource
  
  @js.native
  sealed trait taxonomyProvider
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource
  
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource
  
  /* 3 */ val inheritFromParentWeb: inheritFromParentWeb with scala.Double = js.native
  /* 1 */ val portalProvider: portalProvider with scala.Double = js.native
  /* 2 */ val taxonomyProvider: taxonomyProvider with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource with scala.Double
  ] = js.native
}

