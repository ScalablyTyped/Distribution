package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishingWeb
  extends StObject
     with ClientObject {
  
  def addPublishingPage(pageInformation: PublishingPageInformation): PublishingPage = js.native
  
  def get_web(): Web = js.native
}
