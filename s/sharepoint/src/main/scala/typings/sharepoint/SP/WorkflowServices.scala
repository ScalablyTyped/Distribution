package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkflowServices {
  
  @js.native
  sealed trait WorkflowStatus extends StObject
  @JSGlobal("SP.WorkflowServices.WorkflowStatus")
  @js.native
  object WorkflowStatus extends StObject {
    
    @js.native
    sealed trait canceled
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait canceling
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait completed
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait invalid
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait notSpecified
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait notStarted
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait started
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait suspended
      extends StObject
         with WorkflowStatus
    
    @js.native
    sealed trait terminated
      extends StObject
         with WorkflowStatus
  }
  
  // TODO: comments, types
  @js.native
  trait InteropService
    extends StObject
       with ClientObject {
    
    def cancelWorkflow(instanceId: Guid): Unit = js.native
    
    def disableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
    
    def enableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
    
    def startWorkflow(
      associationName: String,
      correlationId: Guid,
      listId: Guid,
      itemGuid: Guid,
      workflowParameters: Any
    ): GuidResult = js.native
  }
  
  /** Represents a workflow definition and associated properties. */
  @js.native
  trait WorkflowDefinition
    extends StObject
       with ClientObject {
    
    /** Url of the association form */
    def get_associationUrl(): String = js.native
    
    def get_description(): String = js.native
    
    def get_displayName(): String = js.native
    
    /** Identifier for a draft version of the workflow definition */
    def get_draftVersion(): String = js.native
    
    /** Defines the fields of the workflow initiation forms and association forms (CAML string)  */
    def get_formField(): String = js.native
    
    def get_id(): String = js.native
    
    def get_initiationUrl(): String = js.native
    
    /** Gets custom properties of the workflow definition */
    def get_properties(): StringDictionary[Any] = js.native
    
    /** true if the workflow definition has been published to the external workflow host; false if the workflow definition is only saved on the site  */
    def get_published(): Boolean = js.native
    
    /** Determines whether to automatically generate an association form for this workflow.
      If the value is true, and the associationUrl is not already set, a default association form is automatically generated for the workflow when saveDefinition is called.  */
    def get_requiresAssociationForm(): Boolean = js.native
    
    /** Determines whether to automatically generate an initiation form for this workflow.
      If the value is true, and the initiationUrl is not already set, a default initiation form is automatically generated for the workflow when saveDefinition is called.  */
    def get_requiresInitiationForm(): Boolean = js.native
    
    /** RestrictToScope is a GUID value, used in conjunction with the RestrictToType property to further restrict the scope of the definition.
      For example, if the RestrictToType is "List", then setting the RestrictToScope to a particular list identifier limits the definition to be associable only to the specified list.
      If the RestrictToType is "List" but the RestrictToScope is null or the empty string, then the definition is associable to any list. */
    def get_restrictToScope(): String = js.native
    
    /** RestrictToType determines the possible event source type for a workflow subscription that uses this definition.
      Possible values include "List", "Site", the empty string, or null.  */
    def get_restrictToType(): String = js.native
    
    /** XAML definition of the workflow */
    def get_xaml(): String = js.native
    
    /** This method adds a key-value pair (propertyName, value) to the workflow definition object's property bag.  */
    def setProperty(propertyName: String, value: String): Unit = js.native
    
    /** Url of the association form */
    def set_associationUrl(value: String): String = js.native
    
    def set_description(value: String): String = js.native
    
    def set_displayName(value: String): String = js.native
    
    /** Identifier for a draft version of the workflow definition */
    def set_draftVersion(value: String): String = js.native
    
    /** Defines the fields of the workflow initiation forms and association forms (CAML string)  */
    def set_formField(value: String): String = js.native
    
    def set_id(value: String): String = js.native
    
    def set_initiationUrl(value: String): String = js.native
    
    /** Determines whether to automatically generate an association form for this workflow.
      If the value is true, and the associationUrl is not already set, a default association form is automatically generated for the workflow when saveDefinition is called.  */
    def set_requiresAssociationForm(value: Boolean): Boolean = js.native
    
    /** Determines whether to automatically generate an initiation form for this workflow.
      If the value is true, and the initiationUrl is not already set, a default initiation form is automatically generated for the workflow when saveDefinition is called.  */
    def set_requiresInitiationForm(value: Boolean): Boolean = js.native
    
    /** RestrictToScope is a GUID value, used in conjunction with the RestrictToType property to further restrict the scope of the definition.
      For example, if the RestrictToType is "List", then setting the RestrictToScope to a particular list identifier limits the definition to be associable only to the specified list.
      If the RestrictToType is "List" but the RestrictToScope is null or the empty string, then the definition is associable to any list. */
    def set_restrictToScope(value: String): String = js.native
    
    /** RestrictToType determines the possible event source type for a workflow subscription that uses this definition.
      Possible values include "List", "Site", the empty string, or null.  */
    def set_restrictToType(value: String): String = js.native
    
    /** XAML definition of the workflow */
    def set_xaml(value: String): String = js.native
  }
  
  /** Represents a collection of WorkflowDefinition objects */
  @js.native
  trait WorkflowDefinitionCollection
    extends StObject
       with ClientObjectCollection[WorkflowDefinition] {
    
    /** returns SP.WorkflowDefinition class */
    def get_childItemType(): Any = js.native
    
    def get_item(index: Double): WorkflowDefinition = js.native
    
    def itemAt(index: Double): WorkflowDefinition = js.native
  }
  
  /** Manages workflow definitions and workflow activity authoring. */
  @js.native
  trait WorkflowDeploymentService
    extends StObject
       with ClientObject {
    
    /** Deletes the URL of a workflow definition's collateral file.
      @param workflowDefinitionId The guid identifier of the workflow definition.  */
    def deleteCollateral(workflowDefinitionId: String, leafFileName: String): Unit = js.native
    
    /** Deletes a workflow definition.
      @param definitionId The guid identifier of the workflow definition.  */
    def deleteDefinition(definitionId: String): Unit = js.native
    
    /** Marks a workflow definition as deprecated. Currently running workflow instances are allowed to complete, but new instances of the workflow definition are prevented from starting.  */
    def deprecateDefinition(definitionId: String): Unit = js.native
    
    /** Retrieves workflow definitions from the workflow store that match the tags. */
    def enumerateDefinitions(publishedOnly: Boolean): WorkflowDefinitionCollection = js.native
    
    /** Returns an XML representation of a collection of XAML class signatures for workflow definitions.
      @param lastChanges Date time value representing the latest changes; class signatures older than this time are excluded from the result set.  */
    def getActivitySignatures(lastChanged: String): ClientResult[Any] = js.native
    
    /** Retrieves the URL of the collateral file of the workflow definition.
      @param workflowDefinitionId The guid identifier of the workflow definition.
      @param leafFileName The leaf name of the collateral file. */
    def getCollateralUri(workflowDefinitionId: String, leafFileName: String): StringResult = js.native
    
    /** Retrieves a specified workflow definition from the workflow store.
      @param definitionId The guid identifier of the workflow definition.  */
    def getDefinition(definitionId: String): WorkflowDefinition = js.native
    
    /** Returns an XML representation of a list of valid Workflow Manager Client 1.0 actions for the specified web (WorkflowInfo element). */
    def getDesignerActions(web: Web): StringResult = js.native
    
    /** Packages a single workflow definition into a SharePoint solution package (.wsp file) and saves the package to the Site Assets library.
      Returns the URL of the package file in the Site Asset library.
      Remarks:
      1. This method does not activate the package.
      2. If a package with the same name already exists in the Site Assets library, the method adds an integer suffix in braces to the file name, e.g. packageDefaultFilename{2}.wsp
      @param definitionId The guid identifier of the workflow definition.
      @param packageDefaultFilename The default filename to choose for the new package.
      @param packageTitle The title of the package.
      @param packageDescription The description of the package. */
    def packageDefinition(
      definitionId: Guid,
      packageDefaultFilename: String,
      packageTitle: String,
      packageDescription: String
    ): StringResult = js.native
    
    /** Publishes a workflow definition to the workflow store.  */
    def publishDefinition(definitionId: String): Unit = js.native
    
    /** Saves the collateral file of a workflow definition.
      @param workflowDefinitionId The guid identifier of the workflow definition.*/
    def saveCollateral(workflowDefinitionId: String, leafFileName: String, fileContent: Base64EncodedByteArray): Unit = js.native
    
    /** Saves a SharePoint workflow definition to the workflow store.  */
    def saveDefinition(definition: WorkflowDefinition): GuidResult = js.native
    
    /** Validates the specified activity against workflow definitions in the workflow store.  */
    def validateActivity(activityXaml: String): StringResult = js.native
  }
  
  /** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
  @js.native
  trait WorkflowInstance
    extends StObject
       with ClientObject {
    
    /** Contains the error string or exception information if the workflow faults. */
    def get_faultInfo(): String = js.native
    
    /** Unique identifier (GUID) for the workflow instance */
    def get_id(): String = js.native
    
    /** Gets the Coordinated Universal Time (UTC) when this workflow instance was created. */
    def get_instanceCreated(): String = js.native
    
    /** Gets the Coordinated Universal Time (UTC) when the workflow instance state was last persisted */
    def get_lastUpdated(): String = js.native
    
    /** Specifies properties of this workflow instance */
    def get_properties(): StringDictionary[String] = js.native
    
    /** Returns runtime status of the workflow instance */
    def get_status(): WorkflowStatus = js.native
    
    /** Specifies the custom status set by workflow authors. */
    def get_userStatus(): String = js.native
    
    /** Gets the unique identifier (GUID) of the subscription that instantiates the WorkflowInstance */
    def get_workflowSubscriptionId(): Guid = js.native
    
    /** Specifies the custom status set by workflow authors. */
    def set_userStatus(value: String): String = js.native
  }
  
  /** Represents a collection of WorkflowInstance objects */
  @js.native
  trait WorkflowInstanceCollection
    extends StObject
       with ClientObjectCollection[WorkflowInstance] {
    
    /** returns SP.WorkflowInstance class */
    def get_childItemType(): Any = js.native
    
    def get_item(index: Double): WorkflowInstance = js.native
    
    def itemAt(index: Double): WorkflowInstance = js.native
  }
  
  /** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
  @js.native
  trait WorkflowInstanceService
    extends StObject
       with ClientObject {
    
    /** Sends a cancel message to the specified workflow instance and permits the instance to execute a cancellation scope. */
    def cancelWorkflow(instance: WorkflowInstance): Unit = js.native
    
    /** Retrieves a count of all the instances of the specified WorkflowSubscription. */
    def countInstances(parentSubscription: WorkflowSubscription): IntResult = js.native
    
    /** Retrieves a count of the instances of the specified WorkflowSubscription that have a specified status. */
    def countInstancesWithStatus(parentSubscription: WorkflowSubscription, status: WorkflowStatus): IntResult = js.native
    
    /** Gets a workflow instance collection comprising the 100 most recent workflow instances started by a specified subscription.  */
    def enumerate(parentSubscription: WorkflowSubscription): WorkflowInstanceCollection = js.native
    
    /** Gets the list of instances for the specified list item. */
    def enumerateInstancesForListItem(listId: String, itemId: Double): WorkflowInstanceCollection = js.native
    
    /** Gets the list of instances for the specified list item. */
    def enumerateInstancesForListItemWithOffset(listId: String, itemId: Double, offset: Double): WorkflowInstanceCollection = js.native
    
    /** Gets the list of instances for the current site. */
    def enumerateInstancesForSite(): WorkflowInstanceCollection = js.native
    
    /** Gets the list of instances for the current site. */
    def enumerateInstancesForSiteWithOffset(offset: Double): WorkflowInstanceCollection = js.native
    
    /** Gets a workflow instance collection comprising 100 workflow instances starting at the specified offset.  */
    def enumerateWithOffset(parentSubscription: WorkflowSubscription, offset: Double): WorkflowInstanceCollection = js.native
    
    def getDebugInfo(instance: WorkflowInstance): StringResult = js.native
    
    /** Gets workflow instance specified by the provided instance GUID */
    def getInstance(instanceId: String): WorkflowInstance = js.native
    
    /** Sends a custom event to a running workflow with the event payload. */
    def publishCustomEvent(instance: WorkflowInstance, eventName: String, payload: String): Unit = js.native
    
    def resumeWorkflow(instance: WorkflowInstance): Unit = js.native
    
    /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
      Returns GUID of the instance object.
      @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
    def startWorkflow(subscription: WorkflowSubscription, payload: StringDictionary[Any]): GuidResult = js.native
    
    /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
      Returns GUID of the instance object.
      @param subscription The subscription associated with the workflow instance.
      @param itemId The integer id of the list item on which to start the workflow instance.
      @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
    def startWorkflowOnListItem(subscription: WorkflowSubscription, itemId: Double, payload: StringDictionary[Any]): GuidResult = js.native
    
    def suspendWorkflow(instance: WorkflowInstance): Unit = js.native
    
    /** Terminate a workflow instance forcefully by deleting it from memory. The instance is not allowed to execute a cancellation scope */
    def terminateWorkflow(instance: WorkflowInstance): Unit = js.native
  }
  
  /** Describes the workflow host configuration states and provides service objects that interact with the workflow */
  @js.native
  trait WorkflowServicesManager
    extends StObject
       with ClientObject {
    
    def getWorkflowDeploymentService(): WorkflowDeploymentService = js.native
    
    def getWorkflowInstanceService(): WorkflowInstanceService = js.native
    
    def getWorkflowInteropService(): InteropService = js.native
    
    def getWorkflowSubscriptionService(): WorkflowSubscriptionService = js.native
    
    /** The current application identifier.*/
    def get_appId(): String = js.native
    
    /** Indicates whether this workflow service is actively connected to a workflow host. */
    def get_isConnected(): Boolean = js.native
    
    /** Returns the path of the current scope in the workflow host. */
    def get_scopePath(): String = js.native
  }
  
  /** Base class representing subscriptions for the external workflow host. */
  @js.native
  trait WorkflowSubscription
    extends StObject
       with ClientObject {
    
    /** Gets the unique ID of the workflow definition to activate. */
    def get_definitionId(): Guid = js.native
    
    /** Gets a boolean value that specifies if the workflow subscription is enabled.
      When disabled, new instances of the subscription cannot be started, but existing instances will continue to run.  */
    def get_enabled(): Boolean = js.native
    
    /** Gets the logical source instance name of the event. (GUID) */
    def get_eventSourceId(): String = js.native
    
    /** Gets or sets the list of event types for which the subscription is listening.
      For SharePoint events, these will map to a value in the SPEventReceiverType enumeration. */
    def get_eventTypes(): js.Array[String] = js.native
    
    /** Unique identifier (GUID) of the workflow subscription */
    def get_id(): String = js.native
    
    /** Boolean value that specifies whether multiple workflow instances can be started manually on the same list item at the same time. This property can be used for list workflows only.  */
    def get_manualStartBypassesActivationLimit(): Boolean = js.native
    
    /** Gets the name of the workflow subscription for the specified event source.  */
    def get_name(): String = js.native
    
    /** Gets the properties and values to pass to the workflow definition when the subscription is matched. */
    def get_propertyDefinitions(): Any = js.native
    
    /** Gets the name of the workflow status field on the specified list.  */
    def get_statusFieldName(): String = js.native
    
    /** Sets the name-value pairs for workflow definition initiation parameters that are stored in the PropertyDefinitions property  */
    def setProperty(propertyName: String, value: String): Unit = js.native
    
    /** Sets the unique ID of the workflow definition to activate. */
    def set_definitionId(value: Guid): Guid = js.native
    
    /** Sets a boolean value that enables or disables the workflow subscription.
      When disabled, new instances of the subscription cannot be started, but existing instances will continue to run.  */
    def set_enabled(value: Boolean): Boolean = js.native
    
    /** Sets the logical source instance name of the event. (GUID) */
    def set_eventSourceId(value: String): String = js.native
    
    /** Gets or sets the list of event types for which the subscription is listening.
      For SharePoint events, these will map to a value in the SPEventReceiverType enumeration. */
    def set_eventTypes(value: js.Array[String]): js.Array[String] = js.native
    
    /** Unique identifier (GUID) of the workflow subscription */
    def set_id(value: String): String = js.native
    
    /** Boolean value that specifies whether multiple workflow instances can be started manually on the same list item at the same time. This property can be used for list workflows only.  */
    def set_manualStartBypassesActivationLimit(value: Boolean): Boolean = js.native
    
    /** Sets the name of the workflow subscription for the specified event source.  */
    def set_name(value: String): String = js.native
    
    /** Gets or sets the name of the workflow status field on the specified list.  */
    def set_statusFieldName(value: String): String = js.native
  }
  
  /** Represents a collection of WorkflowSubscription objects */
  @js.native
  trait WorkflowSubscriptionCollection
    extends StObject
       with ClientObjectCollection[WorkflowSubscription] {
    
    /** returns SP.WorkflowInstance class */
    def get_childItemType(): Any = js.native
    
    def get_item(index: Double): WorkflowSubscription = js.native
    
    def itemAt(index: Double): WorkflowSubscription = js.native
  }
  
  @js.native
  trait WorkflowSubscriptionService
    extends StObject
       with ClientObject {
    
    def deleteSubscription(subscriptionId: Guid): WorkflowSubscription = js.native
    
    /** Retrieves workflow subscriptions that contains all of the workflow subscriptions on the Web  */
    def enumerateSubscriptions(): WorkflowSubscriptionCollection = js.native
    
    /** Retrieves workflow subscriptions based on workflow definition */
    def enumerateSubscriptionsByDefinition(definitionId: String): WorkflowSubscriptionCollection = js.native
    
    /** Retrieves workflow subscriptions based on the specified EventSourceId */
    def enumerateSubscriptionsByEventSource(eventSourceId: String): WorkflowSubscriptionCollection = js.native
    
    /** Retrieves workflow subscriptions based on the specified list.
      @param listId The unique identifier (GUID) of the list on which to filter the subscriptions. */
    def enumerateSubscriptionsByList(listId: String): WorkflowSubscriptionCollection = js.native
    
    def getSubscription(subscriptionId: Guid): WorkflowSubscription = js.native
    
    /** Creates a workflow subscription for a workflow, and returns the unique identifier of the new subscription. */
    def publishSubscription(subscription: WorkflowSubscription): GuidResult = js.native
    
    /** Creates a workflow subscription for a workflow and if necessary an event receiver on the specified list.
      Also writes an EventSourceId that matches the list as the event source.
      Returns the unique identifier of the new subscription.
      @param listId Unique identifier (GUID) for the specified list. */
    def publishSubscriptionForList(subscription: WorkflowSubscription, listId: String): GuidResult = js.native
    
    /** Ensures that an event receiver will monitor a list for the specified event.
      * @param listId Unique identifier (GUID) for the specified list.
      * @param eventName eventName The name of the event to be monitored. */
    def registerInterestInList(listId: String, eventName: String): Unit = js.native
    
    /** Removes monitoring for an event receiver on the specified list with the specified event.
      * @param listId GUID of the list containing the event receiver to be unregistered.
      * @param eventName eventName The name of the event to be removed. */
    def unregisterInterestInList(listId: String, eventName: String): Unit = js.native
  }
}
