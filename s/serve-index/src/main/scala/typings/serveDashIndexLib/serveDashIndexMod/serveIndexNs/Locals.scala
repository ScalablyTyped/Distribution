package typings
package serveDashIndexLib.serveDashIndexMod.serveIndexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locals extends js.Object {
  var directory: java.lang.String
  var displayIcons: scala.Boolean
  var fileList: js.Array[File]
  var name: java.lang.String
  var path: java.lang.String
  var stat: nodeLib.fsMod.Stats
  var style: java.lang.String
  var viewName: java.lang.String
}

object Locals {
  @scala.inline
  def apply(
    directory: java.lang.String,
    displayIcons: scala.Boolean,
    fileList: js.Array[File],
    name: java.lang.String,
    path: java.lang.String,
    stat: nodeLib.fsMod.Stats,
    style: java.lang.String,
    viewName: java.lang.String
  ): Locals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directory")(directory)
    __obj.updateDynamic("displayIcons")(displayIcons)
    __obj.updateDynamic("fileList")(fileList)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("stat")(stat)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[Locals]
  }
}

