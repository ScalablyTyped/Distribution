package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var qHyperCube: HyperCube
  var qInfo: NxInfo
  var qSelectionInfo: Selectionobject
}

object Layout {
  @scala.inline
  def apply(qHyperCube: HyperCube, qInfo: NxInfo, qSelectionInfo: Selectionobject): Layout = {
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Layout]
  }
}

