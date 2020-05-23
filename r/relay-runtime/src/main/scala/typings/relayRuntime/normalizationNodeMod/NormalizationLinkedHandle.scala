package typings.relayRuntime.normalizationNodeMod

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
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    filters: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLinkedHandle]
  }
}

