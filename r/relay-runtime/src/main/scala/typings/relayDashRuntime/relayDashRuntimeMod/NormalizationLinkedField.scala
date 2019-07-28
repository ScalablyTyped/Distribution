package typings.relayDashRuntime.relayDashRuntimeMod

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
    alias: String = null,
    concreteType: String = null,
    storageKey: String = null
  ): NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, name = name, plural = plural, selections = selections)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationLinkedField]
  }
}

