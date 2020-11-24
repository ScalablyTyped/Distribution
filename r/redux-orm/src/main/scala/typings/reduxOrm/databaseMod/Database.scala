package typings.reduxOrm.databaseMod

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, Tables] extends js.Object {
  
  /**
    * Return a {@link Table} structure based on provided table name.
    * @param tableName - the name of the {@link Table} to describe
    *
    * @return a {@link Table} instance matching given `tableName` or `undefined` if no such table exists.
    */
  def describe[K /* <: /* keyof Tables */ String */](tableName: K): /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any = js.native
  
  /**
    * Returns the empty database state.
    *
    * @see {@link OrmState}
    *
    * @return empty state
    */
  def getEmptyState(): OrmState[I] = js.native
  
  /**
    * Execute a query against a given state.
    *
    * @param querySpec - a query definition.
    * @param state - the state to query against.
    *
    * @see {@link QuerySpec}
    * @see {@link OrmState}
    * @see {@link OrmState}
    *
    * @return a {@link QueryResult} containing 0 to many {@link QueryResult.rows}.
    */
  def query(querySpec: QuerySpec, state: OrmState[I]): QueryResult[js.Object] = js.native
  
  /**
    * Apply an update to a given state.
    *
    * @param updateSpec - a data update definition.
    * @param tx - a transaction for batches of operations.
    * @param state - the state to apply update to.
    *
    * @see {@link UpdateSpec}
    * @see {@link Transaction}
    * @see {@link OrmState}
    *
    * @return a {@link UpdateResult} containing 0 to many {@link QueryResult.rows}.
    */
  def update(updateSpec: UpdateSpec[_], tx: Transaction, state: OrmState[I]): UpdateResult[I, js.Object] = js.native
}
object Database {
  
  @scala.inline
  def apply[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, Tables](
    describe: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any,
    getEmptyState: () => OrmState[I],
    query: (QuerySpec, OrmState[I]) => QueryResult[js.Object],
    update: (UpdateSpec[_], Transaction, OrmState[I]) => UpdateResult[I, js.Object]
  ): Database[I, Tables] = {
    val __obj = js.Dynamic.literal(describe = js.Any.fromFunction1(describe), getEmptyState = js.Any.fromFunction0(getEmptyState), query = js.Any.fromFunction2(query), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Database[I, Tables]]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: Database[_, _], I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, Tables] (val x: Self with (Database[I, Tables])) extends AnyVal {
    
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
    def setDescribe(
      value: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any
    ): Self = this.set("describe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEmptyState(value: () => OrmState[I]): Self = this.set("getEmptyState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: (QuerySpec, OrmState[I]) => QueryResult[js.Object]): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (UpdateSpec[_], Transaction, OrmState[I]) => UpdateResult[I, js.Object]): Self = this.set("update", js.Any.fromFunction3(value))
  }
}
