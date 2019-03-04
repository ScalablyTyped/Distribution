package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * References options for the column's attributes
  *
  * @see AttributeColumnOptions
  */
trait DefineAttributeColumnReferencesOptions extends js.Object {
  /**
    * When to check for the foreign key constraing
    *
    * PostgreSQL only
    */
  var deferrable: js.UndefOr[
    DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
  ] = js.undefined
  /**
    * The column of the foreign table that this column references
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this column references another table, provide it here as a Model, or a string
    */
  var model: java.lang.String | (Model[_, _])
}

object DefineAttributeColumnReferencesOptions {
  @scala.inline
  def apply(
    model: java.lang.String | (Model[_, _]),
    deferrable: DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate = null,
    key: java.lang.String = null
  ): DefineAttributeColumnReferencesOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (deferrable != null) __obj.updateDynamic("deferrable")(deferrable.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DefineAttributeColumnReferencesOptions]
  }
}

