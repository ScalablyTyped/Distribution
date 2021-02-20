package typings.reduxOrm

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.modelMod.Serializable
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.OrmState
import typings.reduxOrm.sessionMod.BatchToken
import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("redux-orm/db/Database", JSImport.Default)
  @js.native
  def default[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
  ] = js.native
  
  @JSImport("redux-orm/db/Database", "createDatabase")
  @js.native
  def createDatabase[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase with TopLevel[I]
  ] = js.native
  
  @js.native
  trait Database[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, Tables] extends StObject {
    
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
    implicit class DatabaseMutableBuilder[Self <: Database[_, _], I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Tables] (val x: Self with (Database[I, Tables])) extends AnyVal {
      
      @scala.inline
      def setDescribe(
        value: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any
      ): Self = StObject.set(x, "describe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEmptyState(value: () => OrmState[I]): Self = StObject.set(x, "getEmptyState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQuery(value: (QuerySpec, OrmState[I]) => QueryResult[js.Object]): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: (UpdateSpec[_], Transaction, OrmState[I]) => UpdateResult[I, js.Object]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait DatabaseCreator extends StObject {
    
    def apply[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.DatabaseCreator with TopLevel[I]
      ] = js.native
  }
  
  @js.native
  trait Query extends StObject {
    
    var clauses: js.Array[QueryClause[js.Object]] = js.native
    
    var table: String = js.native
  }
  object Query {
    
    @scala.inline
    def apply(clauses: js.Array[QueryClause[js.Object]], table: String): Query = {
      val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClauses(value: js.Array[QueryClause[js.Object]]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClausesVarargs(value: QueryClause[js.Object]*): Self = StObject.set(x, "clauses", js.Array(value :_*))
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryClause[Payload /* <: js.Object */] extends StObject {
    
    var payload: Payload = js.native
    
    var `type`: QueryType = js.native
  }
  object QueryClause {
    
    @scala.inline
    def apply[Payload /* <: js.Object */](payload: Payload, `type`: QueryType): QueryClause[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryClause[Payload]]
    }
    
    @scala.inline
    implicit class QueryClauseMutableBuilder[Self <: QueryClause[_], Payload /* <: js.Object */] (val x: Self with QueryClause[Payload]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: QueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryResult[Row /* <: Record[String, Serializable] */] extends StObject {
    
    var rows: js.Array[Row] = js.native
  }
  object QueryResult {
    
    @scala.inline
    def apply[Row /* <: Record[String, Serializable] */](rows: js.Array[Row]): QueryResult[Row] = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult[Row]]
    }
    
    @scala.inline
    implicit class QueryResultMutableBuilder[Self <: QueryResult[_], Row /* <: Record[String, Serializable] */] (val x: Self with QueryResult[Row]) extends AnyVal {
      
      @scala.inline
      def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QuerySpec extends StObject {
    
    var query: Query = js.native
  }
  object QuerySpec {
    
    @scala.inline
    def apply(query: Query): QuerySpec = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerySpec]
    }
    
    @scala.inline
    implicit class QuerySpecMutableBuilder[Self <: QuerySpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryType = /* "REDUX_ORM_FILTER" */ String
  
  @js.native
  trait SchemaSpec[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] extends StObject {
    
    var tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I] = js.native
  }
  object SchemaSpec {
    
    @scala.inline
    def apply[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](
      tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
    ): SchemaSpec[I] = {
      val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaSpec[I]]
    }
    
    @scala.inline
    implicit class SchemaSpecMutableBuilder[Self <: SchemaSpec[_], I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */] (val x: Self with SchemaSpec[I]) extends AnyVal {
      
      @scala.inline
      def setTables(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
        */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
      ): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transaction extends StObject {
    
    var batchToken: BatchToken = js.native
    
    var withMutations: Boolean = js.native
  }
  object Transaction {
    
    @scala.inline
    def apply(batchToken: BatchToken, withMutations: Boolean): Transaction = {
      val __obj = js.Dynamic.literal(batchToken = batchToken.asInstanceOf[js.Any], withMutations = withMutations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchToken(value: BatchToken): Self = StObject.set(x, "batchToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithMutations(value: Boolean): Self = StObject.set(x, "withMutations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateResult[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, Payload /* <: js.Object */] extends StObject {
    
    var payload: Payload = js.native
    
    var state: OrmState[I] = js.native
    
    var status: UpdateStatus = js.native
  }
  object UpdateResult {
    
    @scala.inline
    def apply[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Payload /* <: js.Object */](payload: Payload, state: OrmState[I], status: UpdateStatus): UpdateResult[I, Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateResult[I, Payload]]
    }
    
    @scala.inline
    implicit class UpdateResultMutableBuilder[Self <: UpdateResult[_, _], I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Payload /* <: js.Object */] (val x: Self with (UpdateResult[I, Payload])) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: OrmState[I]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: UpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateSpec[Payload] extends StObject {
    
    var action: UpdateType = js.native
    
    var payload: js.UndefOr[Payload] = js.native
    
    var query: js.UndefOr[Query] = js.native
  }
  object UpdateSpec {
    
    @scala.inline
    def apply[Payload](action: UpdateType): UpdateSpec[Payload] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateSpec[Payload]]
    }
    
    @scala.inline
    implicit class UpdateSpecMutableBuilder[Self <: UpdateSpec[_], Payload] (val x: Self with UpdateSpec[Payload]) extends AnyVal {
      
      @scala.inline
      def setAction(value: UpdateType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type UpdateStatus = /* "SUCCESS" */ String
  
  type UpdateType = /* "REDUX_ORM_CREATE" */ String
}
