package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a workflow definition and associated properties. */
@JSGlobal("SP.WorkflowServices.WorkflowDefinition")
@js.native
class WorkflowDefinition protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext) = this()
  /** Url of the association form */
  def get_associationUrl(): java.lang.String = js.native
  def get_description(): java.lang.String = js.native
  def get_displayName(): java.lang.String = js.native
  /** Identifier for a draft version of the workflow definition */
  def get_draftVersion(): java.lang.String = js.native
  /** Defines the fields of the workflow initiation forms and association forms (CAML string)  */
  def get_formField(): java.lang.String = js.native
  def get_id(): java.lang.String = js.native
  def get_initiationUrl(): java.lang.String = js.native
  /** Gets custom properties of the workflow definition */
  def get_properties(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /** true if the workflow definition has been published to the external workflow host; false if the workflow definition is only saved on the site  */
  def get_published(): scala.Boolean = js.native
  /** Determines whether to automatically generate an association form for this workflow.
              If the value is true, and the associationUrl is not already set, a default association form is automatically generated for the workflow when saveDefinition is called.  */
  def get_requiresAssociationForm(): scala.Boolean = js.native
  /** Determines whether to automatically generate an initiation form for this workflow.
              If the value is true, and the initiationUrl is not already set, a default initiation form is automatically generated for the workflow when saveDefinition is called.  */
  def get_requiresInitiationForm(): scala.Boolean = js.native
  /** RestrictToScope is a GUID value, used in conjunction with the RestrictToType property to further restrict the scope of the definition.
              For example, if the RestrictToType is "List", then setting the RestrictToScope to a particular list identifier limits the definition to be associable only to the specified list.
              If the RestrictToType is "List" but the RestrictToScope is null or the empty string, then the definition is associable to any list. */
  def get_restrictToScope(): java.lang.String = js.native
  /** RestrictToType determines the possible event source type for a workflow subscription that uses this definition.
              Possible values include "List", "Site", the empty string, or null.  */
  def get_restrictToType(): java.lang.String = js.native
  /** XAML definition of the workflow */
  def get_xaml(): java.lang.String = js.native
  /** This method adds a key-value pair (propertyName, value) to the workflow definition object's property bag.  */
  def setProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /** Url of the association form */
  def set_associationUrl(value: java.lang.String): java.lang.String = js.native
  def set_description(value: java.lang.String): java.lang.String = js.native
  def set_displayName(value: java.lang.String): java.lang.String = js.native
  /** Identifier for a draft version of the workflow definition */
  def set_draftVersion(value: java.lang.String): java.lang.String = js.native
  /** Defines the fields of the workflow initiation forms and association forms (CAML string)  */
  def set_formField(value: java.lang.String): java.lang.String = js.native
  def set_id(value: java.lang.String): java.lang.String = js.native
  def set_initiationUrl(value: java.lang.String): java.lang.String = js.native
  /** Determines whether to automatically generate an association form for this workflow.
              If the value is true, and the associationUrl is not already set, a default association form is automatically generated for the workflow when saveDefinition is called.  */
  def set_requiresAssociationForm(value: scala.Boolean): scala.Boolean = js.native
  /** Determines whether to automatically generate an initiation form for this workflow.
              If the value is true, and the initiationUrl is not already set, a default initiation form is automatically generated for the workflow when saveDefinition is called.  */
  def set_requiresInitiationForm(value: scala.Boolean): scala.Boolean = js.native
  /** RestrictToScope is a GUID value, used in conjunction with the RestrictToType property to further restrict the scope of the definition.
              For example, if the RestrictToType is "List", then setting the RestrictToScope to a particular list identifier limits the definition to be associable only to the specified list.
              If the RestrictToType is "List" but the RestrictToScope is null or the empty string, then the definition is associable to any list. */
  def set_restrictToScope(value: java.lang.String): java.lang.String = js.native
  /** RestrictToType determines the possible event source type for a workflow subscription that uses this definition.
              Possible values include "List", "Site", the empty string, or null.  */
  def set_restrictToType(value: java.lang.String): java.lang.String = js.native
  /** XAML definition of the workflow */
  def set_xaml(value: java.lang.String): java.lang.String = js.native
}

