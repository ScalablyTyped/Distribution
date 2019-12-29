package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts")
@js.native
object WebParts extends js.Object {
  @js.native
  class LimitedWebPartManager () extends ClientObject {
    def addWebPart(webPart: WebPart, zoneId: String, zoneIndex: Double): WebPartDefinition = js.native
    def get_hasPersonalizedParts(): Boolean = js.native
    def get_scope(): PersonalizationScope = js.native
    def get_webParts(): WebPartDefinitionCollection = js.native
    def importWebPart(webPartXml: String): WebPartDefinition = js.native
  }
  
  @js.native
  sealed trait PersonalizationScope extends js.Object
  
  @js.native
  class TileData () extends ClientValueObject {
    def get_backgroundImageLocation(): String = js.native
    def get_description(): String = js.native
    def get_iD(): Double = js.native
    def get_linkLocation(): String = js.native
    def get_tileOrder(): Double = js.native
    def get_title(): String = js.native
    def set_backgroundImageLocation(value: String): Unit = js.native
    def set_description(value: String): Unit = js.native
    def set_iD(value: Double): Unit = js.native
    def set_linkLocation(value: String): Unit = js.native
    def set_tileOrder(value: Double): Unit = js.native
    def set_title(value: String): Unit = js.native
  }
  
  @js.native
  class WebPart () extends ClientObject {
    def get_hidden(): Boolean = js.native
    def get_isClosed(): Boolean = js.native
    def get_properties(): PropertyValues = js.native
    def get_subtitle(): String = js.native
    def get_title(): String = js.native
    def get_titleUrl(): String = js.native
    def get_zoneIndex(): Double = js.native
    def set_hidden(value: Boolean): Unit = js.native
    def set_title(value: String): Unit = js.native
    def set_titleUrl(value: String): Unit = js.native
  }
  
  @js.native
  class WebPartDefinition () extends ClientObject {
    def closeWebPart(): Unit = js.native
    def deleteWebPart(): Unit = js.native
    def get_id(): Guid = js.native
    def get_webPart(): WebPart = js.native
    def get_zoneId(): String = js.native
    def moveWebPartTo(zoneID: String, zoneIndex: Double): Unit = js.native
    def openWebPart(): Unit = js.native
    def saveWebPartChanges(): Unit = js.native
  }
  
  @js.native
  trait WebPartDefinitionCollection extends ClientObjectCollection[WebPartDefinition] {
    def getByControlId(controlId: String): WebPartDefinition = js.native
    def getById(id: Guid): WebPartDefinition = js.native
    def get_item(index: Double): WebPartDefinition = js.native
    def itemAt(index: Double): WebPartDefinition = js.native
  }
  
  @js.native
  object PersonalizationScope extends js.Object {
    @js.native
    sealed trait shared extends PersonalizationScope
    
    @js.native
    sealed trait user extends PersonalizationScope
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PersonalizationScope with Double] = js.native
    /* 1 */ @js.native
    object shared extends TopLevel[shared with Double]
    
    /* 0 */ @js.native
    object user extends TopLevel[user with Double]
    
  }
  
}

