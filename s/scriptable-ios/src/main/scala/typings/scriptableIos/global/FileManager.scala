package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Read and write files on disk._
  * @see https://docs.scriptable.app/filemanager
  */
@JSGlobal("FileManager")
@js.native
/* private */ open class FileManager ()
  extends StObject
     with typings.scriptableIos.FileManager
object FileManager {
  
  @JSGlobal("FileManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Creates an iCloud FileManager._
    *
    * Creates a file manager for operating with files stored in iCloud. iCloud must be enabled on the device in order to use this.
    * @see https://docs.scriptable.app/filemanager/#icloud
    */
  /* static member */
  inline def iCloud(): typings.scriptableIos.FileManager = ^.asInstanceOf[js.Dynamic].applyDynamic("iCloud")().asInstanceOf[typings.scriptableIos.FileManager]
  
  /**
    * _Creates a local FileManager._
    *
    * Creates a file manager for operating with files stored locally.
    * @see https://docs.scriptable.app/filemanager/#local
    */
  /* static member */
  inline def local(): typings.scriptableIos.FileManager = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[typings.scriptableIos.FileManager]
}
