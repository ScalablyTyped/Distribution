package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait HooksDefineOptions[TInstance] extends js.Object {
  
  var afterBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  
  var afterBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var afterBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var afterBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var afterCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  
  var afterDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var afterDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var afterFind: js.UndefOr[
    js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  
  var afterSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var afterUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var afterValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var beforeBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  
  var beforeBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  
  var beforeDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var beforeDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var beforeFind: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeFindAfterExpandIncludeAll: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeFindAfterOptions: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  
  var beforeSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var beforeUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  
  var beforeValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
}
object HooksDefineOptions {
  
  @scala.inline
  def apply[TInstance](): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
  
  @scala.inline
  implicit class HooksDefineOptionsOps[Self <: HooksDefineOptions[_], TInstance] (val x: Self with HooksDefineOptions[TInstance]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = this.set("afterBulkCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterBulkCreate: Self = this.set("afterBulkCreate", js.undefined)
    
    @scala.inline
    def setAfterBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterBulkDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterBulkDelete: Self = this.set("afterBulkDelete", js.undefined)
    
    @scala.inline
    def setAfterBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterBulkDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterBulkDestroy: Self = this.set("afterBulkDestroy", js.undefined)
    
    @scala.inline
    def setAfterBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterBulkUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterBulkUpdate: Self = this.set("afterBulkUpdate", js.undefined)
    
    @scala.inline
    def setAfterCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = this.set("afterCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
    
    @scala.inline
    def setAfterDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterDelete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterDelete: Self = this.set("afterDelete", js.undefined)
    
    @scala.inline
    def setAfterDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterDestroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterFind(
      value: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = this.set("afterFind", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterFind: Self = this.set("afterFind", js.undefined)
    
    @scala.inline
    def setAfterSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterSave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterSave: Self = this.set("afterSave", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setAfterValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("afterValidate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterValidate: Self = this.set("afterValidate", js.undefined)
    
    @scala.inline
    def setBeforeBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = this.set("beforeBulkCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeBulkCreate: Self = this.set("beforeBulkCreate", js.undefined)
    
    @scala.inline
    def setBeforeBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeBulkDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeBulkDelete: Self = this.set("beforeBulkDelete", js.undefined)
    
    @scala.inline
    def setBeforeBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeBulkDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeBulkDestroy: Self = this.set("beforeBulkDestroy", js.undefined)
    
    @scala.inline
    def setBeforeBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeBulkUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeBulkUpdate: Self = this.set("beforeBulkUpdate", js.undefined)
    
    @scala.inline
    def setBeforeCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = this.set("beforeCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeCreate: Self = this.set("beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeDelete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeDelete: Self = this.set("beforeDelete", js.undefined)
    
    @scala.inline
    def setBeforeDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeDestroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeFind(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeFind", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeFind: Self = this.set("beforeFind", js.undefined)
    
    @scala.inline
    def setBeforeFindAfterExpandIncludeAll(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeFindAfterExpandIncludeAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeFindAfterExpandIncludeAll: Self = this.set("beforeFindAfterExpandIncludeAll", js.undefined)
    
    @scala.inline
    def setBeforeFindAfterOptions(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeFindAfterOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeFindAfterOptions: Self = this.set("beforeFindAfterOptions", js.undefined)
    
    @scala.inline
    def setBeforeSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeSave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeSave: Self = this.set("beforeSave", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = this.set("beforeValidate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
  }
}
