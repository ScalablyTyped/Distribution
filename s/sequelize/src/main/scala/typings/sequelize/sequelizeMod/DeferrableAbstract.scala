package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Deferrable
// ~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/deferrable.js
//
/**
  * Abstract Deferrable interface. Use this if you want to create an interface that has a value any of the
  * Deferrables that Sequelize supports.
  */
trait DeferrableAbstract extends js.Object {
  def toSql(): String
}

object DeferrableAbstract {
  @scala.inline
  def apply(toSql: () => String): DeferrableAbstract = {
    val __obj = js.Dynamic.literal(toSql = js.Any.fromFunction0(toSql))
  
    __obj.asInstanceOf[DeferrableAbstract]
  }
}

