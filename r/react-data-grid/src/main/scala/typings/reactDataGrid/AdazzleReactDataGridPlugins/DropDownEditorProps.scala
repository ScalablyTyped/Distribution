package typings.reactDataGrid.AdazzleReactDataGridPlugins

import typings.reactDataGrid.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownEditorProps extends js.Object {
  var options: js.Array[String | Text]
}

object DropDownEditorProps {
  @scala.inline
  def apply(options: js.Array[String | Text]): DropDownEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownEditorProps]
  }
}

