package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainSnapshotOptions extends js.Object {
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double
}

object DomainSnapshotOptions {
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): DomainSnapshotOptions = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour)
  
    __obj.asInstanceOf[DomainSnapshotOptions]
  }
}

