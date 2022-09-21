package typings.storybookComponents.typesPrettierIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfigFile {
  
  inline def apply(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String | Null]]
  inline def apply(filePath: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "resolveConfigFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String | Null]
  inline def sync(filePath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
