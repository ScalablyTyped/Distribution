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
    any: /* args */ QueryMethodParams[Any] => js.Promise[js.Array[Any]],
    anyFirst: QueryAnyFirstFunctionType,
    connect: ConnectionRoutineType[Any] => js.Promise[Any],
    end: () => js.Promise[Unit],
    exists: /* args */ QueryMethodParams[Any] => js.Promise[Boolean],
    getPoolState: () => PoolStateType,
    many: QueryManyFunctionType,
    manyFirst: QueryManyFirstFunctionType,
    maybeOne: /* args */ QueryMethodParams[Any] => js.Promise[Any | Null],
    maybeOneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ],
    one: /* args */ QueryMethodParams[Any] => js.Promise[Any],
    oneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    query: /* args */ QueryMethodParams[Any] => js.Promise[QueryResultType[Any]],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[Any] => js.Promise[Any]
  ): DatabasePoolType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = anyFirst.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), end = js.Any.fromFunction0(end), exists = js.Any.fromFunction1(exists), getPoolState = js.Any.fromFunction0(getPoolState), many = many.asInstanceOf[js.Any], manyFirst = manyFirst.asInstanceOf[js.Any], maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabasePoolType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabasePoolType] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: ConnectionRoutineType[Any] => js.Promise[Any]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setGetPoolState(value: () => PoolStateType): Self = StObject.set(x, "getPoolState", js.Any.fromFunction0(value))
    
    inline def setStream(
      value: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null]
    ): Self = StObject.set(x, "stream", js.Any.fromFunction2(value))
    
    inline def setTransaction(value: TransactionFunctionType[Any] => js.Promise[Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
