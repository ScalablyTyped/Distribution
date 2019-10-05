package typings.atPulumiKubernetes.typesOutputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BoundObjectReference is a reference to an object that a token is bound to.
  */
trait BoundObjectReference extends js.Object {
  /**
    * API version of the referent.
    */
  val apiVersion: String
  /**
    * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
    */
  val kind: String
  /**
    * Name of the referent.
    */
  val name: String
  /**
    * UID of the referent.
    */
  val uid: String
}

object BoundObjectReference {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String, uid: String): BoundObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, name = name, uid = uid)
  
    __obj.asInstanceOf[BoundObjectReference]
  }
}

