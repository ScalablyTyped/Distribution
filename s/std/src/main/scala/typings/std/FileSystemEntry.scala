package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends StObject {
  
  /* standard dom */
  val filesystem: FileSystem = js.native
  
  /* standard dom */
  val fullPath: java.lang.String = js.native
  
  /* standard dom */
  def getParent(): Unit = js.native
  def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /* standard dom */
  val isDirectory: scala.Boolean = js.native
  
  /* standard dom */
  val isFile: scala.Boolean = js.native
  
  /* standard dom */
  val name: java.lang.String = js.native
}
