package typings.storybookDocsTools

import typings.storybookDocsTools.docgenTypesMod.DocgenInfo
import typings.storybookDocsTools.propDefMod.PropDefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptCreateDefaultValueMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/typeScript/createDefaultValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultValue(hasDefaultValue: DocgenInfo): PropDefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValue")(hasDefaultValue.asInstanceOf[js.Any]).asInstanceOf[PropDefaultValue]
}
