package typings.scriptableIos.FileManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FileManager")
@js.native
object ^ extends js.Object {
  /**
    * _Creates an iCloud FileManager._
    *
    * Creates a file manager for operating with files stored in iCloud. iCloud must be enabled on the device in order to use this.
    * @see https://docs.scriptable.app/filemanager/#icloud
    */
  def iCloud(): typings.scriptableIos.FileManager = js.native
  /**
    * _Creates a local FileManager._
    *
    * Creates a file manager for operating with files stored locally.
    * @see https://docs.scriptable.app/filemanager/#local
    */
  def local(): typings.scriptableIos.FileManager = js.native
}

