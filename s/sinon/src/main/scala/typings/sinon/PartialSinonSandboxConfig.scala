package typings.sinon

import typings.sinon.mod.SinonFakeServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonSandboxConfig> */
trait PartialSinonSandboxConfig extends js.Object {
  var injectInto: js.UndefOr[js.Object] = js.undefined
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.undefined
  var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.undefined
}

object PartialSinonSandboxConfig {
  @scala.inline
  def apply(
    injectInto: js.Object = null,
    properties: js.Array[String] = null,
    useFakeServer: Boolean | SinonFakeServer = null,
    useFakeTimers: Boolean | PartialSinonFakeTimersCon = null
  ): PartialSinonSandboxConfig = {
    val __obj = js.Dynamic.literal()
    if (injectInto != null) __obj.updateDynamic("injectInto")(injectInto.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (useFakeServer != null) __obj.updateDynamic("useFakeServer")(useFakeServer.asInstanceOf[js.Any])
    if (useFakeTimers != null) __obj.updateDynamic("useFakeTimers")(useFakeTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSinonSandboxConfig]
  }
}

