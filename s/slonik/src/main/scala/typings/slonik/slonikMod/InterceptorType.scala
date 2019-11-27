package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforePoolConnection: js.UndefOr[
    js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ]
  ] = js.undefined
  var beforePoolConnectionRelease: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ]
  ] = js.undefined
  var beforeQueryResult: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforeTransformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, MaybePromiseType[Null]]
  ] = js.undefined
  var queryExecutionError: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* error */ SlonikError, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var transformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, QueryType]
  ] = js.undefined
  var transformRow: js.UndefOr[
    js.Function4[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* row */ QueryResultRowType[String], 
      /* fields */ js.Array[FieldType], 
      QueryResultRowType[String]
    ]
  ] = js.undefined
}

object InterceptorType {
  @scala.inline
  def apply(
    afterPoolConnection: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null] = null,
    afterQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null] = null,
    beforePoolConnection: /* connectionContext */ PoolContextType => MaybePromiseType[js.UndefOr[DatabasePoolType | Null]] = null,
    beforePoolConnectionRelease: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null] = null,
    beforeQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null] = null,
    beforeQueryResult: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null] = null,
    beforeTransformQuery: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[Null] = null,
    queryExecutionError: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => MaybePromiseType[Null] = null,
    transformQuery: (/* queryContext */ QueryContextType, /* query */ QueryType) => QueryType = null,
    transformRow: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => QueryResultRowType[String] = null
  ): InterceptorType = {
    val __obj = js.Dynamic.literal()
    if (afterPoolConnection != null) __obj.updateDynamic("afterPoolConnection")(js.Any.fromFunction2(afterPoolConnection))
    if (afterQueryExecution != null) __obj.updateDynamic("afterQueryExecution")(js.Any.fromFunction3(afterQueryExecution))
    if (beforePoolConnection != null) __obj.updateDynamic("beforePoolConnection")(js.Any.fromFunction1(beforePoolConnection))
    if (beforePoolConnectionRelease != null) __obj.updateDynamic("beforePoolConnectionRelease")(js.Any.fromFunction2(beforePoolConnectionRelease))
    if (beforeQueryExecution != null) __obj.updateDynamic("beforeQueryExecution")(js.Any.fromFunction2(beforeQueryExecution))
    if (beforeQueryResult != null) __obj.updateDynamic("beforeQueryResult")(js.Any.fromFunction3(beforeQueryResult))
    if (beforeTransformQuery != null) __obj.updateDynamic("beforeTransformQuery")(js.Any.fromFunction2(beforeTransformQuery))
    if (queryExecutionError != null) __obj.updateDynamic("queryExecutionError")(js.Any.fromFunction3(queryExecutionError))
    if (transformQuery != null) __obj.updateDynamic("transformQuery")(js.Any.fromFunction2(transformQuery))
    if (transformRow != null) __obj.updateDynamic("transformRow")(js.Any.fromFunction4(transformRow))
    __obj.asInstanceOf[InterceptorType]
  }
}

