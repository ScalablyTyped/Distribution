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
import scala.scalajs.js.annotation._

trait Session[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
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
}

