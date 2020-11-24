package typings.reduxOrm.sessionMod

import typings.reduxOrm.databaseMod.QueryResult
import typings.reduxOrm.databaseMod.QuerySpec
import typings.reduxOrm.databaseMod.UpdateSpec
import typings.reduxOrm.modelMod.ModelType
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
  
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
  implicit class SessionOps[Self <: Session[_], I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] (val x: Self with Session[I]) extends AnyVal {
    
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
    def setApplyUpdate(value: UpdateSpec[js.Any] => js.Any): Self = this.set("applyUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuery(value: QuerySpec => QueryResult[js.Object]): Self = this.set("query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionBoundModelsVarargs(
      value: (ModelType[
          InstanceType[
            /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
          ]
        ])*
    ): Self = this.set("sessionBoundModels", js.Array(value :_*))
    
    @scala.inline
    def setSessionBoundModels(
      value: js.Array[
          ModelType[
            InstanceType[
              /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
            ]
          ]
        ]
    ): Self = this.set("sessionBoundModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: OrmState[I]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
