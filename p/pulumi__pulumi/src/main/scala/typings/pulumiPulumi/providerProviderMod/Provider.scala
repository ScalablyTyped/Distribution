package typings.pulumiPulumi.providerProviderMod

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import typings.pulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  /**
    * Check validates that the given property bag is valid for a resource of the given type.
    *
    * @param olds The old input properties to use for validation.
    * @param news The new input properties to use for validation.
    */
  var check: js.UndefOr[
    js.Function3[/* urn */ URN, /* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]
  ] = js.native
  
  /**
    * Construct creates a new component resource.
    *
    * @param name The name of the resource to create.
    * @param type The type of the resource to create.
    * @param inputs The inputs to the resource.
    * @param options the options for the resource.
    */
  var construct: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* type */ String, 
      /* inputs */ Inputs, 
      /* options */ ComponentResourceOptions, 
      js.Promise[ConstructResult]
    ]
  ] = js.native
  
  /**
    * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
    * If this call fails, the resource must not have been created (i.e., it is "transactional").
    *
    * @param inputs The properties to set during creation.
    */
  var create: js.UndefOr[js.Function2[/* urn */ URN, /* inputs */ js.Any, js.Promise[CreateResult]]] = js.native
  
  /**
    * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
    *
    * @param id The ID of the resource to delete.
    * @param props The current properties on the resource.
    */
  var delete: js.UndefOr[js.Function3[/* id */ ID, /* urn */ URN, /* props */ js.Any, js.Promise[Unit]]] = js.native
  
  /**
    * Diff checks what impacts a hypothetical update will have on the resource's properties.
    *
    * @param id The ID of the resource to diff.
    * @param olds The old values of properties to diff.
    * @param news The new values of properties to diff.
    */
  var diff: js.UndefOr[
    js.Function4[/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
  ] = js.native
  
  /**
    * Invoke calls the indicated function.
    *
    * @param token The token of the function to call.
    * @param inputs The inputs to the function.
    */
  var invoke: js.UndefOr[js.Function2[/* token */ String, /* inputs */ js.Any, js.Promise[InvokeResult]]] = js.native
  
  /**
    * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
    * identify the resource; this is typically just the resource ID, but it may also include some properties.
    */
  var read: js.UndefOr[
    js.Function3[/* id */ ID, /* urn */ URN, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
  ] = js.native
  
  /**
    * Update updates an existing resource with new values.
    *
    * @param id The ID of the resource to update.
    * @param olds The old values of properties to update.
    * @param news The new values of properties to update.
    */
  var update: js.UndefOr[
    js.Function4[
      /* id */ ID, 
      /* urn */ URN, 
      /* olds */ js.Any, 
      /* news */ js.Any, 
      js.Promise[UpdateResult]
    ]
  ] = js.native
  
  /**
    * The version of the provider. Must be valid semver.
    */
  var version: String = js.native
}
object Provider {
  
  @scala.inline
  def apply(version: String): Provider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: (/* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[CheckResult]): Self = this.set("check", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setConstruct(
      value: (/* name */ String, /* type */ String, /* inputs */ Inputs, /* options */ ComponentResourceOptions) => js.Promise[ConstructResult]
    ): Self = this.set("construct", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteConstruct: Self = this.set("construct", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* urn */ URN, /* inputs */ js.Any) => js.Promise[CreateResult]): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDelete(value: (/* id */ ID, /* urn */ URN, /* props */ js.Any) => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setDiff(
      value: (/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[DiffResult]
    ): Self = this.set("diff", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setInvoke(value: (/* token */ String, /* inputs */ js.Any) => js.Promise[InvokeResult]): Self = this.set("invoke", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInvoke: Self = this.set("invoke", js.undefined)
    
    @scala.inline
    def setRead(value: (/* id */ ID, /* urn */ URN, /* props */ js.UndefOr[js.Any]) => js.Promise[ReadResult]): Self = this.set("read", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[UpdateResult]
    ): Self = this.set("update", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
