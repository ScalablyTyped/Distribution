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

