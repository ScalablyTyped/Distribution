package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Association Object for Include Options
  */
trait IncludeAssociation extends js.Object {
  var identifier: java.lang.String
  var source: Model[_, _]
  var target: Model[_, _]
}

object IncludeAssociation {
  @scala.inline
  def apply(identifier: java.lang.String, source: Model[_, _], target: Model[_, _]): IncludeAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IncludeAssociation]
  }
}

