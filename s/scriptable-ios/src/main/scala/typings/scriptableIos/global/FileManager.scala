package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
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
object FileManager {
  
  /**
    * _Creates an iCloud FileManager._
    *
    * Creates a file manager for operating with files stored in iCloud. iCloud must be enabled on the device in order to use this.
    * @see https://docs.scriptable.app/filemanager/#icloud
    */
  /* static member */
  @JSGlobal("FileManager.iCloud")
  @js.native
  def iCloud(): typings.scriptableIos.FileManager = js.native
  
  /**
    * _Creates a local FileManager._
    *
    * Creates a file manager for operating with files stored locally.
    * @see https://docs.scriptable.app/filemanager/#local
    */
  /* static member */
  @JSGlobal("FileManager.local")
  @js.native
  def local(): typings.scriptableIos.FileManager = js.native
}
