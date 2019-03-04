package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxFieldSelectionInfo extends js.Object {
  var qFieldSelectionmode: qlikLib.qlikLibStrings.NORMAL | qlikLib.qlikLibStrings.AND | qlikLib.qlikLibStrings.NOT
  var qName: java.lang.String
}

object NxFieldSelectionInfo {
  @scala.inline
  def apply(
    qFieldSelectionmode: qlikLib.qlikLibStrings.NORMAL | qlikLib.qlikLibStrings.AND | qlikLib.qlikLibStrings.NOT,
    qName: java.lang.String
  ): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName)
  
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
}

