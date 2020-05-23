package typings.relayRuntime.readerNodeMod

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
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderScalarField]
  }
}

