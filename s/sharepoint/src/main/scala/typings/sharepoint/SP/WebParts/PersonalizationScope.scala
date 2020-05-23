package typings.sharepoint.SP.WebParts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonalizationScope extends js.Object

@JSGlobal("SP.WebParts.PersonalizationScope")
@js.native
object PersonalizationScope extends js.Object {
  @js.native
  sealed trait shared extends PersonalizationScope
  
  @js.native
  sealed trait user extends PersonalizationScope
  
}

