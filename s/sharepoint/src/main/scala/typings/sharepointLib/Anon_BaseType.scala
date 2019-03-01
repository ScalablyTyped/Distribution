package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseType extends js.Object {
  var BaseType: scala.Double
  var DefaultItemOpen: scala.Double
  var Direction: java.lang.String
  var EnableVesioning: scala.Boolean
  var Id: java.lang.String
}

object Anon_BaseType {
  @scala.inline
  def apply(
    BaseType: scala.Double,
    DefaultItemOpen: scala.Double,
    Direction: java.lang.String,
    EnableVesioning: scala.Boolean,
    Id: java.lang.String
  ): Anon_BaseType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BaseType")(BaseType)
    __obj.updateDynamic("DefaultItemOpen")(DefaultItemOpen)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("EnableVesioning")(EnableVesioning)
    __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[Anon_BaseType]
  }
}

