package typings.atPulumiAws.typesInputMod.elasticsearch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainSnapshotOptions extends js.Object {
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Input[Double]
}

object DomainSnapshotOptions {
  @scala.inline
  def apply(automatedSnapshotStartHour: Input[Double]): DomainSnapshotOptions = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainSnapshotOptions]
  }
}

