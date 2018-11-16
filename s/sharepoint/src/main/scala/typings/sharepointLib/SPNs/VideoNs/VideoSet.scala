package typings
package sharepointLib.SPNs.VideoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video.VideoSet")
@js.native
class VideoSet ()
  extends sharepointLib.SPNs.DocumentSetNs.DocumentSet

@JSGlobal("SP.Video.VideoSet")
@js.native
object VideoSet extends js.Object {
  def createVideo(
    context: sharepointLib.SPNs.ClientContext,
    parentFolder: sharepointLib.SPNs.Folder,
    name: java.lang.String,
    ctid: sharepointLib.SPNs.ContentTypeId
  ): sharepointLib.SPNs.StringResult = js.native
  def getEmbedCode(
    context: sharepointLib.SPNs.ClientContext,
    videoPath: java.lang.String,
    properties: sharepointLib.SPNs.VideoNs.EmbedCodeConfiguration
  ): sharepointLib.SPNs.StringResult = js.native
  def migrateVideo[T](context: sharepointLib.SPNs.ClientContext, videoFile: sharepointLib.SPNs.File): sharepointLib.SPNs.ListItem[T] = js.native
  def uploadVideo(
    context: sharepointLib.SPNs.ClientContext,
    list: sharepointLib.SPNs.List[_],
    fileName: java.lang.String,
    file: js.Array[_],
    overwriteIfExists: scala.Boolean,
    parentFolderPath: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
}

