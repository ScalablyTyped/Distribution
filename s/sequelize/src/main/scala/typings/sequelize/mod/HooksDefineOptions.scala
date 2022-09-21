package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait HooksDefineOptions[TInstance] extends StObject {
  
  var afterBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var afterBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var afterBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var afterCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterDelete: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterDestroy: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterFind: js.UndefOr[
    js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterSave: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterUpdate: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var afterValidate: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeDelete: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeDestroy: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeFind: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeFindAfterExpandIncludeAll: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeFindAfterOptions: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], Any]] = js.undefined
  
  var beforeSave: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeUpdate: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
  
  var beforeValidate: js.UndefOr[
    js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      Any
    ]
  ] = js.undefined
}
object HooksDefineOptions {
  
  inline def apply[TInstance](): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
  
  extension [Self <: HooksDefineOptions[?], TInstance](x: Self & HooksDefineOptions[TInstance]) {
    
    inline def setAfterBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterBulkCreate", js.Any.fromFunction3(value))
    
    inline def setAfterBulkCreateUndefined: Self = StObject.set(x, "afterBulkCreate", js.undefined)
    
    inline def setAfterBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "afterBulkDelete", js.Any.fromFunction2(value))
    
    inline def setAfterBulkDeleteUndefined: Self = StObject.set(x, "afterBulkDelete", js.undefined)
    
    inline def setAfterBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "afterBulkDestroy", js.Any.fromFunction2(value))
    
    inline def setAfterBulkDestroyUndefined: Self = StObject.set(x, "afterBulkDestroy", js.undefined)
    
    inline def setAfterBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "afterBulkUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterBulkUpdateUndefined: Self = StObject.set(x, "afterBulkUpdate", js.undefined)
    
    inline def setAfterCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterCreate", js.Any.fromFunction3(value))
    
    inline def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    inline def setAfterDelete(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterDelete", js.Any.fromFunction3(value))
    
    inline def setAfterDeleteUndefined: Self = StObject.set(x, "afterDelete", js.undefined)
    
    inline def setAfterDestroy(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction3(value))
    
    inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    inline def setAfterFind(
      value: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterFind", js.Any.fromFunction3(value))
    
    inline def setAfterFindUndefined: Self = StObject.set(x, "afterFind", js.undefined)
    
    inline def setAfterSave(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterSave", js.Any.fromFunction3(value))
    
    inline def setAfterSaveUndefined: Self = StObject.set(x, "afterSave", js.undefined)
    
    inline def setAfterUpdate(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction3(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setAfterValidate(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "afterValidate", js.Any.fromFunction3(value))
    
    inline def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
    
    inline def setBeforeBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeBulkCreate", js.Any.fromFunction3(value))
    
    inline def setBeforeBulkCreateUndefined: Self = StObject.set(x, "beforeBulkCreate", js.undefined)
    
    inline def setBeforeBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeBulkDelete", js.Any.fromFunction2(value))
    
    inline def setBeforeBulkDeleteUndefined: Self = StObject.set(x, "beforeBulkDelete", js.undefined)
    
    inline def setBeforeBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeBulkDestroy", js.Any.fromFunction2(value))
    
    inline def setBeforeBulkDestroyUndefined: Self = StObject.set(x, "beforeBulkDestroy", js.undefined)
    
    inline def setBeforeBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeBulkUpdate", js.Any.fromFunction2(value))
    
    inline def setBeforeBulkUpdateUndefined: Self = StObject.set(x, "beforeBulkUpdate", js.undefined)
    
    inline def setBeforeCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction3(value))
    
    inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    inline def setBeforeDelete(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeDelete", js.Any.fromFunction3(value))
    
    inline def setBeforeDeleteUndefined: Self = StObject.set(x, "beforeDelete", js.undefined)
    
    inline def setBeforeDestroy(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction3(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeFind(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeFind", js.Any.fromFunction2(value))
    
    inline def setBeforeFindAfterExpandIncludeAll(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeFindAfterExpandIncludeAll", js.Any.fromFunction2(value))
    
    inline def setBeforeFindAfterExpandIncludeAllUndefined: Self = StObject.set(x, "beforeFindAfterExpandIncludeAll", js.undefined)
    
    inline def setBeforeFindAfterOptions(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any): Self = StObject.set(x, "beforeFindAfterOptions", js.Any.fromFunction2(value))
    
    inline def setBeforeFindAfterOptionsUndefined: Self = StObject.set(x, "beforeFindAfterOptions", js.undefined)
    
    inline def setBeforeFindUndefined: Self = StObject.set(x, "beforeFind", js.undefined)
    
    inline def setBeforeSave(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeSave", js.Any.fromFunction3(value))
    
    inline def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
    
    inline def setBeforeUpdate(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setBeforeValidate(
      value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => Any
    ): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction3(value))
    
    inline def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
  }
}
