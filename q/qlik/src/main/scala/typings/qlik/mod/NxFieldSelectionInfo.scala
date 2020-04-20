package typings.qlik.mod

import typings.qlik.qlikStrings.AND
import typings.qlik.qlikStrings.NORMAL
import typings.qlik.qlikStrings.NOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxFieldSelectionInfo extends js.Object {
  var qFieldSelectionmode: NORMAL | AND | NOT
  var qName: String
}

object NxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionmode: NORMAL | AND | NOT, qName: String): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
}

