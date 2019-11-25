package typings.signale.signaleMod

import typings.node.processMod._Global_.NodeJS.WriteStream
import typings.std.Date
import typings.std.Map
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaleOptions[TTypes /* <: String */] extends js.Object {
  /** Sets the configuration of an instance overriding any existing global or local configuration. */
  var config: js.UndefOr[SignaleConfig] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the scope.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * Destination to which the data is written, can be any valid
    * [Writable stream](https://nodejs.org/api/stream.html#stream_writable_streams).
    */
  var stream: js.UndefOr[WriteStream] = js.undefined
  var timers: js.UndefOr[Map[String, Date]] = js.undefined
  /**
    * Holds the configuration of the custom and default loggers.
    */
  var types: js.UndefOr[Partial[Record[TTypes, CommandType]]] = js.undefined
}

object SignaleOptions {
  @scala.inline
  def apply[TTypes /* <: String */](
    config: SignaleConfig = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    scope: String = null,
    stream: WriteStream = null,
    timers: Map[String, Date] = null,
    types: Partial[Record[TTypes, CommandType]] = null
  ): SignaleOptions[TTypes] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (timers != null) __obj.updateDynamic("timers")(timers.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaleOptions[TTypes]]
  }
}

