package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileChooser extends StObject {
  
  /**
    * Accept the file chooser request with given paths.
    * If some of the filePaths are relative paths, then they are resolved relative to the current working directory.
    */
  def accept(filePaths: js.Array[String]): js.Promise[Unit]
  
  /** Closes the file chooser without selecting any files. */
  def cancel(): js.Promise[Unit]
  
  /** Whether file chooser allow for multiple file selection. */
  def isMultiple(): Boolean
}
object FileChooser {
  
  inline def apply(
    accept: js.Array[String] => js.Promise[Unit],
    cancel: () => js.Promise[Unit],
    isMultiple: () => Boolean
  ): FileChooser = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), cancel = js.Any.fromFunction0(cancel), isMultiple = js.Any.fromFunction0(isMultiple))
    __obj.asInstanceOf[FileChooser]
  }
  
  extension [Self <: FileChooser](x: Self) {
    
    inline def setAccept(value: js.Array[String] => js.Promise[Unit]): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setIsMultiple(value: () => Boolean): Self = StObject.set(x, "isMultiple", js.Any.fromFunction0(value))
  }
}
