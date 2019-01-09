package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.create method
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sequelizeLib.sequelizeMod.sequelizeNs.BuildOptions because var conflicts: returning. Inlined raw, isNewRecord, include */ trait CreateOptions extends InstanceSaveOptions {
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
    * On Duplicate
    */
  var onDuplicate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

