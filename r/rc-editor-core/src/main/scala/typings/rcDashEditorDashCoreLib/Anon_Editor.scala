package typings
package rcDashEditorDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Editor
  extends /* str */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var editor: js.UndefOr[js.Any] = js.undefined
}

object Anon_Editor {
  @scala.inline
  def apply(
    StringDictionary: /* str */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    editor: js.Any = null
  ): Anon_Editor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[Anon_Editor]
  }
}

