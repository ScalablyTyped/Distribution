package typings.sharepoint.SP.Publishing.Navigation

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.friendlyUrl
import typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.root
import typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.simpleLink
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationLinkType with Double] = js.native
  /* 1 */ @js.native
  object friendlyUrl extends TopLevel[friendlyUrl with Double]
  
  /* 0 */ @js.native
  object root extends TopLevel[root with Double]
  
  /* 2 */ @js.native
  object simpleLink extends TopLevel[simpleLink with Double]
  
}

