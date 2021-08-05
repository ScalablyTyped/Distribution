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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("redux-orm/db/Database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default & TopLevel[I]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default & TopLevel[I]
  ]]
  
  inline def createDatabase[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase & TopLevel[I]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabase")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase & TopLevel[I]
  ]]
  
  trait Database[I /* <: IndexedModelClasses[
    js.Any, 
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
    def describe[K /* <: /* keyof Tables */ String */](tableName: K): /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any
    
    /**
      * Returns the empty database state.
      *
      * @see {@link OrmState}
      *
      * @return empty state
      */
    def getEmptyState(): OrmState[I]
    
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
    def query(querySpec: QuerySpec, state: OrmState[I]): QueryResult[js.Object]
    
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
    def update(updateSpec: UpdateSpec[js.Any], tx: Transaction, state: OrmState[I]): UpdateResult[I, js.Object]
  }
  object Database {
    
    inline def apply[I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Tables](
      describe: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any,
      getEmptyState: () => OrmState[I],
      query: (QuerySpec, OrmState[I]) => QueryResult[js.Object],
      update: (UpdateSpec[js.Any], Transaction, OrmState[I]) => UpdateResult[I, js.Object]
    ): Database[I, Tables] = {
      val __obj = js.Dynamic.literal(describe = js.Any.fromFunction1(describe), getEmptyState = js.Any.fromFunction0(getEmptyState), query = js.Any.fromFunction2(query), update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[Database[I, Tables]]
    }
    
    extension [Self <: Database[?, ?], I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Tables](x: Self & (Database[I, Tables])) {
      
      inline def setDescribe(
        value: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: Tables[K] */ js.Any
      ): Self = StObject.set(x, "describe", js.Any.fromFunction1(value))
      
      inline def setGetEmptyState(value: () => OrmState[I]): Self = StObject.set(x, "getEmptyState", js.Any.fromFunction0(value))
      
      inline def setQuery(value: (QuerySpec, OrmState[I]) => QueryResult[js.Object]): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: (UpdateSpec[js.Any], Transaction, OrmState[I]) => UpdateResult[I, js.Object]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait DatabaseCreator extends StObject {
    
    def apply[I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.DatabaseCreator & TopLevel[I]
      ] = js.native
  }
  
  trait Query extends StObject {
    
    var clauses: js.Array[QueryClause[js.Object]]
    
    var table: String
  }
  object Query {
    
    inline def apply(clauses: js.Array[QueryClause[js.Object]], table: String): Query = {
      val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setClauses(value: js.Array[QueryClause[js.Object]]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
      
      inline def setClausesVarargs(value: QueryClause[js.Object]*): Self = StObject.set(x, "clauses", js.Array(value :_*))
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryClause[Payload /* <: js.Object */] extends StObject {
    
    var payload: Payload
    
    var `type`: QueryType
  }
  object QueryClause {
    
    inline def apply[Payload /* <: js.Object */](payload: Payload, `type`: QueryType): QueryClause[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryClause[Payload]]
    }
    
    extension [Self <: QueryClause[?], Payload /* <: js.Object */](x: Self & QueryClause[Payload]) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: QueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryResult[Row /* <: Record[String, Serializable] */] extends StObject {
    
    var rows: js.Array[Row]
  }
  object QueryResult {
    
    inline def apply[Row /* <: Record[String, Serializable] */](rows: js.Array[Row]): QueryResult[Row] = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult[Row]]
    }
    
    extension [Self <: QueryResult[?], Row /* <: Record[String, Serializable] */](x: Self & QueryResult[Row]) {
      
      inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  trait QuerySpec extends StObject {
    
    var query: Query
  }
  object QuerySpec {
    
    inline def apply(query: Query): QuerySpec = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerySpec]
    }
    
    extension [Self <: QuerySpec](x: Self) {
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryType = /* "REDUX_ORM_FILTER" */ String
  
  trait SchemaSpec[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] extends StObject {
    
    var tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.SchemaSpec & TopLevel[I]
  }
  object SchemaSpec {
    
    inline def apply[I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](
      tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.SchemaSpec & TopLevel[I]
    ): SchemaSpec[I] = {
      val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaSpec[I]]
    }
    
    extension [Self <: SchemaSpec[?], I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](x: Self & SchemaSpec[I]) {
      
      inline def setTables(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
        */ typings.reduxOrm.reduxOrmStrings.SchemaSpec & TopLevel[I]
      ): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transaction extends StObject {
    
    var batchToken: BatchToken
    
    var withMutations: Boolean
  }
  object Transaction {
    
    inline def apply(batchToken: BatchToken, withMutations: Boolean): Transaction = {
      val __obj = js.Dynamic.literal(batchToken = batchToken.asInstanceOf[js.Any], withMutations = withMutations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setBatchToken(value: BatchToken): Self = StObject.set(x, "batchToken", value.asInstanceOf[js.Any])
      
      inline def setWithMutations(value: Boolean): Self = StObject.set(x, "withMutations", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateResult[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, Payload /* <: js.Object */] extends StObject {
    
    var payload: Payload
    
    var state: OrmState[I]
    
    var status: UpdateStatus
  }
  object UpdateResult {
    
    inline def apply[I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Payload /* <: js.Object */](payload: Payload, state: OrmState[I], status: UpdateStatus): UpdateResult[I, Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateResult[I, Payload]]
    }
    
    extension [Self <: UpdateResult[?, ?], I /* <: IndexedModelClasses[
        js.Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */, Payload /* <: js.Object */](x: Self & (UpdateResult[I, Payload])) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setState(value: OrmState[I]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: UpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateSpec[Payload] extends StObject {
    
    var action: UpdateType
    
    var payload: js.UndefOr[Payload] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
  }
  object UpdateSpec {
    
    inline def apply[Payload](action: UpdateType): UpdateSpec[Payload] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateSpec[Payload]]
    }
    
    extension [Self <: UpdateSpec[?], Payload](x: Self & UpdateSpec[Payload]) {
      
      inline def setAction(value: UpdateType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type UpdateStatus = /* "SUCCESS" */ String
  
  type UpdateType = /* "REDUX_ORM_CREATE" */ String
}
