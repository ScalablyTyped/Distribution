package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFieldArray[Field, P]
  extends reactLib.reactMod.Component[
      (BaseFieldArrayProps[BaseFieldArrayProps[P] with stdLib.Partial[P]]) with (stdLib.Partial[BaseFieldArrayProps[P] with stdLib.Partial[P]]), 
      js.Object, 
      js.Any
    ] {
  var name: java.lang.String = js.native
  var valid: scala.Boolean = js.native
  def getRenderedComponent(): reactLib.reactMod.Component[WrappedFieldArrayProps[Field] with P, js.Object, _] = js.native
}

