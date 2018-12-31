package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Errors
// ~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/errors.js
//
/**
  * The Base Error all Sequelize Errors inherit from.
  */
@js.native
trait BaseError
  extends nodeLib.Error
     with nodeLib.ErrorConstructor

