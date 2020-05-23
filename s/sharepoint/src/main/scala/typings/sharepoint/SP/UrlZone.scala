package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlZone extends js.Object

@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends js.Object {
  @js.native
  sealed trait custom extends UrlZone
  
  @js.native
  sealed trait defaultZone extends UrlZone
  
  @js.native
  sealed trait extranet extends UrlZone
  
  @js.native
  sealed trait internet extends UrlZone
  
  @js.native
  sealed trait intranet extends UrlZone
  
}

