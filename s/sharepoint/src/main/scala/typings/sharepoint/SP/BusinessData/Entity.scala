package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BusinessData.Collections.EntityIdentifierCollection
import typings.sharepoint.SP.BusinessData.Collections.EntityInstanceCollection
import typings.sharepoint.SP.BusinessData.Collections.FilterCollection
import typings.sharepoint.SP.BusinessData.Runtime.EntityEventType
import typings.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typings.sharepoint.SP.BusinessData.Runtime.EntityIdentity
import typings.sharepoint.SP.BusinessData.Runtime.EntityInstance
import typings.sharepoint.SP.BusinessData.Runtime.NotificationCallback
import typings.sharepoint.SP.BusinessData.Runtime.Subscription
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.IntResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
