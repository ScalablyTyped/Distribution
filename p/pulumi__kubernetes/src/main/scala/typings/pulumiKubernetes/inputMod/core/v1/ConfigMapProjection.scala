package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a ConfigMap into a projected volume.
  *
  * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
  */
@js.native
trait ConfigMapProjection extends js.Object {
  /**
    * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.UndefOr[Input[js.Array[Input[KeyToPath]]]] = js.native
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * Specify whether the ConfigMap or its keys must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.native
}

object ConfigMapProjection {
  @scala.inline
  def apply(): ConfigMapProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigMapProjection]
  }
  @scala.inline
  implicit class ConfigMapProjectionOps[Self <: ConfigMapProjection] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Input[KeyToPath]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[js.Array[Input[KeyToPath]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptional(value: Input[Boolean]): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
  
}

