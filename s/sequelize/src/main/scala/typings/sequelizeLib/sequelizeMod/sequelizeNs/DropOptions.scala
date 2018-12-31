package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Model
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/model.js
//
/**
  * Options to pass to Model on drop
  */
trait DropOptions extends LoggingOptions {
  /**
    * Also drop all objects depending on this table, such as views. Only works in postgres
    */
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
}

