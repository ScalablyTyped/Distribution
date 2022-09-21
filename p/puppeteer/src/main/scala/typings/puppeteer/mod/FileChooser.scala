package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "FileChooser")
@js.native
open class FileChooser () extends StObject {
  
  /**
    * Accept the file chooser request with given paths.
    *
    * @param filePaths - If some of the `filePaths` are relative paths, then
    * they are resolved relative to the
    * {@link https://nodejs.org/api/process.html#process_process_cwd | current working directory}.
    */
  def accept(filePaths: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * Closes the file chooser without selecting any files.
    */
  def cancel(): Unit = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Whether file chooser allow for
    * {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#attr-multiple | multiple}
    * file selection.
    */
  def isMultiple(): Boolean = js.native
  
  /* private */ var `private`: Any = js.native
}
