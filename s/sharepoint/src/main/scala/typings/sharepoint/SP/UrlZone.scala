package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UrlZone extends StObject
@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends StObject {
  
  @js.native
  sealed trait custom
    extends StObject
       with UrlZone
  
  @js.native
  sealed trait defaultZone
    extends StObject
       with UrlZone
  
  @js.native
  sealed trait extranet
    extends StObject
       with UrlZone
  
  @js.native
  sealed trait internet
    extends StObject
       with UrlZone
  
  @js.native
  sealed trait intranet
    extends StObject
       with UrlZone
}
