package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainSnapshotOption extends js.Object {
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double
}

object GetDomainSnapshotOption {
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): GetDomainSnapshotOption = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour)
  
    __obj.asInstanceOf[GetDomainSnapshotOption]
  }
}

