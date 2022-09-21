package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keysMod {
  
  @JSImport("react-mentions/lib/utils/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keys[T](obj: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
}
