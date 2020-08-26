package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforePoolConnection: js.UndefOr[
    js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ]
  ] = js.native
  var beforePoolConnectionRelease: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ]
  ] = js.native
  var beforeQueryResult: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforeTransformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, MaybePromiseType[Null]]
  ] = js.native
  var queryExecutionError: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* error */ SlonikError, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var transformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, QueryType]
  ] = js.native
  var transformRow: js.UndefOr[
    js.Function4[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* row */ QueryResultRowType[String], 
      /* fields */ js.Array[FieldType], 
      QueryResultRowType[String]
    ]
  ] = js.native
}

object InterceptorType {
  @scala.inline
  def apply(): InterceptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptorType]
  }
  @scala.inline
  implicit class InterceptorTypeOps[Self <: InterceptorType] (val x: Self) extends AnyVal {
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
    def setAfterPoolConnection(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = this.set("afterPoolConnection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterPoolConnection: Self = this.set("afterPoolConnection", js.undefined)
    @scala.inline
    def setAfterQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = this.set("afterQueryExecution", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterQueryExecution: Self = this.set("afterQueryExecution", js.undefined)
    @scala.inline
    def setBeforePoolConnection(
      value: /* connectionContext */ PoolContextType => MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ): Self = this.set("beforePoolConnection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforePoolConnection: Self = this.set("beforePoolConnection", js.undefined)
    @scala.inline
    def setBeforePoolConnectionRelease(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = this.set("beforePoolConnectionRelease", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforePoolConnectionRelease: Self = this.set("beforePoolConnectionRelease", js.undefined)
    @scala.inline
    def setBeforeQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ): Self = this.set("beforeQueryExecution", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeQueryExecution: Self = this.set("beforeQueryExecution", js.undefined)
    @scala.inline
    def setBeforeQueryResult(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = this.set("beforeQueryResult", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeQueryResult: Self = this.set("beforeQueryResult", js.undefined)
    @scala.inline
    def setBeforeTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[Null]): Self = this.set("beforeTransformQuery", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeTransformQuery: Self = this.set("beforeTransformQuery", js.undefined)
    @scala.inline
    def setQueryExecutionError(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => MaybePromiseType[Null]
    ): Self = this.set("queryExecutionError", js.Any.fromFunction3(value))
    @scala.inline
    def deleteQueryExecutionError: Self = this.set("queryExecutionError", js.undefined)
    @scala.inline
    def setTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => QueryType): Self = this.set("transformQuery", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransformQuery: Self = this.set("transformQuery", js.undefined)
    @scala.inline
    def setTransformRow(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => QueryResultRowType[String]
    ): Self = this.set("transformRow", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTransformRow: Self = this.set("transformRow", js.undefined)
  }
  
}

