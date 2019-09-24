package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLinkedField extends ReaderField {
   // 'LinkedField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.Array[ReaderArgument]
  val concreteType: js.UndefOr[String | Null] = js.undefined
  val kind: String
  val name: String
  val plural: Boolean
  val selections: js.Array[ReaderSelection]
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object ReaderLinkedField {
  @scala.inline
  def apply(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection],
    alias: String = null,
    concreteType: String = null,
    storageKey: String = null
  ): ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, name = name, plural = plural, selections = selections)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[ReaderLinkedField]
  }
}

