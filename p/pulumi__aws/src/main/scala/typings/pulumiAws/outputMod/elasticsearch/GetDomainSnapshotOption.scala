package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainSnapshotOption extends js.Object {
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double = js.native
}

object GetDomainSnapshotOption {
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): GetDomainSnapshotOption = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainSnapshotOption]
  }
}

