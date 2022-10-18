package typings.reactVega

import typings.reactVega.libTypesMod.PlainObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsShallowEqualMod {
  
  @JSImport("react-vega/lib/utils/shallowEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(a: Unit, b: PlainObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(a: PlainObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(a: PlainObject, b: PlainObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
