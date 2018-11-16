package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventReceiverType extends js.Object

@JSGlobal("SP.EventReceiverType")
@js.native
object EventReceiverType extends js.Object {
  @js.native
  sealed trait appInstalled
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait appUninstalling
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait appUpgraded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait contextEvent
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait emailReceived
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait entityInstanceAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait entityInstanceDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait entityInstanceUpdated
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldUpdated
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait fieldUpdating
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUpdated
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUpdating
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUserAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUserAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUserDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait groupUserDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait inheritanceBreaking
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait inheritanceBroken
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait inheritanceReset
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait inheritanceResetting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait invalidReceiver
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAttachmentAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAttachmentAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAttachmentDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemAttachmentDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemCheckedIn
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemCheckedOut
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemCheckingIn
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemCheckingOut
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemFileConverted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemFileMoved
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemFileMoving
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemUncheckedOut
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemUncheckingOut
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemUpdated
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemUpdating
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemVersionDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait itemVersionDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait listAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait listAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait listDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait listDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleAssignmentAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleAssignmentAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleAssignmentDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleAssignmentDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionAdded
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionUpdated
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait roleDefinitionUpdating
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait siteDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait siteDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webAdding
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webDeleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webDeleting
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webMoved
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webMoving
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait webProvisioned
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait workflowCompleted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait workflowPostponed
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait workflowStarted
    extends sharepointLib.SPNs.EventReceiverType
  
  @js.native
  sealed trait workflowStarting
    extends sharepointLib.SPNs.EventReceiverType
  
  val appInstalled: appInstalled with java.lang.String = js.native
  val appUninstalling: appUninstalling with java.lang.String = js.native
  val appUpgraded: appUpgraded with java.lang.String = js.native
  val contextEvent: contextEvent with java.lang.String = js.native
  val emailReceived: emailReceived with java.lang.String = js.native
  val entityInstanceAdded: entityInstanceAdded with java.lang.String = js.native
  val entityInstanceDeleted: entityInstanceDeleted with java.lang.String = js.native
  val entityInstanceUpdated: entityInstanceUpdated with java.lang.String = js.native
  val fieldAdded: fieldAdded with java.lang.String = js.native
  val fieldAdding: fieldAdding with java.lang.String = js.native
  val fieldDeleted: fieldDeleted with java.lang.String = js.native
  val fieldDeleting: fieldDeleting with java.lang.String = js.native
  val fieldUpdated: fieldUpdated with java.lang.String = js.native
  val fieldUpdating: fieldUpdating with java.lang.String = js.native
  val groupAdded: groupAdded with java.lang.String = js.native
  val groupAdding: groupAdding with java.lang.String = js.native
  val groupDeleted: groupDeleted with java.lang.String = js.native
  val groupDeleting: groupDeleting with java.lang.String = js.native
  val groupUpdated: groupUpdated with java.lang.String = js.native
  val groupUpdating: groupUpdating with java.lang.String = js.native
  val groupUserAdded: groupUserAdded with java.lang.String = js.native
  val groupUserAdding: groupUserAdding with java.lang.String = js.native
  val groupUserDeleted: groupUserDeleted with java.lang.String = js.native
  val groupUserDeleting: groupUserDeleting with java.lang.String = js.native
  val inheritanceBreaking: inheritanceBreaking with java.lang.String = js.native
  val inheritanceBroken: inheritanceBroken with java.lang.String = js.native
  val inheritanceReset: inheritanceReset with java.lang.String = js.native
  val inheritanceResetting: inheritanceResetting with java.lang.String = js.native
  val invalidReceiver: invalidReceiver with java.lang.String = js.native
  val itemAdded: itemAdded with java.lang.String = js.native
  val itemAdding: itemAdding with java.lang.String = js.native
  val itemAttachmentAdded: itemAttachmentAdded with java.lang.String = js.native
  val itemAttachmentAdding: itemAttachmentAdding with java.lang.String = js.native
  val itemAttachmentDeleted: itemAttachmentDeleted with java.lang.String = js.native
  val itemAttachmentDeleting: itemAttachmentDeleting with java.lang.String = js.native
  val itemCheckedIn: itemCheckedIn with java.lang.String = js.native
  val itemCheckedOut: itemCheckedOut with java.lang.String = js.native
  val itemCheckingIn: itemCheckingIn with java.lang.String = js.native
  val itemCheckingOut: itemCheckingOut with java.lang.String = js.native
  val itemDeleted: itemDeleted with java.lang.String = js.native
  val itemDeleting: itemDeleting with java.lang.String = js.native
  val itemFileConverted: itemFileConverted with java.lang.String = js.native
  val itemFileMoved: itemFileMoved with java.lang.String = js.native
  val itemFileMoving: itemFileMoving with java.lang.String = js.native
  val itemUncheckedOut: itemUncheckedOut with java.lang.String = js.native
  val itemUncheckingOut: itemUncheckingOut with java.lang.String = js.native
  val itemUpdated: itemUpdated with java.lang.String = js.native
  val itemUpdating: itemUpdating with java.lang.String = js.native
  val itemVersionDeleted: itemVersionDeleted with java.lang.String = js.native
  val itemVersionDeleting: itemVersionDeleting with java.lang.String = js.native
  val listAdded: listAdded with java.lang.String = js.native
  val listAdding: listAdding with java.lang.String = js.native
  val listDeleted: listDeleted with java.lang.String = js.native
  val listDeleting: listDeleting with java.lang.String = js.native
  val roleAssignmentAdded: roleAssignmentAdded with java.lang.String = js.native
  val roleAssignmentAdding: roleAssignmentAdding with java.lang.String = js.native
  val roleAssignmentDeleted: roleAssignmentDeleted with java.lang.String = js.native
  val roleAssignmentDeleting: roleAssignmentDeleting with java.lang.String = js.native
  val roleDefinitionAdded: roleDefinitionAdded with java.lang.String = js.native
  val roleDefinitionAdding: roleDefinitionAdding with java.lang.String = js.native
  val roleDefinitionDeleted: roleDefinitionDeleted with java.lang.String = js.native
  val roleDefinitionDeleting: roleDefinitionDeleting with java.lang.String = js.native
  val roleDefinitionUpdated: roleDefinitionUpdated with java.lang.String = js.native
  val roleDefinitionUpdating: roleDefinitionUpdating with java.lang.String = js.native
  val siteDeleted: siteDeleted with java.lang.String = js.native
  val siteDeleting: siteDeleting with java.lang.String = js.native
  val webAdding: webAdding with java.lang.String = js.native
  val webDeleted: webDeleted with java.lang.String = js.native
  val webDeleting: webDeleting with java.lang.String = js.native
  val webMoved: webMoved with java.lang.String = js.native
  val webMoving: webMoving with java.lang.String = js.native
  val webProvisioned: webProvisioned with java.lang.String = js.native
  val workflowCompleted: workflowCompleted with java.lang.String = js.native
  val workflowPostponed: workflowPostponed with java.lang.String = js.native
  val workflowStarted: workflowStarted with java.lang.String = js.native
  val workflowStarting: workflowStarting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.EventReceiverType with java.lang.String] = js.native
}

