package typings.pulumiAws.clusterEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEndpointArgs extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: Input[String] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: Input[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
    */
  val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
    */
  val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ClusterEndpointArgs {
  @scala.inline
  def apply(
    clusterEndpointIdentifier: Input[String],
    clusterIdentifier: Input[String],
    customEndpointType: Input[String]
  ): ClusterEndpointArgs = {
    val __obj = js.Dynamic.literal(clusterEndpointIdentifier = clusterEndpointIdentifier.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], customEndpointType = customEndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointArgs]
  }
  @scala.inline
  implicit class ClusterEndpointArgsOps[Self <: ClusterEndpointArgs] (val x: Self) extends AnyVal {
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
    def setClusterEndpointIdentifier(value: Input[String]): Self = this.set("clusterEndpointIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomEndpointType(value: Input[String]): Self = this.set("customEndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedMembersVarargs(value: Input[String]*): Self = this.set("excludedMembers", js.Array(value :_*))
    @scala.inline
    def setExcludedMembers(value: Input[js.Array[Input[String]]]): Self = this.set("excludedMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedMembers: Self = this.set("excludedMembers", js.undefined)
    @scala.inline
    def setStaticMembersVarargs(value: Input[String]*): Self = this.set("staticMembers", js.Array(value :_*))
    @scala.inline
    def setStaticMembers(value: Input[js.Array[Input[String]]]): Self = this.set("staticMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticMembers: Self = this.set("staticMembers", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

