package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebParts {
  
  @JSGlobal("SP.WebParts.LimitedWebPartManager")
  @js.native
  open class LimitedWebPartManager ()
    extends StObject
       with typings.sharepoint.SP.WebParts.LimitedWebPartManager
  
  @JSGlobal("SP.WebParts.PersonalizationScope")
  @js.native
  object PersonalizationScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.WebParts.PersonalizationScope & Double] = js.native
    
    /* 1 */ val shared: typings.sharepoint.SP.WebParts.PersonalizationScope.shared & Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.WebParts.PersonalizationScope.user & Double = js.native
  }
  
  @JSGlobal("SP.WebParts.TileData")
  @js.native
  open class TileData ()
    extends StObject
       with typings.sharepoint.SP.WebParts.TileData {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_backgroundImageLocation(): String = js.native
    
    /* CompleteClass */
    override def get_description(): String = js.native
    
    /* CompleteClass */
    override def get_iD(): Double = js.native
    
    /* CompleteClass */
    override def get_linkLocation(): String = js.native
    
    /* CompleteClass */
    override def get_tileOrder(): Double = js.native
    
    /* CompleteClass */
    override def get_title(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_backgroundImageLocation(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_description(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_iD(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_linkLocation(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_tileOrder(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_title(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.WebParts.WebPart")
  @js.native
  open class WebPart ()
    extends StObject
       with typings.sharepoint.SP.WebParts.WebPart
  
  @JSGlobal("SP.WebParts.WebPartDefinition")
  @js.native
  open class WebPartDefinition ()
    extends StObject
       with typings.sharepoint.SP.WebParts.WebPartDefinition
}
