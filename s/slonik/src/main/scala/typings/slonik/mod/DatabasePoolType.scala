package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasePoolType
  extends StObject
     with CommonQueryMethodsType {
  
  def connect[T](connectionRoutine: ConnectionRoutineType[T]): js.Promise[T]
  
  def end(): js.Promise[Unit]
  
  def getPoolState(): PoolStateType
  
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}
object DatabasePoolType {
  
  inline def apply(
    any: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]],
    anyFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ],
    connect: ConnectionRoutineType[js.Any] => js.Promise[js.Any],
    end: () => js.Promise[Unit],
    exists: /* args */ QueryMethodParams[js.Any] => js.Promise[Boolean],
    getPoolState: () => PoolStateType,
    many: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]],
    manyFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ],
    maybeOne: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any | Null],
    maybeOneFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ],
    one: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any],
    oneFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    query: /* args */ QueryMethodParams[js.Any] => js.Promise[QueryResultType[js.Any]],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): DatabasePoolType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = js.Any.fromFunction1(anyFirst), connect = js.Any.fromFunction1(connect), end = js.Any.fromFunction0(end), exists = js.Any.fromFunction1(exists), getPoolState = js.Any.fromFunction0(getPoolState), many = js.Any.fromFunction1(many), manyFirst = js.Any.fromFunction1(manyFirst), maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabasePoolType]
  }
  
  extension [Self <: DatabasePoolType](x: Self) {
    
    inline def setConnect(value: ConnectionRoutineType[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setGetPoolState(value: () => PoolStateType): Self = StObject.set(x, "getPoolState", js.Any.fromFunction0(value))
    
    inline def setStream(
      value: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null]
    ): Self = StObject.set(x, "stream", js.Any.fromFunction2(value))
    
    inline def setTransaction(value: TransactionFunctionType[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
