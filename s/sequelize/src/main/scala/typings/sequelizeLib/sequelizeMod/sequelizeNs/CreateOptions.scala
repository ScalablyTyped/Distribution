package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for Model.create method
     */
/* RemoveMultipleInheritance: Dropped parents List(sequelizeLib.sequelizeMod.sequelizeNs.BuildOptions because Would inherit conflicting mutable fields List(returning))*/

trait CreateOptions extends InstanceSaveOptions {
  /**
           * On Duplicate
           */
  var onDuplicate: js.UndefOr[java.lang.String] = js.undefined
}

