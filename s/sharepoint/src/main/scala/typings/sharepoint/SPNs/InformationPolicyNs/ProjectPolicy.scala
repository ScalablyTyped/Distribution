package typings.sharepoint.SPNs.InformationPolicyNs

import typings.sharepoint.SPNs.BooleanResult
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientObjectList
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.DateTimeResult
import typings.sharepoint.SPNs.ObjectPath
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.InformationPolicy.ProjectPolicy")
@js.native
class ProjectPolicy protected () extends ClientObject {
  def this(context: ClientRuntimeContext, objectPath: ObjectPath) = this()
  def get_description(): String = js.native
  def get_emailBody(): String = js.native
  def get_emailBodyWithTeamMailbox(): String = js.native
  def get_emailSubject(): String = js.native
  def get_name(): String = js.native
  def savePolicy(): Unit = js.native
  def set_emailBody(value: String): String = js.native
  def set_emailBodyWithTeamMailbox(value: String): String = js.native
  def set_emailSubject(value: String): String = js.native
}

/* static members */
@JSGlobal("SP.InformationPolicy.ProjectPolicy")
@js.native
object ProjectPolicy extends js.Object {
  def applyProjectPolicy(context: ClientRuntimeContext, web: Web, projectPolicy: ProjectPolicy): Unit = js.native
  def closeProject(context: ClientRuntimeContext, web: Web): Unit = js.native
  def doesProjectHavePolicy(context: ClientRuntimeContext, web: Web): BooleanResult = js.native
  def getCurrentlyAppliedProject(context: ClientRuntimeContext, web: Web): ProjectPolicy = js.native
  def getProjectCloseDate(context: ClientRuntimeContext, web: Web): DateTimeResult = js.native
  def getProjectExpirationDate(context: ClientRuntimeContext, web: Web): DateTimeResult = js.native
  def getProjectPolicies(context: ClientRuntimeContext, web: Web): ClientObjectList[ProjectPolicy] = js.native
  def isProjectClosed(context: ClientRuntimeContext, web: Web): BooleanResult = js.native
  def openProject(context: ClientRuntimeContext, web: Web): Unit = js.native
  def postponeProject(context: ClientRuntimeContext, web: Web): Unit = js.native
}

