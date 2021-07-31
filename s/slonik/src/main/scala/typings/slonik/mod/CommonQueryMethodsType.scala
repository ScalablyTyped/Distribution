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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<any> is not an array type */ args: QueryMethodParams[js.Any]
  ): js.Promise[Boolean]
  @JSName("exists")
  var exists_Original: QueryExistsFunctionType
  
  def many[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[js.Array[T]]
  
  def manyFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  @JSName("manyFirst")
  var manyFirst_Original: QueryManyFirstFunctionType
  
  @JSName("many")
  var many_Original: QueryManyFunctionType
  
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
  
  @scala.inline
  def apply(
    any: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]],
    anyFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ],
    exists: /* args */ QueryMethodParams[js.Any] => js.Promise[Boolean],
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
    query: /* args */ QueryMethodParams[js.Any] => js.Promise[QueryResultType[js.Any]]
  ): CommonQueryMethodsType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = js.Any.fromFunction1(anyFirst), exists = js.Any.fromFunction1(exists), many = js.Any.fromFunction1(many), manyFirst = js.Any.fromFunction1(manyFirst), maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[CommonQueryMethodsType]
  }
  
  @scala.inline
  implicit class CommonQueryMethodsTypeMutableBuilder[Self <: CommonQueryMethodsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnyFirst(
      value: /* args */ QueryMethodParams[js.Any] => js.Promise[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "anyFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExists(value: /* args */ QueryMethodParams[js.Any] => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMany(value: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "many", js.Any.fromFunction1(value))
    
    @scala.inline
    def setManyFirst(
      value: /* args */ QueryMethodParams[js.Any] => js.Promise[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "manyFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaybeOne(value: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any | Null]): Self = StObject.set(x, "maybeOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaybeOneFirst(
      value: /* args */ QueryMethodParams[js.Any] => js.Promise[
          (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
        ]
    ): Self = StObject.set(x, "maybeOneFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOne(value: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "one", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOneFirst(
      value: /* args */ QueryMethodParams[js.Any] => js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
        ]
    ): Self = StObject.set(x, "oneFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuery(value: /* args */ QueryMethodParams[js.Any] => js.Promise[QueryResultType[js.Any]]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
  }
}
