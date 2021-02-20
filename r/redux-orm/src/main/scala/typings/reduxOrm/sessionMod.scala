package typings.reduxOrm

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.QueryResult
import typings.reduxOrm.databaseMod.QuerySpec
import typings.reduxOrm.databaseMod.UpdateSpec
import typings.reduxOrm.helpersMod.Assign
import typings.reduxOrm.helpersMod.Diff
import typings.reduxOrm.helpersMod.Intersection
import typings.reduxOrm.modelMod.ModelType
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.ORM
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("redux-orm/Session", JSImport.Default)
  @js.native
  class default[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] protected () extends Session[I] {
    /**
      * Creates a new Session.
      *
      * @param schema - {@Link ORM} instance, with bootstrapped {@link Model} prototypes.
      * @param  db - a {@link Database} instance
      * @param  state - the database {@link OrmState}
      * @param  withMutations? - whether the session should mutate data
      * @param  batchToken? - a {@link BatchToken} used by the backend to identify objects that can be
      *                                 mutated. If none is provided a default of `Symbol('ownerId')` will be created.
      *
      */
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
          ],
      state: OrmState[I]
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
          ],
      state: OrmState[I],
      withMutations: Boolean
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
          ],
      state: OrmState[I],
      withMutations: js.UndefOr[scala.Nothing],
      batchToken: BatchToken
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
          ],
      state: OrmState[I],
      withMutations: Boolean,
      batchToken: BatchToken
    ) = this()
  }
  
  type BatchToken = js.Any
  
  type OrmSession[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = Assign[
    Session[I], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with TopLevel[I], 
    (Diff[
      Session[I], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with TopLevel[I]
    ]) with (Intersection[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with TopLevel[I], 
      Session[I]
    ]) with (Diff[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with TopLevel[I], 
      Session[I]
    ])
  ]
  
  @js.native
  trait Session[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] extends StObject {
    
    /**
      * Applies update to a model state.
      *
      * @param  update - the update command object.
      *
      * @returns query result.
      *
      * @see {@link DbAction}
      * @see {@link UpdateSpec}
      * @see {@link DbActionResult}
      * @see {@link UpdateResult}
      */
    def applyUpdate[P](update: UpdateSpec[P]): P = js.native
    
    /**
      * Executes query against model state.
      *
      * @param query - the query command object.
      *
      * @returns query result.
      *
      * @see {@link QueryType}
      * @see {@link QueryClause}
      * @see {@link QuerySpec}
      * @see {@link QueryResult}
      */
    def query(query: QuerySpec): QueryResult[js.Object] = js.native
    
    /**
      * list of bound {@link Model} classes bound to this session, bootstrapped during {@link @ORM.register}.
      *
      * @see {@link ModelType}
      */
    val sessionBoundModels: js.Array[
        ModelType[
          InstanceType[
            /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
          ]
        ]
      ] = js.native
    
    /**
      * Current {@link OrmState}, specific to registered schema
      */
    val state: OrmState[I] = js.native
  }
  object Session {
    
    @scala.inline
    def apply[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](
      applyUpdate: UpdateSpec[js.Any] => js.Any,
      query: QuerySpec => QueryResult[js.Object],
      sessionBoundModels: js.Array[
          ModelType[
            InstanceType[
              /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
            ]
          ]
        ],
      state: OrmState[I]
    ): Session[I] = {
      val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction1(applyUpdate), query = js.Any.fromFunction1(query), sessionBoundModels = sessionBoundModels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session[I]]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session[_], I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */] (val x: Self with Session[I]) extends AnyVal {
      
      @scala.inline
      def setApplyUpdate(value: UpdateSpec[js.Any] => js.Any): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuery(value: QuerySpec => QueryResult[js.Object]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSessionBoundModels(
        value: js.Array[
              ModelType[
                InstanceType[
                  /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "sessionBoundModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionBoundModelsVarargs(
        value: (ModelType[
              InstanceType[
                /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
              ]
            ])*
      ): Self = StObject.set(x, "sessionBoundModels", js.Array(value :_*))
      
      @scala.inline
      def setState(value: OrmState[I]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
