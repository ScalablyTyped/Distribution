package typings.pulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * The cluster identifier of the RDS cluster.
    */
  val clusterIdentifier: String = js.native
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterIdentifier: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
  @scala.inline
  implicit class GetClusterArgsOps[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

