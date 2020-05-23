package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BDelayInit extends js.Object {
  var bDelayInit: Boolean
  var separatorChar: String
  var singleValuePropTypeID: String
}

object BDelayInit {
  @scala.inline
  def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): BDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDelayInit]
  }
}

