package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericField[P]
  extends reactLib.reactMod.Component[
      (BaseFieldProps[BaseFieldProps[P] with P]) with BaseFieldProps[P] with P, 
      js.Object, 
      js.Any
    ] {
  var dirty: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var pristine: scala.Boolean = js.native
  var value: js.Any = js.native
  def getRenderedComponent(): reactLib.reactMod.Component[WrappedFieldProps with P, js.Object, _] = js.native
}

