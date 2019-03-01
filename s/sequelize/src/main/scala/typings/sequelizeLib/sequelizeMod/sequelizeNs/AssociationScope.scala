package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Association Scope
  *
  * @see AssociationOptionsManyToMany
  */
trait AssociationScope
  extends /**
  * The name of the column that will be used for the associated scope and it's value
  */
/* scopeName */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AssociationScope {
  @scala.inline
  def apply(
    StringDictionary: /**
    * The name of the column that will be used for the associated scope and it's value
    */
  /* scopeName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AssociationScope = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AssociationScope]
  }
}

