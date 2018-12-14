package typings
package reduxDashFormLib.libFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFields[P]
  extends reactLib.reactMod.Component[BaseFieldsProps[P] with P, js.Object, js.Any] {
  var dirty: scala.Boolean = js.native
  var names: js.Array[java.lang.String] = js.native
  var pristine: scala.Boolean = js.native
  var values: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getRenderedComponent(): reactLib.reactMod.Component[BaseFieldsProps[js.Object] with WrappedFieldsProps with P, js.Object, _] = js.native
}

