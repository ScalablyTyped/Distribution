package typings
package signaleLib.signaleMod.signaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaleOptions[TTypes /* <: java.lang.String */] extends js.Object {
  /** Sets the configuration of an instance overriding any existing global or local configuration. */
  var config: js.UndefOr[SignaleConfig] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the scope.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Destination to which the data is written, can be any valid
    * [Writable stream](https://nodejs.org/api/stream.html#stream_writable_streams).
    */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
  var timers: js.UndefOr[stdLib.Map[java.lang.String, stdLib.Date]] = js.undefined
  /**
    * Holds the configuration of the custom and default loggers.
    */
  var types: js.UndefOr[stdLib.Partial[stdLib.Record[TTypes, CommandType]]] = js.undefined
}

