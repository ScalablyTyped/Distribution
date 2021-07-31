package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventReceiverType extends StObject
@JSGlobal("SP.EventReceiverType")
@js.native
object EventReceiverType extends StObject {
  
  @js.native
  sealed trait appInstalled
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait appUninstalling
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait appUpgraded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait contextEvent
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait emailReceived
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait entityInstanceAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait entityInstanceDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait entityInstanceUpdated
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldUpdated
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait fieldUpdating
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUpdated
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUpdating
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUserAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUserAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUserDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait groupUserDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait inheritanceBreaking
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait inheritanceBroken
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait inheritanceReset
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait inheritanceResetting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait invalidReceiver
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAttachmentAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAttachmentAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAttachmentDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemAttachmentDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemCheckedIn
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemCheckedOut
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemCheckingIn
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemCheckingOut
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemFileConverted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemFileMoved
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemFileMoving
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemUncheckedOut
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemUncheckingOut
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemUpdated
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemUpdating
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemVersionDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait itemVersionDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait listAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait listAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait listDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait listDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleAssignmentAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleAssignmentAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleAssignmentDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleAssignmentDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionAdded
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionUpdated
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait roleDefinitionUpdating
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait siteDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait siteDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webAdding
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webDeleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webDeleting
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webMoved
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webMoving
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait webProvisioned
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait workflowCompleted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait workflowPostponed
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait workflowStarted
    extends StObject
       with EventReceiverType
  
  @js.native
  sealed trait workflowStarting
    extends StObject
       with EventReceiverType
}
