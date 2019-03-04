package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Support extends js.Object {
  var export: SupportItem
  var exportData: SupportItem
  var snapshot: SupportItem | SnapshotLegacy
}

object Support {
  @scala.inline
  def apply(export: SupportItem, exportData: SupportItem, snapshot: SupportItem | SnapshotLegacy): Support = {
    val __obj = js.Dynamic.literal(export = export.asInstanceOf[js.Any], exportData = exportData.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Support]
  }
}

