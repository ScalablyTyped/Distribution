package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTransformationArgs extends js.Object {
  
  /**
    * The name of the Resource.
    */
  var name: String = js.native
  
  /**
    * The original resource options passed to the Resource constructor.
    */
  var opts: ResourceOptions = js.native
  
  /**
    * The original properties passed to the Resource constructor.
    */
  var props: Inputs = js.native
  
  /**
    * The Resource instance that is being transformed.
    */
  var resource: Resource = js.native
  
  /**
    * The type of the Resource.
    */
  var `type`: String = js.native
}
object ResourceTransformationArgs {
  
  @scala.inline
  def apply(name: String, opts: ResourceOptions, props: Inputs, resource: Resource, `type`: String): ResourceTransformationArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTransformationArgs]
  }
  
  @scala.inline
  implicit class ResourceTransformationArgsOps[Self <: ResourceTransformationArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: ResourceOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Inputs): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
