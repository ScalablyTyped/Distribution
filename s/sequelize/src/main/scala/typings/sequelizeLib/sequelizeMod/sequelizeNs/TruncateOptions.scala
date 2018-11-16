package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The options passed to Model.destroy in addition to truncate
     */

trait TruncateOptions
  extends LoggingOptions
     with SearchPathOptions {
  /**
           * Only used in conjuction with TRUNCATE. Truncates  all tables that have foreign-key references to the
           * named table, or to any tables added to the group due to CASCADE.
           *
           * Defaults to false;
           */
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Delete instead of setting deletedAt to current timestamp (only applicable if paranoid is enabled)
           *
           * Defaults to false;
           */
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

