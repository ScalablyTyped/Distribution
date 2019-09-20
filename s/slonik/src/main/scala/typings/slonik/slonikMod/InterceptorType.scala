package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Unit]
    ]
  ] = js.undefined
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[QueryResultType[QueryResultRowType[String]]]
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
      MaybePromiseType[Unit]
    ]
  ] = js.undefined
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[js.UndefOr[QueryResultType[QueryResultRowType[String]]]]
    ]
  ] = js.undefined
  var queryExecutionError: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* error */ SlonikError, 
      MaybePromiseType[Unit]
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
    afterPoolConnection: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Unit] = null,
    afterQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[QueryResultType[QueryResultRowType[String]]] = null,
    beforePoolConnection: /* connectionContext */ PoolContextType => MaybePromiseType[js.UndefOr[DatabasePoolType | Null]] = null,
    beforePoolConnectionRelease: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Unit] = null,
    beforeQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[js.UndefOr[QueryResultType[QueryResultRowType[String]]]] = null,
    queryExecutionError: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => MaybePromiseType[Unit] = null,
    transformQuery: (/* queryContext */ QueryContextType, /* query */ QueryType) => QueryType = null,
    transformRow: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => QueryResultRowType[String] = null
  ): InterceptorType = {
    val __obj = js.Dynamic.literal()
    if (afterPoolConnection != null) __obj.updateDynamic("afterPoolConnection")(js.Any.fromFunction2(afterPoolConnection))
    if (afterQueryExecution != null) __obj.updateDynamic("afterQueryExecution")(js.Any.fromFunction3(afterQueryExecution))
    if (beforePoolConnection != null) __obj.updateDynamic("beforePoolConnection")(js.Any.fromFunction1(beforePoolConnection))
    if (beforePoolConnectionRelease != null) __obj.updateDynamic("beforePoolConnectionRelease")(js.Any.fromFunction2(beforePoolConnectionRelease))
    if (beforeQueryExecution != null) __obj.updateDynamic("beforeQueryExecution")(js.Any.fromFunction2(beforeQueryExecution))
    if (queryExecutionError != null) __obj.updateDynamic("queryExecutionError")(js.Any.fromFunction3(queryExecutionError))
    if (transformQuery != null) __obj.updateDynamic("transformQuery")(js.Any.fromFunction2(transformQuery))
    if (transformRow != null) __obj.updateDynamic("transformRow")(js.Any.fromFunction4(transformRow))
    __obj.asInstanceOf[InterceptorType]
  }
}

