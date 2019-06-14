package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigationLinkType extends js.Object

@JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
@js.native
object NavigationLinkType extends js.Object {
  @js.native
  sealed trait friendlyUrl
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationLinkType
  
  @js.native
  sealed trait root
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationLinkType
  
  @js.native
  sealed trait simpleLink
    extends sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationLinkType
  
  /* 1 */ val friendlyUrl: friendlyUrl with scala.Double = js.native
  /* 0 */ val root: root with scala.Double = js.native
  /* 2 */ val simpleLink: simpleLink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationLinkType with scala.Double
  ] = js.native
}

