package typings.sequelize.mod

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
    afterBulkCreate: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterBulkDelete: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterBulkDestroy: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterBulkUpdate: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterCreate: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterDelete: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterDestroy: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterFind: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterSave: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterUpdate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    afterValidate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeBulkCreate: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeBulkDelete: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeBulkDestroy: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeBulkUpdate: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeCreate: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeDelete: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeDestroy: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeFind: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeFindAfterExpandIncludeAll: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeFindAfterOptions: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeSave: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeUpdate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null,
    beforeValidate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _ = null
  ): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    if (afterBulkCreate != null) __obj.updateDynamic("afterBulkCreate")(js.Any.fromFunction3(afterBulkCreate))
    if (afterBulkDelete != null) __obj.updateDynamic("afterBulkDelete")(js.Any.fromFunction2(afterBulkDelete))
    if (afterBulkDestroy != null) __obj.updateDynamic("afterBulkDestroy")(js.Any.fromFunction2(afterBulkDestroy))
    if (afterBulkUpdate != null) __obj.updateDynamic("afterBulkUpdate")(js.Any.fromFunction2(afterBulkUpdate))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction3(afterCreate))
    if (afterDelete != null) __obj.updateDynamic("afterDelete")(js.Any.fromFunction3(afterDelete))
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(js.Any.fromFunction3(afterDestroy))
    if (afterFind != null) __obj.updateDynamic("afterFind")(js.Any.fromFunction3(afterFind))
    if (afterSave != null) __obj.updateDynamic("afterSave")(js.Any.fromFunction3(afterSave))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction3(afterUpdate))
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(js.Any.fromFunction3(afterValidate))
    if (beforeBulkCreate != null) __obj.updateDynamic("beforeBulkCreate")(js.Any.fromFunction3(beforeBulkCreate))
    if (beforeBulkDelete != null) __obj.updateDynamic("beforeBulkDelete")(js.Any.fromFunction2(beforeBulkDelete))
    if (beforeBulkDestroy != null) __obj.updateDynamic("beforeBulkDestroy")(js.Any.fromFunction2(beforeBulkDestroy))
    if (beforeBulkUpdate != null) __obj.updateDynamic("beforeBulkUpdate")(js.Any.fromFunction2(beforeBulkUpdate))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(js.Any.fromFunction3(beforeCreate))
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(js.Any.fromFunction3(beforeDelete))
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction3(beforeDestroy))
    if (beforeFind != null) __obj.updateDynamic("beforeFind")(js.Any.fromFunction2(beforeFind))
    if (beforeFindAfterExpandIncludeAll != null) __obj.updateDynamic("beforeFindAfterExpandIncludeAll")(js.Any.fromFunction2(beforeFindAfterExpandIncludeAll))
    if (beforeFindAfterOptions != null) __obj.updateDynamic("beforeFindAfterOptions")(js.Any.fromFunction2(beforeFindAfterOptions))
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction3(beforeSave))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction3(beforeUpdate))
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(js.Any.fromFunction3(beforeValidate))
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
}

