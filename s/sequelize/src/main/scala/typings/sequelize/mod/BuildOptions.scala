package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.build method
  */
trait BuildOptions extends ReturningOptions {
  /**
    * an array of include options - Used to build prefetched/included model instances. See `set`
    *
    * TODO: See set
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  /**
    * Is this record new
    */
  var isNewRecord: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    isNewRecord: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    returning: js.UndefOr[Boolean] = js.undefined
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRecord)) __obj.updateDynamic("isNewRecord")(isNewRecord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
}

