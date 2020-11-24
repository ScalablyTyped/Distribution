package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonQueryMethodsType extends js.Object {
  
  def any[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[js.Array[T]] = js.native
  
  def anyFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("anyFirst")
  var anyFirst_Original: QueryAnyFirstFunctionType = js.native
  
  @JSName("any")
  var any_Original: QueryAnyFunctionType = js.native
  
  def exists(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<any> is not an array type */ args: QueryMethodParams[_]
  ): js.Promise[Boolean] = js.native
  @JSName("exists")
  var exists_Original: QueryExistsFunctionType = js.native
  
  def many[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[js.Array[T]] = js.native
  
  def manyFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("manyFirst")
  var manyFirst_Original: QueryManyFirstFunctionType = js.native
  
  @JSName("many")
  var many_Original: QueryManyFunctionType = js.native
  
  def maybeOne[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[T | Null] = js.native
  
  def maybeOneFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | Null
  ] = js.native
  @JSName("maybeOneFirst")
  var maybeOneFirst_Original: QueryMaybeOneFirstFunctionType = js.native
  
  @JSName("maybeOne")
  var maybeOne_Original: QueryMaybeOneFunctionType = js.native
  
  def one[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[T] = js.native
  
  def oneFirst[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("oneFirst")
  var oneFirst_Original: QueryOneFirstFunctionType = js.native
  
  @JSName("one")
  var one_Original: QueryOneFunctionType = js.native
  
  def query[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[QueryResultType[T]] = js.native
  @JSName("query")
  var query_Original: QueryFunctionType = js.native
}
