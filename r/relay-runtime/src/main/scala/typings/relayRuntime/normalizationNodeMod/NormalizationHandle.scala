package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationScalarHandle
  - typings.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle extends NormalizationSelection

object NormalizationHandle {
  @scala.inline
  def NormalizationScalarHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    filters: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
  @scala.inline
  def NormalizationLinkedHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    filters: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
}

