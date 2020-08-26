package typings.serveIndex.mod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locals extends js.Object {
  var directory: String = js.native
  var displayIcons: Boolean = js.native
  var fileList: js.Array[File] = js.native
  var name: String = js.native
  var path: String = js.native
  var stat: Stats = js.native
  var style: String = js.native
  var viewName: String = js.native
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
  @scala.inline
  implicit class LocalsOps[Self <: Locals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayIcons(value: Boolean): Self = this.set("displayIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileListVarargs(value: File*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[File]): Self = this.set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStat(value: Stats): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewName(value: String): Self = this.set("viewName", value.asInstanceOf[js.Any])
  }
  
}

