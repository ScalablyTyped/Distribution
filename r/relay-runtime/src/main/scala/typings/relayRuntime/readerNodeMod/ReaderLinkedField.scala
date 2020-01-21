package typings.relayRuntime.readerNodeMod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLinkedField]
  }
}

