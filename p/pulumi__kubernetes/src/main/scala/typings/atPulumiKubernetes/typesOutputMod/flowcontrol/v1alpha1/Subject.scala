package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subject matches the originator of a request, as identified by the request authentication
  * system. There are three ways of matching an originator; by user, group, or service account.
  */
trait Subject extends js.Object {
  val group: GroupSubject
  /**
    * Required
    */
  val kind: String
  val serviceAccount: ServiceAccountSubject
  val user: UserSubject
}

object Subject {
  @scala.inline
  def apply(group: GroupSubject, kind: String, serviceAccount: ServiceAccountSubject, user: UserSubject): Subject = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Subject]
  }
}

