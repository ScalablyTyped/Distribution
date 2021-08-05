package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined defaultSortDirection, isSortable, sortRoot, sorters, initSortable, sort */ trait IMixedCollection
  extends StObject
     with IAbstractMixedCollection {
  
  /** [Property] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index.
    */
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @param where String
    * @param doSort Boolean
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Boolean], Array]
  ] = js.undefined
  
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by.
    */
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sorts this collection by keys
    * @param dir String Sorting direction: 'ASC' or 'DESC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  var sortByKey: js.UndefOr[js.Function2[/* dir */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Property] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: js.UndefOr[IMixedCollection] = js.undefined
}
object IMixedCollection {
  
  inline def apply(): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMixedCollection]
  }
  
  extension [Self <: IMixedCollection](x: Self) {
    
    inline def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setInitSortable(value: () => Unit): Self = StObject.set(x, "initSortable", js.Any.fromFunction0(value))
    
    inline def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setReorder(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    
    inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    inline def setSort(value: (js.UndefOr[js.Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Boolean]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction4(value))
    
    inline def setSortBy(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "sortBy", js.Any.fromFunction1(value))
    
    inline def setSortByKey(value: (/* dir */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "sortByKey", js.Any.fromFunction2(value))
    
    inline def setSortByKeyUndefined: Self = StObject.set(x, "sortByKey", js.undefined)
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    inline def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorters(value: IMixedCollection): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
  }
}
