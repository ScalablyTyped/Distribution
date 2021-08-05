package typings.storybookUi

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyQueryParamsMod {
  
  @JSImport("@storybook/ui/dist/components/preview/utils/stringifyQueryParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyQueryParams(queryParams: Record[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQueryParams")(queryParams.asInstanceOf[js.Any]).asInstanceOf[String]
}
