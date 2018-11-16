package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages workflow definitions and workflow activity authoring. */
@JSGlobal("SP.WorkflowServices.WorkflowDeploymentService")
@js.native
class WorkflowDeploymentService ()
  extends sharepointLib.SPNs.ClientObject {
  /** Deletes the URL of a workflow definition's collateral file.
              @param workflowDefinitionId The guid identifier of the workflow definition.  */
  def deleteCollateral(workflowDefinitionId: java.lang.String, leafFileName: java.lang.String): scala.Unit = js.native
  /** Deletes a workflow definition.
              @param definitionId The guid identifier of the workflow definition.  */
  def deleteDefinition(definitionId: java.lang.String): scala.Unit = js.native
  /** Marks a workflow definition as deprecated. Currently running workflow instances are allowed to complete, but new instances of the workflow definition are prevented from starting.  */
  def deprecateDefinition(definitionId: java.lang.String): scala.Unit = js.native
  /** Retrieves workflow definitions from the workflow store that match the tags. */
  def enumerateDefinitions(publishedOnly: scala.Boolean): WorkflowDefinitionCollection = js.native
  /** Returns an XML representation of a collection of XAML class signatures for workflow definitions.
              @param lastChanges Date time value representing the latest changes; class signatures older than this time are excluded from the result set.  */
  def getActivitySignatures(lastChanged: java.lang.String): sharepointLib.SPNs.ClientResult[_] = js.native
  /** Retrieves the URL of the collateral file of the workflow definition.
              @param workflowDefinitionId The guid identifier of the workflow definition.
              @param leafFileName The leaf name of the collateral file. */
  def getCollateralUri(workflowDefinitionId: java.lang.String, leafFileName: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  /** Retrieves a specified workflow definition from the workflow store.
              @param definitionId The guid identifier of the workflow definition.  */
  def getDefinition(definitionId: java.lang.String): WorkflowDefinition = js.native
  /** Returns an XML representation of a list of valid Workflow Manager Client 1.0 actions for the specified web (WorkflowInfo element). */
  def getDesignerActions(web: sharepointLib.SPNs.Web): sharepointLib.SPNs.StringResult = js.native
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
    definitionId: sharepointLib.SPNs.Guid,
    packageDefaultFilename: java.lang.String,
    packageTitle: java.lang.String,
    packageDescription: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
  /** Publishes a workflow definition to the workflow store.  */
  def publishDefinition(definitionId: java.lang.String): scala.Unit = js.native
  /** Saves the collateral file of a workflow definition.
              @param workflowDefinitionId The guid identifier of the workflow definition.*/
  def saveCollateral(
    workflowDefinitionId: java.lang.String,
    leafFileName: java.lang.String,
    fileContent: sharepointLib.SPNs.Base64EncodedByteArray
  ): scala.Unit = js.native
  /** Saves a SharePoint workflow definition to the workflow store.  */
  def saveDefinition(definition: WorkflowDefinition): sharepointLib.SPNs.GuidResult = js.native
  /** Validates the specified activity against workflow definitions in the workflow store.  */
  def validateActivity(activityXaml: java.lang.String): sharepointLib.SPNs.StringResult = js.native
}

