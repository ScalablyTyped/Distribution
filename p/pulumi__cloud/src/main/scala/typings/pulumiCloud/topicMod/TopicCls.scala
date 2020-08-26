package typings.pulumiCloud.topicMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/topic", "Topic")
@js.native
class TopicCls[T] protected () extends Topic[T] {
  /**
    * Allocate a new Topic with a given name.
    *
    * @param name The unique name of the Topic.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
}

