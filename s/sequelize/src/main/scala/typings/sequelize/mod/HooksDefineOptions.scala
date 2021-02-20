package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
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
trait HooksDefineOptions[TInstance] extends StObject {
  
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
  implicit class HooksDefineOptionsMutableBuilder[Self <: HooksDefineOptions[_], TInstance] (val x: Self with HooksDefineOptions[TInstance]) extends AnyVal {
    
    @scala.inline
    def setAfterBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = StObject.set(x, "afterBulkCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterBulkCreateUndefined: Self = StObject.set(x, "afterBulkCreate", js.undefined)
    
    @scala.inline
    def setAfterBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterBulkDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterBulkDeleteUndefined: Self = StObject.set(x, "afterBulkDelete", js.undefined)
    
    @scala.inline
    def setAfterBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterBulkDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterBulkDestroyUndefined: Self = StObject.set(x, "afterBulkDestroy", js.undefined)
    
    @scala.inline
    def setAfterBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterBulkUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterBulkUpdateUndefined: Self = StObject.set(x, "afterBulkUpdate", js.undefined)
    
    @scala.inline
    def setAfterCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = StObject.set(x, "afterCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    @scala.inline
    def setAfterDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterDelete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDeleteUndefined: Self = StObject.set(x, "afterDelete", js.undefined)
    
    @scala.inline
    def setAfterDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterFind(
      value: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = StObject.set(x, "afterFind", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterFindUndefined: Self = StObject.set(x, "afterFind", js.undefined)
    
    @scala.inline
    def setAfterSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterSave", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterSaveUndefined: Self = StObject.set(x, "afterSave", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setAfterValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "afterValidate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
    
    @scala.inline
    def setBeforeBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = StObject.set(x, "beforeBulkCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeBulkCreateUndefined: Self = StObject.set(x, "beforeBulkCreate", js.undefined)
    
    @scala.inline
    def setBeforeBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeBulkDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeBulkDeleteUndefined: Self = StObject.set(x, "beforeBulkDelete", js.undefined)
    
    @scala.inline
    def setBeforeBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeBulkDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeBulkDestroyUndefined: Self = StObject.set(x, "beforeBulkDestroy", js.undefined)
    
    @scala.inline
    def setBeforeBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeBulkUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeBulkUpdateUndefined: Self = StObject.set(x, "beforeBulkUpdate", js.undefined)
    
    @scala.inline
    def setBeforeCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeDelete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDeleteUndefined: Self = StObject.set(x, "beforeDelete", js.undefined)
    
    @scala.inline
    def setBeforeDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeFind(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeFind", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeFindAfterExpandIncludeAll(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeFindAfterExpandIncludeAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeFindAfterExpandIncludeAllUndefined: Self = StObject.set(x, "beforeFindAfterExpandIncludeAll", js.undefined)
    
    @scala.inline
    def setBeforeFindAfterOptions(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeFindAfterOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeFindAfterOptionsUndefined: Self = StObject.set(x, "beforeFindAfterOptions", js.undefined)
    
    @scala.inline
    def setBeforeFindUndefined: Self = StObject.set(x, "beforeFind", js.undefined)
    
    @scala.inline
    def setBeforeSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeSave", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
  }
}
