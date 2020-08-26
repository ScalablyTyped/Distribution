package typings.pulumiAws.getLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionArgs extends js.Object {
  /**
    * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
    */
  val compatibleRuntime: js.UndefOr[String] = js.native
  /**
    * Name of the lambda layer.
    */
  val layerName: String = js.native
  /**
    * Specific layer version. Conflicts with `compatibleRuntime`. If omitted, the latest available layer version will be used.
    */
  val version: js.UndefOr[Double] = js.native
}

object GetLayerVersionArgs {
  @scala.inline
  def apply(layerName: String): GetLayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionArgs]
  }
  @scala.inline
  implicit class GetLayerVersionArgsOps[Self <: GetLayerVersionArgs] (val x: Self) extends AnyVal {
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
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompatibleRuntime(value: String): Self = this.set("compatibleRuntime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleRuntime: Self = this.set("compatibleRuntime", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

