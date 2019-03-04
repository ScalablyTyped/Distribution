package typings
package qlikLib.qlikMod

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
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube, qInfo = qInfo, qSelectionInfo = qSelectionInfo)
  
    __obj.asInstanceOf[Layout]
  }
}

