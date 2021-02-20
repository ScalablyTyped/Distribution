package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UrlZone extends StObject
@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends StObject {
  
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
