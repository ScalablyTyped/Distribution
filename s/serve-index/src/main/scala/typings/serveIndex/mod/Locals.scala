package typings.serveIndex.mod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locals extends js.Object {
  var directory: String
  var displayIcons: Boolean
  var fileList: js.Array[File]
  var name: String
  var path: String
  var stat: Stats
  var style: String
  var viewName: String
}

object Locals {
  @scala.inline
  def apply(
    directory: String,
    displayIcons: Boolean,
    fileList: js.Array[File],
    name: String,
    path: String,
    stat: Stats,
    style: String,
    viewName: String
  ): Locals = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], displayIcons = displayIcons.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locals]
  }
}

