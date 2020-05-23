package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts")
@js.native
object WebParts extends js.Object {
  @js.native
  class LimitedWebPartManager ()
    extends typings.sharepoint.SP.WebParts.LimitedWebPartManager
  
  @js.native
  class TileData ()
    extends typings.sharepoint.SP.WebParts.TileData {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
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
  
  @js.native
  class WebPart ()
    extends typings.sharepoint.SP.WebParts.WebPart
  
  @js.native
  class WebPartDefinition ()
    extends typings.sharepoint.SP.WebParts.WebPartDefinition
  
  @js.native
  object PersonalizationScope extends js.Object {
    /* 1 */ val shared: typings.sharepoint.SP.WebParts.PersonalizationScope.shared with Double = js.native
    /* 0 */ val user: typings.sharepoint.SP.WebParts.PersonalizationScope.user with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.WebParts.PersonalizationScope with Double] = js.native
  }
  
}

