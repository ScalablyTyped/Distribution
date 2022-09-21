package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebControls {
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.ControlMessage")
  @js.native
  open class ControlMessage ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_code(): Double = js.native
    
    /* CompleteClass */
    override def get_correlationID(): String = js.native
    
    /* CompleteClass */
    override def get_encodeDetails(): Boolean = js.native
    
    /* CompleteClass */
    override def get_header(): String = js.native
    
    /* CompleteClass */
    override def get_level(): MessageLevel = js.native
    
    /* CompleteClass */
    override def get_messageDetails(): String = js.native
    
    /* CompleteClass */
    override def get_messageDetailsForViewers(): String = js.native
    
    /* CompleteClass */
    override def get_serverTypeId(): String = js.native
    
    /* CompleteClass */
    override def get_showForViewerUsers(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showInEditModeOnly(): Boolean = js.native
    
    /* CompleteClass */
    override def get_stackTrace(): String = js.native
    
    /* CompleteClass */
    override def get_type(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel & Double
      ] = js.native
    
    /* 2 */ val error: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.error & Double = js.native
    
    /* 0 */ val information: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.information & Double = js.native
    
    /* 1 */ val warning: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.warning & Double = js.native
  }
}
