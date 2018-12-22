package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilePondItem extends js.Object {
  var archived: scala.Boolean
  var file: stdLib.File
  var fileExtension: java.lang.String
  var fileSize: scala.Double
  var fileType: java.lang.String
  var filename: java.lang.String
  var filenameWithoutExtension: java.lang.String
  var id: java.lang.String
  var serverId: java.lang.String
  var status: scala.Double
  def abortLoad(): scala.Unit
  def abortProcessing(): scala.Unit
  def getMetadata(key: js.Any): js.Any
  def setMetadata(key: js.Any, value: js.Any, silent: scala.Boolean): scala.Unit
}

