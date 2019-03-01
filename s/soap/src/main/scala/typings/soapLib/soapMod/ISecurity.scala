package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecurity extends js.Object {
  def addOptions(options: js.Any): scala.Unit
  def toXML(): java.lang.String
}

object ISecurity {
  @scala.inline
  def apply(addOptions: js.Function1[js.Any, scala.Unit], toXML: js.Function0[java.lang.String]): ISecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOptions")(addOptions)
    __obj.updateDynamic("toXML")(toXML)
    __obj.asInstanceOf[ISecurity]
  }
}

