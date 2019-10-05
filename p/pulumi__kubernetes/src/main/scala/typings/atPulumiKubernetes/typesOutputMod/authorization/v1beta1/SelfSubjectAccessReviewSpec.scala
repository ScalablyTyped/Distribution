package typings.atPulumiKubernetes.typesOutputMod.authorization.v1beta1

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
    val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes, resourceAttributes = resourceAttributes)
  
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
}

