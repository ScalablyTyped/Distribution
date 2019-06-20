package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLinkedField extends NormalizationField {
   // 'LinkedField';
  val alias: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val concreteType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val kind: java.lang.String
  val name: java.lang.String
  val plural: scala.Boolean
  val selections: js.Array[NormalizationSelection]
  val storageKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object NormalizationLinkedField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: java.lang.String,
    name: java.lang.String,
    plural: scala.Boolean,
    selections: js.Array[NormalizationSelection],
    alias: java.lang.String = null,
    concreteType: java.lang.String = null,
    storageKey: java.lang.String = null
  ): NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, name = name, plural = plural, selections = selections)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationLinkedField]
  }
}

