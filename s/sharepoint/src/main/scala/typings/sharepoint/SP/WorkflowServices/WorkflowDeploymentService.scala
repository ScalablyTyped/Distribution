package typings.sharepoint.SP.WorkflowServices

import typings.sharepoint.SP.Base64EncodedByteArray
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientResult
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.GuidResult
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages workflow definitions and workflow activity authoring. */
@js.native
trait WorkflowDeploymentService extends ClientObject {
  
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
  def getActivitySignatures(lastChanged: String): ClientResult[_] = js.native
  
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
