package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorSelectionEventArgs extends EventArgs {
  def get_entities(): js.Any
}

object SelectorSelectionEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_entities: () => js.Any): SelectorSelectionEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_entities = js.Any.fromFunction0(get_entities))
    __obj.asInstanceOf[SelectorSelectionEventArgs]
  }
}

