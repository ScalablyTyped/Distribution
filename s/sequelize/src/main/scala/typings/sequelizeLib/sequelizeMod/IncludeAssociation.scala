package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Association Object for Include Options
  */
trait IncludeAssociation extends js.Object {
  var identifier: java.lang.String
  var source: Model[_, _, _]
  var target: Model[_, _, _]
}

object IncludeAssociation {
  @scala.inline
  def apply(identifier: java.lang.String, source: Model[_, _, _], target: Model[_, _, _]): IncludeAssociation = {
    val __obj = js.Dynamic.literal(identifier = identifier, source = source, target = target)
  
    __obj.asInstanceOf[IncludeAssociation]
  }
}

