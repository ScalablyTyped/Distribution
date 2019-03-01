package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Hooks
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/hooks.js
//
/**
  * Options for Sequelize.define. We mostly duplicate the Hooks here, since there is no way to combine the two
  * interfaces.
  *
  * beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy, beforeBulkUpdate, beforeCreate,
  * beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy, afterSave, afterUpdate, afterBulkCreate,
  * afterBulkDestroy and afterBulkUpdate.
  */
trait HooksDefineOptions[TInstance] extends js.Object {
  var afterBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterFind: js.UndefOr[
    js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var beforeBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var beforeDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeFind: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeFindAfterExpandIncludeAll: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeFindAfterOptions: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
}

object HooksDefineOptions {
  @scala.inline
  def apply[TInstance](
    afterBulkCreate: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ] = null,
    afterBulkDelete: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterBulkDestroy: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterBulkUpdate: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterCreate: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ] = null,
    afterDelete: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterDestroy: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterFind: js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ] = null,
    afterSave: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterUpdate: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    afterValidate: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeBulkCreate: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ] = null,
    beforeBulkDelete: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeBulkDestroy: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeBulkUpdate: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeCreate: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ] = null,
    beforeDelete: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeDestroy: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeFind: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeFindAfterExpandIncludeAll: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeFindAfterOptions: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeSave: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeUpdate: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null,
    beforeValidate: js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _] = null
  ): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    if (afterBulkCreate != null) __obj.updateDynamic("afterBulkCreate")(afterBulkCreate)
    if (afterBulkDelete != null) __obj.updateDynamic("afterBulkDelete")(afterBulkDelete)
    if (afterBulkDestroy != null) __obj.updateDynamic("afterBulkDestroy")(afterBulkDestroy)
    if (afterBulkUpdate != null) __obj.updateDynamic("afterBulkUpdate")(afterBulkUpdate)
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate)
    if (afterDelete != null) __obj.updateDynamic("afterDelete")(afterDelete)
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(afterDestroy)
    if (afterFind != null) __obj.updateDynamic("afterFind")(afterFind)
    if (afterSave != null) __obj.updateDynamic("afterSave")(afterSave)
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate)
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(afterValidate)
    if (beforeBulkCreate != null) __obj.updateDynamic("beforeBulkCreate")(beforeBulkCreate)
    if (beforeBulkDelete != null) __obj.updateDynamic("beforeBulkDelete")(beforeBulkDelete)
    if (beforeBulkDestroy != null) __obj.updateDynamic("beforeBulkDestroy")(beforeBulkDestroy)
    if (beforeBulkUpdate != null) __obj.updateDynamic("beforeBulkUpdate")(beforeBulkUpdate)
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate)
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(beforeDelete)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (beforeFind != null) __obj.updateDynamic("beforeFind")(beforeFind)
    if (beforeFindAfterExpandIncludeAll != null) __obj.updateDynamic("beforeFindAfterExpandIncludeAll")(beforeFindAfterExpandIncludeAll)
    if (beforeFindAfterOptions != null) __obj.updateDynamic("beforeFindAfterOptions")(beforeFindAfterOptions)
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(beforeSave)
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(beforeUpdate)
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(beforeValidate)
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
}

