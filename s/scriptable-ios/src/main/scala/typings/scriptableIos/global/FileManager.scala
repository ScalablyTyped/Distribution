package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Read and write files on disk._
  * @see https://docs.scriptable.app/filemanager
  */
@JSGlobal("FileManager")
@js.native
class FileManager protected ()
  extends typings.scriptableIos.FileManager
/* static members */
@JSGlobal("FileManager")
@js.native
object FileManager extends js.Object {
  
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
