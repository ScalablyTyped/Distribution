package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoggingOptions extends js.Object {
  /**
           * Print query execution time in milliseconds when logging SQL.
           */
  var benchmark: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * A function that gets executed while running the query to log the sql.
          */
  
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
}

