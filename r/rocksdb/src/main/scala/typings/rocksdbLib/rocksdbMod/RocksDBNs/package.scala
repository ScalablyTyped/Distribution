package typings
package rocksdbLib.rocksdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RocksDBNs {
  type Bytes = java.lang.String | nodeLib.Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* size */ scala.Double, scala.Unit]
  // tslint:disable-next-line:no-empty-interface
  type OpenOptions = abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOpenOptions
}
