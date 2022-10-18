package typings.reduxOrm

import typings.reduxOrm.dbDatabaseMod.Database
import typings.reduxOrm.dbDatabaseMod.QueryResult
import typings.reduxOrm.dbDatabaseMod.QuerySpec
import typings.reduxOrm.dbDatabaseMod.UpdateSpec
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("redux-orm/Session", JSImport.Default)
  @js.native
  open class default[I /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] protected ()
    extends StObject
       with Session[I] {
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
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
          ],
      state: OrmState[I]
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
          ],
      state: OrmState[I],
      withMutations: Boolean
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
          ],
      state: OrmState[I],
      withMutations: Boolean,
      batchToken: BatchToken
    ) = this()
    def this(
      schema: ORM[I, /* keyof I */ String],
      db: Database[
            I, 
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
          ],
      state: OrmState[I],
      withMutations: Unit,
      batchToken: BatchToken
    ) = this()
    
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
    /* CompleteClass */
    override def applyUpdate[P](update: UpdateSpec[P]): P = js.native
    
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
    /* CompleteClass */
    override def query(query: QuerySpec): QueryResult[js.Object] = js.native
    
    /**
      * list of bound {@link Model} classes bound to this session, bootstrapped during {@link @ORM.register}.
      *
      * @see {@link ModelType}
      */
    /* CompleteClass */
    override val sessionBoundModels: js.Array[
        ModelType[
          InstanceType[
            /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
          ]
        ]
      ] = js.native
    
    /**
      * Current {@link OrmState}, specific to registered schema
      */
    /* CompleteClass */
    override val state: OrmState[I] = js.native
  }
  
  type BatchToken = Any
  
  type OrmSession[I /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = Assign[
    Session[I], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>} */ js.Any, 
    (Diff[
      Session[I], 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>} */ js.Any
    ]) & (Intersection[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>} */ js.Any, 
      Session[I]
    ]) & (Diff[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>} */ js.Any, 
      Session[I]
    ])
  ]
  
  trait Session[I /* <: IndexedModelClasses[
    Any, 
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
    def applyUpdate[P](update: UpdateSpec[P]): P
    
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
    def query(query: QuerySpec): QueryResult[js.Object]
    
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
      ]
    
    /**
      * Current {@link OrmState}, specific to registered schema
      */
    val state: OrmState[I]
  }
  object Session {
    
    inline def apply[I /* <: IndexedModelClasses[
        Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](
      applyUpdate: UpdateSpec[Any] => Any,
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
    
    extension [Self <: Session[?], I /* <: IndexedModelClasses[
        Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](x: Self & Session[I]) {
      
      inline def setApplyUpdate(value: UpdateSpec[Any] => Any): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction1(value))
      
      inline def setQuery(value: QuerySpec => QueryResult[js.Object]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setSessionBoundModels(
        value: js.Array[
              ModelType[
                InstanceType[
                  /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "sessionBoundModels", value.asInstanceOf[js.Any])
      
      inline def setSessionBoundModelsVarargs(
        value: (ModelType[
              InstanceType[
                /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
              ]
            ])*
      ): Self = StObject.set(x, "sessionBoundModels", js.Array(value*))
      
      inline def setState(value: OrmState[I]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
