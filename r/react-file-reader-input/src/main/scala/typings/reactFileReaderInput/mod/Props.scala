package typings.reactFileReaderInput.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * what format the `FileReader` should read the file as
    * (i.e., `'buffer'`, `'binary'`, `'url'`, `'text'`).
    *
    * Defaults to `'url'`.
    */
  var as: js.UndefOr[Format] = js.undefined
  /**
    * Callback function called when the files are choosen by the user.
    *
    * Results will be an array of arrays, the size of which depending
    * on how many files were selected.
    *
    * Each result will be an array of two items:
    *
    * `progressEvent`: `result[0]` is a `ProgressEvent` object.
    * You can retrieve the raw results at `progressEvent.target.result`
    * among other things.
    *
    * `file`: `result[1]` is a `File` object. You can retrieve the file name
    * at file.name among other things.
    *
    * @param event The event that triggered file changes
    * @param results The array of files
    */
  def onChange(event: SyntheticEvent[_, Event_], results: js.Array[Result]): Unit
}

object Props {
  @scala.inline
  def apply(onChange: (SyntheticEvent[_, Event_], js.Array[Result]) => Unit, as: Format = null): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

