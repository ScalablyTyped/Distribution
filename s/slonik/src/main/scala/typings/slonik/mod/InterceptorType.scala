package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterceptorType extends StObject {
  
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
  
  inline def apply(): InterceptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterceptorType] (val x: Self) extends AnyVal {
    
    inline def setAfterPoolConnection(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = StObject.set(x, "afterPoolConnection", js.Any.fromFunction2(value))
    
    inline def setAfterPoolConnectionUndefined: Self = StObject.set(x, "afterPoolConnection", js.undefined)
    
    inline def setAfterQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = StObject.set(x, "afterQueryExecution", js.Any.fromFunction3(value))
    
    inline def setAfterQueryExecutionUndefined: Self = StObject.set(x, "afterQueryExecution", js.undefined)
    
    inline def setBeforePoolConnection(
      value: /* connectionContext */ PoolContextType => MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ): Self = StObject.set(x, "beforePoolConnection", js.Any.fromFunction1(value))
    
    inline def setBeforePoolConnectionRelease(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = StObject.set(x, "beforePoolConnectionRelease", js.Any.fromFunction2(value))
    
    inline def setBeforePoolConnectionReleaseUndefined: Self = StObject.set(x, "beforePoolConnectionRelease", js.undefined)
    
    inline def setBeforePoolConnectionUndefined: Self = StObject.set(x, "beforePoolConnection", js.undefined)
    
    inline def setBeforeQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ): Self = StObject.set(x, "beforeQueryExecution", js.Any.fromFunction2(value))
    
    inline def setBeforeQueryExecutionUndefined: Self = StObject.set(x, "beforeQueryExecution", js.undefined)
    
    inline def setBeforeQueryResult(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = StObject.set(x, "beforeQueryResult", js.Any.fromFunction3(value))
    
    inline def setBeforeQueryResultUndefined: Self = StObject.set(x, "beforeQueryResult", js.undefined)
    
    inline def setBeforeTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[Null]): Self = StObject.set(x, "beforeTransformQuery", js.Any.fromFunction2(value))
    
    inline def setBeforeTransformQueryUndefined: Self = StObject.set(x, "beforeTransformQuery", js.undefined)
    
    inline def setQueryExecutionError(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => MaybePromiseType[Null]
    ): Self = StObject.set(x, "queryExecutionError", js.Any.fromFunction3(value))
    
    inline def setQueryExecutionErrorUndefined: Self = StObject.set(x, "queryExecutionError", js.undefined)
    
    inline def setTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => QueryType): Self = StObject.set(x, "transformQuery", js.Any.fromFunction2(value))
    
    inline def setTransformQueryUndefined: Self = StObject.set(x, "transformQuery", js.undefined)
    
    inline def setTransformRow(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => QueryResultRowType[String]
    ): Self = StObject.set(x, "transformRow", js.Any.fromFunction4(value))
    
    inline def setTransformRowUndefined: Self = StObject.set(x, "transformRow", js.undefined)
  }
}
