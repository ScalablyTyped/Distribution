package typings.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BoundObjectReference is a reference to an object that a token is bound to.
  */
@js.native
trait BoundObjectReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: String = js.native
  /**
    * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
    */
  var kind: String = js.native
  /**
    * Name of the referent.
    */
  var name: String = js.native
  /**
    * UID of the referent.
    */
  var uid: String = js.native
}

object BoundObjectReference {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String, uid: String): BoundObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundObjectReference]
  }
  @scala.inline
  implicit class BoundObjectReferenceOps[Self <: BoundObjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

