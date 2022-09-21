package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemFileEntry
  extends StObject
     with FileSystemEntry {
  
  /* standard dom */
  def file(successCallback: FileCallback): Unit = js.native
  def file(successCallback: FileCallback, errorCallback: ErrorCallback): Unit = js.native
}
