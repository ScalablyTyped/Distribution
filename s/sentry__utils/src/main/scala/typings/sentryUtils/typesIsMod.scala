package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIsMod {
  
  @JSImport("@sentry/utils/types/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDOMError(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDOMException(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMException")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(wat: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isErrorEvent(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEvent(wat: Any): /* is @sentry/types.@sentry/types/types/polymorphics.PolymorphicEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/polymorphics.PolymorphicEvent */ Boolean]
  
  inline def isInstanceOf(wat: Any, base: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(wat.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNaN(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(wat: Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
  
  inline def isPrimitive(wat: Any): /* is @sentry/types.@sentry/types/types/misc.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/misc.Primitive */ Boolean]
  
  inline def isRegExp(wat: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(wat: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSyntheticEvent(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThenable(wat: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
}
