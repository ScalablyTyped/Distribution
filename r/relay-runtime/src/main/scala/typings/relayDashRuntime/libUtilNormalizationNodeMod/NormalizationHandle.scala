package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle extends NormalizationSelection

object NormalizationHandle {
  @scala.inline
  def NormalizationScalarHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[String] = null
  ): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
  @scala.inline
  def NormalizationLinkedHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[String] = null
  ): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
}

