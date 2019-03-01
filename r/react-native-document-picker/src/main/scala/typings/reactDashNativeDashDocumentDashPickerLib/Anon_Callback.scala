package typings
package reactDashNativeDashDocumentDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def show(
    options: reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod.Options,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* result */ reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod.Result, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(
    show: js.Function2[
      reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod.Options, 
      js.Function2[
        /* error */ stdLib.Error, 
        /* result */ reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod.Result, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Callback]
  }
}

