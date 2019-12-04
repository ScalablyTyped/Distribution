package typings.rollupDashPluginDashTypescript2

import typings.rollupDashPluginDashTypescript2.distIcacheMod.ICache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/nocache", JSImport.Namespace)
@js.native
object distNocacheMod extends js.Object {
  @js.native
  class NoCache[DataType] () extends ICache[DataType] {
    /* CompleteClass */
    override def exists(name: String): Boolean = js.native
    /* CompleteClass */
    override def `match`(names: js.Array[String]): Boolean = js.native
    /* CompleteClass */
    override def path(name: String): String = js.native
    /* CompleteClass */
    override def read(name: String): js.UndefOr[DataType | Null] = js.native
    /* CompleteClass */
    override def roll(): Unit = js.native
    /* CompleteClass */
    override def touch(name: String): Unit = js.native
    /* CompleteClass */
    override def write(name: String, data: DataType): Unit = js.native
  }
  
}

