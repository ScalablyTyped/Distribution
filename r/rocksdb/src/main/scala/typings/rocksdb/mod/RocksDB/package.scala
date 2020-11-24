package typings.rocksdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object RocksDB {
  
  type Bytes = java.lang.String | typings.node.Buffer
  
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* size */ scala.Double, scala.Unit]
  
  // tslint:disable-next-line:no-empty-interface
  type OpenOptions = typings.abstractLeveldown.mod.AbstractOpenOptions
}
