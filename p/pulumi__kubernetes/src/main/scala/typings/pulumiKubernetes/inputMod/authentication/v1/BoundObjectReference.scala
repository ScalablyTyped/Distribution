package typings.pulumiKubernetes.inputMod.authentication.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BoundObjectReference is a reference to an object that a token is bound to.
  */
@js.native
trait BoundObjectReference extends js.Object {
  
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
    */
  var kind: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the referent.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * UID of the referent.
    */
  var uid: js.UndefOr[Input[String]] = js.native
}
object BoundObjectReference {
  
  @scala.inline
  def apply(): BoundObjectReference = {
    val __obj = js.Dynamic.literal()
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
    def setApiVersion(value: Input[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUid(value: Input[String]): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
