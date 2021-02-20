package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeDisplayFormat extends StObject
@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends StObject {
  
  @js.native
  sealed trait DateOnly extends DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime extends DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly extends DateTimeDisplayFormat
}
