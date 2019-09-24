package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderScalarField extends ReaderField {
   // 'ScalarField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  val kind: String
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object ReaderScalarField {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[ReaderScalarField]
  }
}

