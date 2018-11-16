package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOutputElement extends HTMLElement {
  var defaultValue: java.lang.String = js.native
  val form: HTMLFormElement | scala.Null = js.native
  val htmlFor: DOMTokenList = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  var name: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  val validationMessage: java.lang.String = js.native
  val validity: ValidityState = js.native
  var value: java.lang.String = js.native
  val willValidate: scala.Boolean = js.native
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
}

@JSGlobal("HTMLOutputElement")
@js.native
object HTMLOutputElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLOutputElement]

