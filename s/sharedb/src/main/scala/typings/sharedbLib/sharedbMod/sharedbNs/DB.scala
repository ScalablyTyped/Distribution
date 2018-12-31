package typings
package sharedbLib.sharedbMod.sharedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DB extends js.Object {
  var disableSubscribe: scala.Boolean = js.native
  var projectsSnapshots: scala.Boolean = js.native
  def canPollDoc(): scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def commit(
    collection: java.lang.String,
    id: java.lang.String,
    op: Op,
    snapshot: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getCommittedOpVersion(
    collection: java.lang.String,
    id: java.lang.String,
    snapshot: js.Any,
    op: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getOps(
    collection: java.lang.String,
    id: java.lang.String,
    from: scala.Double,
    to: scala.Double,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getOpsBulk(
    collection: java.lang.String,
    fromMap: js.Any,
    toMap: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getOpsToSnapshot(
    collection: java.lang.String,
    id: java.lang.String,
    from: scala.Double,
    snapshot: scala.Double,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getSnapshot(
    collection: java.lang.String,
    id: java.lang.String,
    fields: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def getSnapshotBulk(
    collection: java.lang.String,
    ids: java.lang.String,
    fields: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def query(
    collection: java.lang.String,
    query: Query,
    fields: js.Any,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def queryPoll(
    collection: java.lang.String,
    query: Query,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def queryPollDoc(
    collection: java.lang.String,
    id: java.lang.String,
    query: Query,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def skipPoll(): scala.Boolean = js.native
}

