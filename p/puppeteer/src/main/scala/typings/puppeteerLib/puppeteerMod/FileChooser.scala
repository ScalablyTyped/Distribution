package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChooser extends js.Object {
  /**
    * Accept the file chooser request with given paths.
    * If some of the filePaths are relative paths, then they are resolved relative to the current working directory.
    */
  def accept(filePaths: js.Array[java.lang.String]): js.Promise[scala.Unit]
  /** Closes the file chooser without selecting any files. */
  def cancel(): js.Promise[scala.Unit]
  /** Whether file chooser allow for multiple file selection. */
  def isMultiple(): scala.Boolean
}

object FileChooser {
  @scala.inline
  def apply(
    accept: js.Array[java.lang.String] => js.Promise[scala.Unit],
    cancel: () => js.Promise[scala.Unit],
    isMultiple: () => scala.Boolean
  ): FileChooser = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), cancel = js.Any.fromFunction0(cancel), isMultiple = js.Any.fromFunction0(isMultiple))
  
    __obj.asInstanceOf[FileChooser]
  }
}

