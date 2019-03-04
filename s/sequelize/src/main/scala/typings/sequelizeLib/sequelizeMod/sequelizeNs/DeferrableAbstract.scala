package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  def toSql(): java.lang.String
}

object DeferrableAbstract {
  @scala.inline
  def apply(toSql: js.Function0[java.lang.String], toString: js.Function0[java.lang.String]): DeferrableAbstract = {
    val __obj = js.Dynamic.literal(toSql = toSql, toString = toString)
  
    __obj.asInstanceOf[DeferrableAbstract]
  }
}

