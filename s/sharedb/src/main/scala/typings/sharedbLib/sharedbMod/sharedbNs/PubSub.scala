package typings
package sharedbLib.sharedbMod.sharedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSub extends js.Object {
  var nextStreamId: scala.Double = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
  var streams: org.scalablytyped.runtime.StringDictionary[sharedbLib.sharedbMod.Stream] = js.native
  var streamsCount: scala.Double = js.native
  var subscribed: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /* private */ def _createStream(channel: js.Any): scala.Unit = js.native
  /* protected */ def _emit(channel: java.lang.String, data: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /* protected */ def _publish(
    channels: js.Array[java.lang.String],
    data: js.Any,
    callback: js.Function1[/* err */ Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* private */ def _removeStream(channel: js.Any, stream: js.Any): scala.Unit = js.native
  /* protected */ def _subscribe(channel: java.lang.String, callback: js.Function1[/* err */ Error | scala.Null, scala.Unit]): scala.Unit = js.native
  /* protected */ def _unsubscribe(channel: java.lang.String, callback: js.Function1[/* err */ Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def publish(
    channels: js.Array[java.lang.String],
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function1[/* err */ Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def subscribe(
    channel: java.lang.String,
    callback: js.Function2[
      /* err */ Error | scala.Null, 
      /* stream */ js.UndefOr[sharedbLib.sharedbMod.Stream], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

