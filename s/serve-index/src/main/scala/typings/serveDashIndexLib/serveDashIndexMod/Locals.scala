package typings
package serveDashIndexLib.serveDashIndexMod

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
    val __obj = js.Dynamic.literal(directory = directory, displayIcons = displayIcons, fileList = fileList, name = name, path = path, stat = stat, style = style, viewName = viewName)
  
    __obj.asInstanceOf[Locals]
  }
}

