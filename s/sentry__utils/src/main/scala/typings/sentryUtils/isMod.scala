package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("@sentry/utils/dist/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDOMError(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDOMException(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMException")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isErrorEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInstanceOf(wat: js.Any, base: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(wat.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPlainObject(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrimitive(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSyntheticEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThenable(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
