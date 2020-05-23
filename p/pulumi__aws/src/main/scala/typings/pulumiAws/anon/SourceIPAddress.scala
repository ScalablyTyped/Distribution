package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceIPAddress extends js.Object {
  var sourceIPAddress: String = js.native
}

object SourceIPAddress {
  @scala.inline
  def apply(sourceIPAddress: String): SourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIPAddress]
  }
}

