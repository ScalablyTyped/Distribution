package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonQueryMethodsType extends StObject {
  
  def any[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[js.Array[T]]
  
  def anyFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  @JSName("anyFirst")
  var anyFirst_Original: QueryAnyFirstFunctionType
  
  @JSName("any")
  var any_Original: QueryAnyFunctionType
  
  def exists(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<any> is not an array type */ args: QueryMethodParams[Any]
  ): js.Promise[Boolean]
  @JSName("exists")
  var exists_Original: QueryExistsFunctionType
  
  var many: QueryManyFunctionType
  
  def manyFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  @JSName("manyFirst")
  var manyFirst_Original: QueryManyFirstFunctionType
  
  def maybeOne[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[T | Null]
  
  def maybeOneFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | Null
  ]
  @JSName("maybeOneFirst")
  var maybeOneFirst_Original: QueryMaybeOneFirstFunctionType
  
  @JSName("maybeOne")
  var maybeOne_Original: QueryMaybeOneFunctionType
  
  def one[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[T]
  
  def oneFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  @JSName("oneFirst")
  var oneFirst_Original: QueryOneFirstFunctionType
  
  @JSName("one")
  var one_Original: QueryOneFunctionType
  
  def query[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[QueryResultType[T]]
  @JSName("query")
  var query_Original: QueryFunctionType
}
object CommonQueryMethodsType {
  
  inline def apply(
    any: /* args */ QueryMethodParams[Any] => js.Promise[js.Array[Any]],
    anyFirst: QueryAnyFirstFunctionType,
    exists: /* args */ QueryMethodParams[Any] => js.Promise[Boolean],
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
    query: /* args */ QueryMethodParams[Any] => js.Promise[QueryResultType[Any]]
  ): CommonQueryMethodsType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = anyFirst.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), many = many.asInstanceOf[js.Any], manyFirst = manyFirst.asInstanceOf[js.Any], maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[CommonQueryMethodsType]
  }
  
  extension [Self <: CommonQueryMethodsType](x: Self) {
    
    inline def setAny(value: /* args */ QueryMethodParams[Any] => js.Promise[js.Array[Any]]): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
    
    inline def setAnyFirst(value: QueryAnyFirstFunctionType): Self = StObject.set(x, "anyFirst", value.asInstanceOf[js.Any])
    
    inline def setExists(value: /* args */ QueryMethodParams[Any] => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    inline def setMany(value: QueryManyFunctionType): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyFirst(value: QueryManyFirstFunctionType): Self = StObject.set(x, "manyFirst", value.asInstanceOf[js.Any])
    
    inline def setMaybeOne(value: /* args */ QueryMethodParams[Any] => js.Promise[Any | Null]): Self = StObject.set(x, "maybeOne", js.Any.fromFunction1(value))
    
    inline def setMaybeOneFirst(
      value: /* args */ QueryMethodParams[Any] => js.Promise[
          (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
        ]
    ): Self = StObject.set(x, "maybeOneFirst", js.Any.fromFunction1(value))
    
    inline def setOne(value: /* args */ QueryMethodParams[Any] => js.Promise[Any]): Self = StObject.set(x, "one", js.Any.fromFunction1(value))
    
    inline def setOneFirst(
      value: /* args */ QueryMethodParams[Any] => js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
        ]
    ): Self = StObject.set(x, "oneFirst", js.Any.fromFunction1(value))
    
    inline def setQuery(value: /* args */ QueryMethodParams[Any] => js.Promise[QueryResultType[Any]]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
  }
}
