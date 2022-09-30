package typings.storybookDocsTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/convert/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def includesQuotes(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includesQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def trimQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
