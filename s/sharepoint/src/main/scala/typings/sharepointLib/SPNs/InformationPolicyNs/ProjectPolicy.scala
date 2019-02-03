package typings
package sharepointLib.SPNs.InformationPolicyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.InformationPolicy.ProjectPolicy")
@js.native
class ProjectPolicy protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, objectPath: sharepointLib.SPNs.ObjectPath) = this()
  def get_description(): java.lang.String = js.native
  def get_emailBody(): java.lang.String = js.native
  def get_emailBodyWithTeamMailbox(): java.lang.String = js.native
  def get_emailSubject(): java.lang.String = js.native
  def get_name(): java.lang.String = js.native
  def savePolicy(): scala.Unit = js.native
  def set_emailBody(value: java.lang.String): java.lang.String = js.native
  def set_emailBodyWithTeamMailbox(value: java.lang.String): java.lang.String = js.native
  def set_emailSubject(value: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSGlobal("SP.InformationPolicy.ProjectPolicy")
@js.native
object ProjectPolicy extends js.Object {
  def applyProjectPolicy(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    web: sharepointLib.SPNs.Web,
    projectPolicy: sharepointLib.SPNs.InformationPolicyNs.ProjectPolicy
  ): scala.Unit = js.native
  def closeProject(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): scala.Unit = js.native
  def doesProjectHavePolicy(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.BooleanResult = js.native
  def getCurrentlyAppliedProject(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.InformationPolicyNs.ProjectPolicy = js.native
  def getProjectCloseDate(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.DateTimeResult = js.native
  def getProjectExpirationDate(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.DateTimeResult = js.native
  def getProjectPolicies(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.InformationPolicyNs.ProjectPolicy] = js.native
  def isProjectClosed(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.BooleanResult = js.native
  def openProject(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): scala.Unit = js.native
  def postponeProject(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): scala.Unit = js.native
}

