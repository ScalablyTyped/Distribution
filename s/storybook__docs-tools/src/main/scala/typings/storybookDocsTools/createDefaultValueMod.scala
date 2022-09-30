package typings.storybookDocsTools

import typings.storybookDocsTools.docgenTypesMod.DocgenPropDefaultValue
import typings.storybookDocsTools.docgenTypesMod.DocgenPropType
import typings.storybookDocsTools.propDefMod.PropDefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDefaultValueMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/flow/createDefaultValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultValue(defaultValue: DocgenPropDefaultValue, `type`: DocgenPropType): PropDefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValue")(defaultValue.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[PropDefaultValue]
}
