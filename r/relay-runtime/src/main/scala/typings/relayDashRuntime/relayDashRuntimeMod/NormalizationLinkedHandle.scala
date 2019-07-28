package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLinkedHandle extends NormalizationHandle {
   // 'LinkedHandle';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  val filters: js.UndefOr[js.Array[String] | Null] = js.undefined
  val handle: String
  val key: String
  val kind: String
  val name: String
}

object NormalizationLinkedHandle {
  @scala.inline
  def apply(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[String] = null
  ): NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle, key = key, kind = kind, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[NormalizationLinkedHandle]
  }
}

