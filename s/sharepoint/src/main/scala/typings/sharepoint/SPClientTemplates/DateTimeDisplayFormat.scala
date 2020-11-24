package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeDisplayFormat extends js.Object
@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends js.Object {
  
  @js.native
  sealed trait DateOnly extends DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime extends DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly extends DateTimeDisplayFormat
}
