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
  
  val friendlyUrl: friendlyUrl with java.lang.String = js.native
  val root: root with java.lang.String = js.native
  val simpleLink: simpleLink with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationLinkType with java.lang.String
  ] = js.native
}

