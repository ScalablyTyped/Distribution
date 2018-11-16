package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for Model.build method
     */

trait BuildOptions extends ReturningOptions {
  /**
           * an array of include options - Used to build prefetched/included model instances. See `set`
           *
           * TODO: See set
           */
  var include: js.UndefOr[js.Array[(Model[_, _]) | IncludeOptions]] = js.undefined
  /**
           * Is this record new
           */
  var isNewRecord: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If set to true, values will ignore field and virtual setters.
           */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

