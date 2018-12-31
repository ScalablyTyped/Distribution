package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The default text in the TextInput.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the TextInput can be used.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether multiple lines can be inputted into the TextInput.
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the TextInput text is changed. The new text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Whether the TextInput can be written to by the user.
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether characters are hidden in the TextInput. Commonly used for passwords.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the TextInput can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

