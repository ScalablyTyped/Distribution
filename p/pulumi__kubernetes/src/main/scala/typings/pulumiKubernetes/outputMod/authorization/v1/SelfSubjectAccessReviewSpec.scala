package typings.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
  * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SelfSubjectAccessReviewSpec extends js.Object {
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  val nonResourceAttributes: NonResourceAttributes
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  val resourceAttributes: ResourceAttributes
}

object SelfSubjectAccessReviewSpec {
  @scala.inline
  def apply(nonResourceAttributes: NonResourceAttributes, resourceAttributes: ResourceAttributes): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
}

