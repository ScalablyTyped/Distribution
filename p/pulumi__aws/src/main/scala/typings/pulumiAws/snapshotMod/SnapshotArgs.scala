package typings.pulumiAws.snapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotArgs extends js.Object {
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the snapshot
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: Input[String] = js.native
}

object SnapshotArgs {
  @scala.inline
  def apply(volumeId: Input[String]): SnapshotArgs = {
    val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
  @scala.inline
  implicit class SnapshotArgsOps[Self <: SnapshotArgs] (val x: Self) extends AnyVal {
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
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

