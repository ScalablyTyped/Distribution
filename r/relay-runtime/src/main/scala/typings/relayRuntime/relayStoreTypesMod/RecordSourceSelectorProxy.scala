package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayConnectionMod.ConnectionID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordSourceSelectorProxy[T] extends RecordSourceProxy {
  def getPluralRootField(fieldName: String): (js.Array[RecordProxy[T] | Null]) | Null = js.native
  def getRootField(fieldName: String): RecordProxy[js.Object] | Null = js.native
  def getRootField[K /* <: String */](fieldName: K): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  def insertConnectionEdge_UNSTABLE(connectionID: ConnectionID, args: Variables, edge: RecordProxy[js.Object]): Unit = js.native
}

