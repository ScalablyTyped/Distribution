package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientListMetadata extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var total_accepted_recipients: scala.Double
  var total_rejected_recipients: scala.Double
}

object RecipientListMetadata {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    total_accepted_recipients: scala.Double,
    total_rejected_recipients: scala.Double
  ): RecipientListMetadata = {
    val __obj = js.Dynamic.literal(id = id, name = name, total_accepted_recipients = total_accepted_recipients, total_rejected_recipients = total_rejected_recipients)
  
    __obj.asInstanceOf[RecipientListMetadata]
  }
}

