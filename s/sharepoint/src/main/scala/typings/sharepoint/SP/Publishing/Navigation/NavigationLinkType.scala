package typings.sharepoint.SP.Publishing.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
