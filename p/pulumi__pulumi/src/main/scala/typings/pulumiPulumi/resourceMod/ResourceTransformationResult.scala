package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTransformationResult extends js.Object {
  /**
    * The new resource options to use in place of the original `opts`
    */
  var opts: ResourceOptions = js.native
  /**
    * The new properties to use in place of the original `props`
    */
  var props: Inputs = js.native
}

object ResourceTransformationResult {
  @scala.inline
  def apply(opts: ResourceOptions, props: Inputs): ResourceTransformationResult = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTransformationResult]
  }
  @scala.inline
  implicit class ResourceTransformationResultOps[Self <: ResourceTransformationResult] (val x: Self) extends AnyVal {
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
    def setOpts(value: ResourceOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: Inputs): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

