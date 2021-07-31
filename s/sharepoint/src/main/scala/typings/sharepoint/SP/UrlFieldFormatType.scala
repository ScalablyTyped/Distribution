package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UrlFieldFormatType extends StObject
@JSGlobal("SP.UrlFieldFormatType")
@js.native
object UrlFieldFormatType extends StObject {
  
  @js.native
  sealed trait hyperlink
    extends StObject
       with UrlFieldFormatType
  
  @js.native
  sealed trait image
    extends StObject
       with UrlFieldFormatType
}
