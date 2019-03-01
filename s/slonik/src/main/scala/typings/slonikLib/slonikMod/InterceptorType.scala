package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[scala.Unit]
    ]
  ] = js.undefined
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[java.lang.String]], 
      MaybePromiseType[QueryResultType[QueryResultRowType[java.lang.String]]]
    ]
  ] = js.undefined
  var beforePoolConnection: js.UndefOr[
    js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | scala.Null]]
    ]
  ] = js.undefined
  var beforePoolConnectionRelease: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[scala.Unit]
    ]
  ] = js.undefined
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[js.UndefOr[QueryResultType[QueryResultRowType[java.lang.String]]]]
    ]
  ] = js.undefined
  var transformQuery: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryType]
    ]
  ] = js.undefined
}

object InterceptorType {
  @scala.inline
  def apply(
    afterPoolConnection: js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[scala.Unit]
    ] = null,
    afterQueryExecution: js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[java.lang.String]], 
      MaybePromiseType[QueryResultType[QueryResultRowType[java.lang.String]]]
    ] = null,
    beforePoolConnection: js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | scala.Null]]
    ] = null,
    beforePoolConnectionRelease: js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[scala.Unit]
    ] = null,
    beforeQueryExecution: js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[js.UndefOr[QueryResultType[QueryResultRowType[java.lang.String]]]]
    ] = null,
    transformQuery: js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryType]
    ] = null
  ): InterceptorType = {
    val __obj = js.Dynamic.literal()
    if (afterPoolConnection != null) __obj.updateDynamic("afterPoolConnection")(afterPoolConnection)
    if (afterQueryExecution != null) __obj.updateDynamic("afterQueryExecution")(afterQueryExecution)
    if (beforePoolConnection != null) __obj.updateDynamic("beforePoolConnection")(beforePoolConnection)
    if (beforePoolConnectionRelease != null) __obj.updateDynamic("beforePoolConnectionRelease")(beforePoolConnectionRelease)
    if (beforeQueryExecution != null) __obj.updateDynamic("beforeQueryExecution")(beforeQueryExecution)
    if (transformQuery != null) __obj.updateDynamic("transformQuery")(transformQuery)
    __obj.asInstanceOf[InterceptorType]
  }
}

