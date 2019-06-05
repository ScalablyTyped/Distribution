package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFieldArray[FieldValue, P]
  extends reactLib.reactMod.Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
  var name: java.lang.String = js.native
  var valid: scala.Boolean = js.native
  def getRenderedComponent(): reactLib.reactMod.Component[WrappedFieldArrayProps[FieldValue] with P, js.Object, _] = js.native
}

