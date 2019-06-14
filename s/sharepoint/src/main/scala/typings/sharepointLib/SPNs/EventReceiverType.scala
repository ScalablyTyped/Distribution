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
  
  /* 71 */ val appInstalled: appInstalled with scala.Double = js.native
  /* 73 */ val appUninstalling: appUninstalling with scala.Double = js.native
  /* 72 */ val appUpgraded: appUpgraded with scala.Double = js.native
  /* 75 */ val contextEvent: contextEvent with scala.Double = js.native
  /* 74 */ val emailReceived: emailReceived with scala.Double = js.native
  /* 68 */ val entityInstanceAdded: entityInstanceAdded with scala.Double = js.native
  /* 70 */ val entityInstanceDeleted: entityInstanceDeleted with scala.Double = js.native
  /* 69 */ val entityInstanceUpdated: entityInstanceUpdated with scala.Double = js.native
  /* 44 */ val fieldAdded: fieldAdded with scala.Double = js.native
  /* 11 */ val fieldAdding: fieldAdding with scala.Double = js.native
  /* 46 */ val fieldDeleted: fieldDeleted with scala.Double = js.native
  /* 13 */ val fieldDeleting: fieldDeleting with scala.Double = js.native
  /* 45 */ val fieldUpdated: fieldUpdated with scala.Double = js.native
  /* 12 */ val fieldUpdating: fieldUpdating with scala.Double = js.native
  /* 53 */ val groupAdded: groupAdded with scala.Double = js.native
  /* 20 */ val groupAdding: groupAdding with scala.Double = js.native
  /* 55 */ val groupDeleted: groupDeleted with scala.Double = js.native
  /* 22 */ val groupDeleting: groupDeleting with scala.Double = js.native
  /* 54 */ val groupUpdated: groupUpdated with scala.Double = js.native
  /* 21 */ val groupUpdating: groupUpdating with scala.Double = js.native
  /* 56 */ val groupUserAdded: groupUserAdded with scala.Double = js.native
  /* 23 */ val groupUserAdding: groupUserAdding with scala.Double = js.native
  /* 57 */ val groupUserDeleted: groupUserDeleted with scala.Double = js.native
  /* 24 */ val groupUserDeleting: groupUserDeleting with scala.Double = js.native
  /* 30 */ val inheritanceBreaking: inheritanceBreaking with scala.Double = js.native
  /* 63 */ val inheritanceBroken: inheritanceBroken with scala.Double = js.native
  /* 64 */ val inheritanceReset: inheritanceReset with scala.Double = js.native
  /* 31 */ val inheritanceResetting: inheritanceResetting with scala.Double = js.native
  /* 0 */ val invalidReceiver: invalidReceiver with scala.Double = js.native
  /* 33 */ val itemAdded: itemAdded with scala.Double = js.native
  /* 1 */ val itemAdding: itemAdding with scala.Double = js.native
  /* 39 */ val itemAttachmentAdded: itemAttachmentAdded with scala.Double = js.native
  /* 7 */ val itemAttachmentAdding: itemAttachmentAdding with scala.Double = js.native
  /* 40 */ val itemAttachmentDeleted: itemAttachmentDeleted with scala.Double = js.native
  /* 8 */ val itemAttachmentDeleting: itemAttachmentDeleting with scala.Double = js.native
  /* 36 */ val itemCheckedIn: itemCheckedIn with scala.Double = js.native
  /* 37 */ val itemCheckedOut: itemCheckedOut with scala.Double = js.native
  /* 4 */ val itemCheckingIn: itemCheckingIn with scala.Double = js.native
  /* 5 */ val itemCheckingOut: itemCheckingOut with scala.Double = js.native
  /* 35 */ val itemDeleted: itemDeleted with scala.Double = js.native
  /* 3 */ val itemDeleting: itemDeleting with scala.Double = js.native
  /* 42 */ val itemFileConverted: itemFileConverted with scala.Double = js.native
  /* 41 */ val itemFileMoved: itemFileMoved with scala.Double = js.native
  /* 9 */ val itemFileMoving: itemFileMoving with scala.Double = js.native
  /* 38 */ val itemUncheckedOut: itemUncheckedOut with scala.Double = js.native
  /* 6 */ val itemUncheckingOut: itemUncheckingOut with scala.Double = js.native
  /* 34 */ val itemUpdated: itemUpdated with scala.Double = js.native
  /* 2 */ val itemUpdating: itemUpdating with scala.Double = js.native
  /* 43 */ val itemVersionDeleted: itemVersionDeleted with scala.Double = js.native
  /* 10 */ val itemVersionDeleting: itemVersionDeleting with scala.Double = js.native
  /* 47 */ val listAdded: listAdded with scala.Double = js.native
  /* 14 */ val listAdding: listAdding with scala.Double = js.native
  /* 48 */ val listDeleted: listDeleted with scala.Double = js.native
  /* 15 */ val listDeleting: listDeleting with scala.Double = js.native
  /* 61 */ val roleAssignmentAdded: roleAssignmentAdded with scala.Double = js.native
  /* 28 */ val roleAssignmentAdding: roleAssignmentAdding with scala.Double = js.native
  /* 62 */ val roleAssignmentDeleted: roleAssignmentDeleted with scala.Double = js.native
  /* 29 */ val roleAssignmentDeleting: roleAssignmentDeleting with scala.Double = js.native
  /* 58 */ val roleDefinitionAdded: roleDefinitionAdded with scala.Double = js.native
  /* 25 */ val roleDefinitionAdding: roleDefinitionAdding with scala.Double = js.native
  /* 60 */ val roleDefinitionDeleted: roleDefinitionDeleted with scala.Double = js.native
  /* 27 */ val roleDefinitionDeleting: roleDefinitionDeleting with scala.Double = js.native
  /* 59 */ val roleDefinitionUpdated: roleDefinitionUpdated with scala.Double = js.native
  /* 26 */ val roleDefinitionUpdating: roleDefinitionUpdating with scala.Double = js.native
  /* 49 */ val siteDeleted: siteDeleted with scala.Double = js.native
  /* 16 */ val siteDeleting: siteDeleting with scala.Double = js.native
  /* 19 */ val webAdding: webAdding with scala.Double = js.native
  /* 50 */ val webDeleted: webDeleted with scala.Double = js.native
  /* 17 */ val webDeleting: webDeleting with scala.Double = js.native
  /* 51 */ val webMoved: webMoved with scala.Double = js.native
  /* 18 */ val webMoving: webMoving with scala.Double = js.native
  /* 52 */ val webProvisioned: webProvisioned with scala.Double = js.native
  /* 67 */ val workflowCompleted: workflowCompleted with scala.Double = js.native
  /* 66 */ val workflowPostponed: workflowPostponed with scala.Double = js.native
  /* 65 */ val workflowStarted: workflowStarted with scala.Double = js.native
  /* 32 */ val workflowStarting: workflowStarting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.EventReceiverType with scala.Double] = js.native
}

