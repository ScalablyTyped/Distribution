package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UI {
  /** Callback which processes dialog result value after dialog is closed */
  type DialogReturnValueCallback = js.Function2[
    /* dialogResult */ typings.sharepoint.SP.UI.DialogResult, 
    /* returnValue */ js.Any, 
    scala.Unit
  ]
}
