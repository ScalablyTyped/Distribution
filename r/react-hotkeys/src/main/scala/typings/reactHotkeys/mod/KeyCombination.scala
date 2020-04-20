package typings.reactHotkeys.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCombination extends js.Object {
  /**
    * Id of combination that could be used to define a keymap
    */
  var id: MouseTrapKeySequence
  /**
    * Dictionary of keys involved in the combination
    */
  var keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination with TopLevel[js.Any]
}

object KeyCombination {
  @scala.inline
  def apply(
    id: MouseTrapKeySequence,
    keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination with TopLevel[js.Any]
  ): KeyCombination = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCombination]
  }
}

