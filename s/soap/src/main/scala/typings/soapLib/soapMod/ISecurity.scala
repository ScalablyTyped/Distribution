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
  def apply(addOptions: js.Any => scala.Unit, toXML: () => java.lang.String): ISecurity = {
    val __obj = js.Dynamic.literal(addOptions = js.Any.fromFunction1(addOptions), toXML = js.Any.fromFunction0(toXML))
  
    __obj.asInstanceOf[ISecurity]
  }
}

