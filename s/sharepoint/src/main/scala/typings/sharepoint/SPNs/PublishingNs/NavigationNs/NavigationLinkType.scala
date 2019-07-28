package typings.sharepoint.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigationLinkType extends js.Object

@JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
@js.native
object NavigationLinkType extends js.Object {
  @js.native
  sealed trait friendlyUrl extends NavigationLinkType
  
  @js.native
  sealed trait root extends NavigationLinkType
  
  @js.native
  sealed trait simpleLink extends NavigationLinkType
  
  /* 1 */ val friendlyUrl: typings.sharepoint.SPNs.PublishingNs.NavigationNs.NavigationLinkType.friendlyUrl with Double = js.native
  /* 0 */ val root: typings.sharepoint.SPNs.PublishingNs.NavigationNs.NavigationLinkType.root with Double = js.native
  /* 2 */ val simpleLink: typings.sharepoint.SPNs.PublishingNs.NavigationNs.NavigationLinkType.simpleLink with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationLinkType with Double] = js.native
}

