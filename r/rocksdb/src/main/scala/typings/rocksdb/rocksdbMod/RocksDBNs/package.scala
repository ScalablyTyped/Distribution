package typings.rocksdb.rocksdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RocksDBNs {
  import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOpenOptions
  import typings.node.Buffer
  import typings.std.Error

  type Bytes = String | Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
  // tslint:disable-next-line:no-empty-interface
  type OpenOptions = AbstractOpenOptions
}
