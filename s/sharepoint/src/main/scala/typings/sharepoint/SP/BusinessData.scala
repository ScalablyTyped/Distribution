package typings.sharepoint.SP

import typings.sharepoint.SP.BusinessData.Collections.EntityFieldCollection
import typings.sharepoint.SP.BusinessData.Collections.EntityIdentifierCollection
import typings.sharepoint.SP.BusinessData.Collections.EntityInstanceCollection
import typings.sharepoint.SP.BusinessData.Collections.FilterCollection
import typings.sharepoint.SP.BusinessData.Collections.LobSystemInstanceCollection
import typings.sharepoint.SP.BusinessData.Collections.TypeDescriptorCollection
import typings.sharepoint.SP.BusinessData.Runtime.EntityEventType
import typings.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typings.sharepoint.SP.BusinessData.Runtime.EntityIdentity
import typings.sharepoint.SP.BusinessData.Runtime.EntityInstance
import typings.sharepoint.SP.BusinessData.Runtime.NotificationCallback
import typings.sharepoint.SP.BusinessData.Runtime.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BusinessData {
  
  object Runtime {
    
    @js.native
    sealed trait EntityEventType extends StObject
    @JSGlobal("SP.BusinessData.Runtime.EntityEventType")
    @js.native
    object EntityEventType extends StObject {
      
      @js.native
      sealed trait itemAdded extends EntityEventType
      
      @js.native
      sealed trait itemDeleted extends EntityEventType
      
      @js.native
      sealed trait itemUpdated extends EntityEventType
      
      @js.native
      sealed trait none extends EntityEventType
    }
    
    @js.native
    trait EntityFieldValueDictionary extends ClientObject {
      
      def createCollectionInstance(fieldDotNotation: String, size: Double): Unit = js.native
      
      def createInstance(fieldInstanceDotNotation: String, fieldDotNotation: String): Unit = js.native
      
      def fromXml(xml: String): Unit = js.native
      
      def getCollectionSize(fieldDotNotation: String): IntResult = js.native
      
      def get_fieldValues(): js.Any = js.native
      
      def get_item(fieldName: String): js.Any = js.native
      
      def set_item(fieldName: String, value: js.Any): Unit = js.native
      
      def toXml(): StringResult = js.native
    }
    
    @js.native
    trait EntityIdentity extends ClientObject {
      
      def get_fieldValues(): js.Any = js.native
      
      def get_identifierCount(): Double = js.native
      
      def get_item(fieldName: String): js.Any = js.native
    }
    
    @js.native
    trait EntityInstance extends ClientObject {
      
      def createCollectionInstance(fieldDotNotation: String, size: Double): Unit = js.native
      
      def createInstance(fieldInstanceDotNotation: String, fieldDotNotation: String): Unit = js.native
      
      def deleteObject(): Unit = js.native
      
      def fromXml(xml: String): Unit = js.native
      
      def getIdentity(): EntityIdentity = js.native
      
      def get_fieldValues(): js.Any = js.native
      
      def get_item(fieldName: String): js.Any = js.native
      
      def set_item(fieldName: String, value: js.Any): Unit = js.native
      
      def toXml(): StringResult = js.native
      
      def update(): Unit = js.native
    }
    
    @js.native
    trait NotificationCallback extends ClientObject {
      
      def get_notificationContext(): String = js.native
      
      def get_notificationEndpoint(): String = js.native
      
      def get_notificationForwarderType(): String = js.native
      
      def set_notificationContext(value: String): Unit = js.native
      
      def set_notificationForwarderType(value: String): Unit = js.native
    }
    
    @js.native
    trait Subscription extends ClientObject {
      
      def get_hash(): String = js.native
      
      def get_iD(): js.Any = js.native
    }
  }
  
  @js.native
  trait AppBdcCatalog extends ClientObject {
    
    def getConnectionId(lobSystemName: String, lobSystemInstanceName: String): StringResult = js.native
    
    def getEntity(namespace: String, name: String): Entity = js.native
    
    def getLobSystemInstanceProperty(lobSystemName: String, lobSystemInstanceName: String, propertyName: String): StringResult = js.native
    
    def getLobSystemProperty(lobSystemName: String, propertyName: String): StringResult = js.native
    
    def getPermissibleConnections(): js.Array[String] = js.native
    
    def setConnectionId(lobSystemName: String, lobSystemInstanceName: String, connectionId: String): Unit = js.native
    
    def setLobSystemInstanceProperty(lobSystemName: String, lobSystemInstanceName: String, propertyName: String, propertyValue: String): Unit = js.native
    
    def setLobSystemProperty(lobSystemName: String, propertyName: String, propertyValue: String): Unit = js.native
  }
  
  object Collections {
    
    @js.native
    trait EntityFieldCollection extends ClientObjectCollection[EntityField] {
      
      def get_item(index: Double): EntityField = js.native
      
      def itemAt(index: Double): EntityField = js.native
    }
    
    @js.native
    trait EntityIdentifierCollection extends ClientObjectCollection[EntityIdentifier] {
      
      def get_item(index: Double): EntityIdentifier = js.native
      
      def itemAt(index: Double): EntityIdentifier = js.native
    }
    
    @js.native
    trait EntityInstanceCollection extends ClientObjectCollection[EntityInstance] {
      
      def get_item(index: Double): EntityInstance = js.native
      
      def itemAt(index: Double): EntityInstance = js.native
    }
    
    @js.native
    trait FilterCollection extends ClientObjectCollection[Filter] {
      
      def get_item(index: Double): Filter = js.native
      
      def itemAt(index: Double): Filter = js.native
      
      def setFilterValue(inputFilterName: String, valueIndex: Double, value: js.Any): Unit = js.native
    }
    
    @js.native
    trait LobSystemInstanceCollection extends ClientObjectCollection[LobSystemInstance] {
      
      def get_item(index: Double): LobSystemInstance = js.native
      
      def itemAt(index: Double): LobSystemInstance = js.native
    }
    
    @js.native
    trait TypeDescriptorCollection extends ClientObjectCollection[TypeDescriptor] {
      
      def get_item(index: Double): TypeDescriptor = js.native
      
      def itemAt(index: Double): TypeDescriptor = js.native
    }
  }
  
  @js.native
  trait Entity extends ClientObject {
    
    def create(fieldValues: EntityFieldValueDictionary, lobSystemInstance: LobSystemInstance): EntityIdentity = js.native
    
    def execute(methodInstanceName: String, lobSystemInstance: LobSystemInstance, inputParams: js.Array[_]): MethodExecutionResult = js.native
    
    def findAssociated(
      entityInstance: EntityInstance,
      associationName: String,
      filterList: FilterCollection,
      lobSystemInstance: LobSystemInstance
    ): EntityInstanceCollection = js.native
    
    def findFiltered(filterList: FilterCollection, nameOfFinder: String, lobSystemInstance: LobSystemInstance): EntityInstanceCollection = js.native
    
    def findSpecific(identity: EntityIdentity, specificFinderName: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
    
    def findSpecificByBdcId(bdcIdentity: String, specificFinderName: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
    
    def findSpecificDefault(identity: EntityIdentity, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
    
    def findSpecificDefaultByBdcId(bdcIdentity: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
    
    def getAssociationView(associationName: String): EntityView = js.native
    
    def getCreatorView(methodInstanceName: String): EntityView = js.native
    
    def getDefaultSpecificFinderView(): EntityView = js.native
    
    def getFilters(methodInstanceName: String): FilterCollection = js.native
    
    def getFinderView(methodInstanceName: String): EntityView = js.native
    
    def getIdentifierCount(): IntResult = js.native
    
    def getIdentifiers(): EntityIdentifierCollection = js.native
    
    def getLobSystem(): LobSystem = js.native
    
    def getSpecificFinderView(specificFinderName: String): EntityView = js.native
    
    def getUpdaterView(updaterName: String): EntityView = js.native
    
    def get_estimatedInstanceCount(): Double = js.native
    
    def get_name(): String = js.native
    
    def get_namespace(): String = js.native
    
    def subscribe(
      eventType: EntityEventType,
      notificationCallback: NotificationCallback,
      onBehalfOfUser: String,
      subscriberName: String,
      lobSystemInstance: LobSystemInstance
    ): Subscription = js.native
    
    def unsubscribe(
      subscription: Subscription,
      onBehalfOfUser: String,
      unsubscriberName: String,
      lobSystemInstance: LobSystemInstance
    ): Unit = js.native
  }
  
  @js.native
  trait EntityField extends ClientObject {
    
    def get_containsLocalizedDisplayName(): Boolean = js.native
    
    def get_defaultDisplayName(): String = js.native
    
    def get_localizedDisplayName(): String = js.native
    
    def get_name(): String = js.native
  }
  
  @js.native
  trait EntityIdentifier extends ClientObject {
    
    def containsLocalizedDisplayName(): BooleanResult = js.native
    
    def getDefaultDisplayName(): StringResult = js.native
    
    def getLocalizedDisplayName(): StringResult = js.native
    
    def get_identifierType(): String = js.native
    
    def get_name(): String = js.native
  }
  
  @js.native
  trait EntityView extends ClientObject {
    
    def getDefaultValues(): EntityFieldValueDictionary = js.native
    
    def getType(fieldDotNotation: String): StringResult = js.native
    
    def getTypeDescriptor(fieldDotNotation: String): TypeDescriptor = js.native
    
    def getXmlSchema(): StringResult = js.native
    
    def get_fields(): EntityFieldCollection = js.native
    
    def get_name(): String = js.native
    
    def get_relatedSpecificFinderName(): String = js.native
  }
  
  @js.native
  trait Filter extends ClientObject {
    
    def get_defaultDisplayName(): String = js.native
    
    def get_filterField(): String = js.native
    
    def get_filterType(): String = js.native
    
    def get_localizedDisplayName(): String = js.native
    
    def get_name(): String = js.native
    
    def get_valueCount(): Double = js.native
  }
  
  object Infrastructure {
    
    @js.native
    trait ExternalSubscriptionStore extends ClientObject {
      
      def indexStore(): Unit = js.native
    }
  }
  
  @js.native
  trait LobSystem extends ClientObject {
    
    def getLobSystemInstances(): LobSystemInstanceCollection = js.native
    
    def get_name(): String = js.native
  }
  
  @js.native
  trait LobSystemInstance extends ClientObject {
    
    def get_name(): String = js.native
  }
  
  @js.native
  trait MethodExecutionResult extends ClientObject {
    
    def get_returnParameterCollection(): ReturnParameterCollection = js.native
  }
  
  @js.native
  trait ReturnParameterCollection extends ClientObjectCollection[EntityFieldValueDictionary] {
    
    def get_item(index: Double): EntityFieldValueDictionary = js.native
    
    def itemAt(index: Double): EntityFieldValueDictionary = js.native
  }
  
  @js.native
  trait TypeDescriptor extends ClientObject {
    
    def containsLocalizedDisplayName(): BooleanResult = js.native
    
    def getChildTypeDescriptors(): TypeDescriptorCollection = js.native
    
    def getDefaultDisplayName(): StringResult = js.native
    
    def getLocalizedDisplayName(): StringResult = js.native
    
    def getParentTypeDescriptor(): TypeDescriptor = js.native
    
    def get_containsReadOnly(): Boolean = js.native
    
    def get_isCollection(): Boolean = js.native
    
    def get_isReadOnly(): Boolean = js.native
    
    def get_name(): String = js.native
    
    def get_typeName(): String = js.native
    
    def isLeaf(): BooleanResult = js.native
    
    def isRoot(): BooleanResult = js.native
  }
}
