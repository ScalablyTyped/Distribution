package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebParts {
  
  @js.native
  sealed trait PersonalizationScope extends StObject
  @JSGlobal("SP.WebParts.PersonalizationScope")
  @js.native
  object PersonalizationScope extends StObject {
    
    @js.native
    sealed trait shared extends PersonalizationScope
    
    @js.native
    sealed trait user extends PersonalizationScope
  }
  
  @js.native
  trait LimitedWebPartManager extends ClientObject {
    
    def addWebPart(webPart: WebPart, zoneId: String, zoneIndex: Double): WebPartDefinition = js.native
    
    def get_hasPersonalizedParts(): Boolean = js.native
    
    def get_scope(): PersonalizationScope = js.native
    
    def get_webParts(): WebPartDefinitionCollection = js.native
    
    def importWebPart(webPartXml: String): WebPartDefinition = js.native
  }
  
  @js.native
  trait TileData extends ClientValueObject {
    
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
  object TileData {
    
    @scala.inline
    def apply(
      customFromJson: js.Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: js.Any => Unit,
      get_backgroundImageLocation: () => String,
      get_description: () => String,
      get_iD: () => Double,
      get_linkLocation: () => String,
      get_tileOrder: () => Double,
      get_title: () => String,
      get_typeId: () => String,
      set_backgroundImageLocation: String => Unit,
      set_description: String => Unit,
      set_iD: Double => Unit,
      set_linkLocation: String => Unit,
      set_tileOrder: Double => Unit,
      set_title: String => Unit,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): TileData = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_backgroundImageLocation = js.Any.fromFunction0(get_backgroundImageLocation), get_description = js.Any.fromFunction0(get_description), get_iD = js.Any.fromFunction0(get_iD), get_linkLocation = js.Any.fromFunction0(get_linkLocation), get_tileOrder = js.Any.fromFunction0(get_tileOrder), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), set_backgroundImageLocation = js.Any.fromFunction1(set_backgroundImageLocation), set_description = js.Any.fromFunction1(set_description), set_iD = js.Any.fromFunction1(set_iD), set_linkLocation = js.Any.fromFunction1(set_linkLocation), set_tileOrder = js.Any.fromFunction1(set_tileOrder), set_title = js.Any.fromFunction1(set_title), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[TileData]
    }
    
    @scala.inline
    implicit class TileDataMutableBuilder[Self <: TileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_backgroundImageLocation(value: () => String): Self = StObject.set(x, "get_backgroundImageLocation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_description(value: () => String): Self = StObject.set(x, "get_description", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_iD(value: () => Double): Self = StObject.set(x, "get_iD", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_linkLocation(value: () => String): Self = StObject.set(x, "get_linkLocation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_tileOrder(value: () => Double): Self = StObject.set(x, "get_tileOrder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet_backgroundImageLocation(value: String => Unit): Self = StObject.set(x, "set_backgroundImageLocation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_description(value: String => Unit): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_iD(value: Double => Unit): Self = StObject.set(x, "set_iD", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_linkLocation(value: String => Unit): Self = StObject.set(x, "set_linkLocation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_tileOrder(value: Double => Unit): Self = StObject.set(x, "set_tileOrder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_title(value: String => Unit): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WebPart extends ClientObject {
    
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
  trait WebPartDefinition extends ClientObject {
    
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
}
