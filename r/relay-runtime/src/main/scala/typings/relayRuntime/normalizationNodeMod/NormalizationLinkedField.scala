package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLinkedField extends NormalizationField {
   // 'LinkedField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val concreteType: js.UndefOr[String | Null] = js.undefined
  val kind: String
  val name: String
  val plural: Boolean
  val selections: js.Array[NormalizationSelection]
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object NormalizationLinkedField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection],
    alias: js.UndefOr[Null | String] = js.undefined,
    concreteType: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(concreteType)) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLinkedField]
  }
}

