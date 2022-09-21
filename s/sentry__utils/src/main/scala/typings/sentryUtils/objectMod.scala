package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.wrappedfunctionMod.WrappedFunction
import typings.sentryUtils.anon.DictownProps
import typings.sentryUtils.anon.Message
import typings.std.ObjectConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@sentry/utils/types/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addNonEnumerableProperty(obj: StringDictionary[Any], name: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNonEnumerableProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertToPlainObject[V /* <: Any */](value: V): DictownProps | Message | V = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[DictownProps | Message | V]
  
  inline def dropUndefinedKeys[T](inputValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("dropUndefinedKeys")(inputValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def extractExceptionKeysForMessage(exception: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractExceptionKeysForMessage(exception: Record[String, Any], maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fill(
    source: StringDictionary[Any],
    name: String,
    replacementFactory: js.Function1[/* repeated */ Any, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], replacementFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOriginalFunction(func: WrappedFunction): js.UndefOr[WrappedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WrappedFunction]]
  
  inline def markFunctionWrapped(wrapped: WrappedFunction, original: WrappedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markFunctionWrapped")(wrapped.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def objectify(wat: Any): ObjectConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("objectify")(wat.asInstanceOf[js.Any]).asInstanceOf[ObjectConstructor]
  
  inline def urlEncode(`object`: StringDictionary[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
}
