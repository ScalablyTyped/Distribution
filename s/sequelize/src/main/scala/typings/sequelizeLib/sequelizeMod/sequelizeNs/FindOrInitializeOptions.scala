package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for Model.findOrInitialize method
     */

trait FindOrInitializeOptions[TAttributes]
  extends FindOptions[js.Any] {
  /**
           * Default values to use if building a new instance
           */
  var defaults: js.UndefOr[TAttributes] = js.undefined
}

