package typings.sift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("sift/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def comparable(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("comparable")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def equals_(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray(value: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isObject(value: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isVanillaObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVanillaObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def typeChecker[TType](`type`: Any): js.Function1[/* value */ Any, /* is TType */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeChecker")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, /* is TType */ Boolean]]
  
  type Comparator = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  type Key = String | Double
}
