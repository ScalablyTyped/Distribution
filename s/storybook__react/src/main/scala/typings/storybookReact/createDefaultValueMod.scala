package typings.storybookReact

import typings.storybookDocsTools.propDefMod.PropDefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDefaultValueMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/defaultValues/createDefaultValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultValue(defaultValue: String): PropDefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[PropDefaultValue]
}
