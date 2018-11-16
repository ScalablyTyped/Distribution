package typings
package sharepointLib.SPNs.BusinessDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Entity")
@js.native
class Entity ()
  extends sharepointLib.SPNs.ClientObject {
  def create(
    fieldValues: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityFieldValueDictionary,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityIdentity = js.native
  def execute(
    methodInstanceName: java.lang.String,
    lobSystemInstance: LobSystemInstance,
    inputParams: js.Array[_]
  ): MethodExecutionResult = js.native
  def findAssociated(
    entityInstance: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityInstance,
    associationName: java.lang.String,
    filterList: sharepointLib.SPNs.BusinessDataNs.CollectionsNs.FilterCollection,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.EntityInstanceCollection = js.native
  def findFiltered(
    filterList: sharepointLib.SPNs.BusinessDataNs.CollectionsNs.FilterCollection,
    nameOfFinder: java.lang.String,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.EntityInstanceCollection = js.native
  def findSpecific(
    identity: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityIdentity,
    specificFinderName: java.lang.String,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityInstance = js.native
  def findSpecificByBdcId(
    bdcIdentity: java.lang.String,
    specificFinderName: java.lang.String,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityInstance = js.native
  def findSpecificDefault(
    identity: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityIdentity,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityInstance = js.native
  def findSpecificDefaultByBdcId(bdcIdentity: java.lang.String, lobSystemInstance: LobSystemInstance): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityInstance = js.native
  def getAssociationView(associationName: java.lang.String): EntityView = js.native
  def getCreatorView(methodInstanceName: java.lang.String): EntityView = js.native
  def getDefaultSpecificFinderView(): EntityView = js.native
  def getFilters(methodInstanceName: java.lang.String): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.FilterCollection = js.native
  def getFinderView(methodInstanceName: java.lang.String): EntityView = js.native
  def getIdentifierCount(): sharepointLib.SPNs.IntResult = js.native
  def getIdentifiers(): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.EntityIdentifierCollection = js.native
  def getLobSystem(): LobSystem = js.native
  def getSpecificFinderView(specificFinderName: java.lang.String): EntityView = js.native
  def getUpdaterView(updaterName: java.lang.String): EntityView = js.native
  def get_estimatedInstanceCount(): scala.Double = js.native
  def get_name(): java.lang.String = js.native
  def get_namespace(): java.lang.String = js.native
  def subscribe(
    eventType: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType,
    notificationCallback: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.NotificationCallback,
    onBehalfOfUser: java.lang.String,
    subscriberName: java.lang.String,
    lobSystemInstance: LobSystemInstance
  ): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.Subscription = js.native
  def unsubscribe(
    subscription: sharepointLib.SPNs.BusinessDataNs.RuntimeNs.Subscription,
    onBehalfOfUser: java.lang.String,
    unsubscriberName: java.lang.String,
    lobSystemInstance: LobSystemInstance
  ): scala.Unit = js.native
}

