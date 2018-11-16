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
  
  val inheritFromParentWeb: inheritFromParentWeb with java.lang.String = js.native
  val portalProvider: portalProvider with java.lang.String = js.native
  val taxonomyProvider: taxonomyProvider with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.PublishingNs.NavigationNs.StandardNavigationSource with java.lang.String
  ] = js.native
}

