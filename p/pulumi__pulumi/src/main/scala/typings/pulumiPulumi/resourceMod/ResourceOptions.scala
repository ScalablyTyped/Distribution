package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceOptions extends js.Object {
  
  /**
    * An optional list of aliases to treat this resource as matching.
    */
  var aliases: js.UndefOr[js.Array[Input[URN | Alias]]] = js.native
  
  /**
    * An optional customTimeouts configuration block.
    */
  var customTimeouts: js.UndefOr[CustomTimeouts] = js.native
  
  /**
    * An optional additional explicit dependencies on other resources.
    */
  var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]] | Resource]] = js.native
  
  /**
    * An optional existing ID to load, rather than create.
    */
  var id: js.UndefOr[Input[ID]] = js.native
  
  /**
    * Ignore changes to any of the specified properties.
    */
  var ignoreChanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional parent resource to which this resource belongs.
    */
  var parent: js.UndefOr[Resource] = js.native
  
  /**
    * When set to true, protect ensures this resource cannot be deleted.
    */
  var protect: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
    * the default provider for the resource's package will be used. The default provider is pulled
    * from the parent's provider bag (see also ComponentResourceOptions.providers).
    *
    * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
    */
  var provider: js.UndefOr[ProviderResource] = js.native
  
  /**
    * Optional list of transformations to apply to this resource during construction. The
    * transformations are applied in order, and are applied prior to transformation applied to
    * parents walking from the resource up to the stack.
    */
  var transformations: js.UndefOr[js.Array[ResourceTransformation]] = js.native
  
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when operating on
    * this resource. This version overrides the version information inferred from the current package and should
    * rarely be used.
    */
  var version: js.UndefOr[String] = js.native
}
object ResourceOptions {
  
  @scala.inline
  def apply(): ResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceOptions]
  }
  
  @scala.inline
  implicit class ResourceOptionsOps[Self <: ResourceOptions] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: (Input[URN | Alias])*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[Input[URN | Alias]]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setCustomTimeouts(value: CustomTimeouts): Self = this.set("customTimeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTimeouts: Self = this.set("customTimeouts", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: Input[Resource]*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: Input[js.Array[Input[Resource]] | Resource]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setId(value: Input[ID]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreChangesVarargs(value: String*): Self = this.set("ignoreChanges", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreChanges(value: js.Array[String]): Self = this.set("ignoreChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreChanges: Self = this.set("ignoreChanges", js.undefined)
    
    @scala.inline
    def setParent(value: Resource): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProtect(value: Boolean): Self = this.set("protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtect: Self = this.set("protect", js.undefined)
    
    @scala.inline
    def setProvider(value: ProviderResource): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setTransformationsVarargs(value: ResourceTransformation*): Self = this.set("transformations", js.Array(value :_*))
    
    @scala.inline
    def setTransformations(value: js.Array[ResourceTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
