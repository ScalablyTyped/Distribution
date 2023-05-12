package typings.removeTypes

import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remove-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(code: String, prettierConfig: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], prettierConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(code: String, prettierConfig: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], prettierConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def removeTypes(code: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTypes")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def removeTypes(code: String, prettierConfig: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTypes")(code.asInstanceOf[js.Any], prettierConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def removeTypes(code: String, prettierConfig: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTypes")(code.asInstanceOf[js.Any], prettierConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
