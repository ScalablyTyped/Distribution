package typings.storybookDocsTools

import typings.storybookDocsTools.docgenTypesMod.DocgenInfo
import typings.storybookDocsTools.propDefMod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptCreateTypeMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/typeScript/createType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createType(hasTsTypeRequired: DocgenInfo): PropType = ^.asInstanceOf[js.Dynamic].applyDynamic("createType")(hasTsTypeRequired.asInstanceOf[js.Any]).asInstanceOf[PropType]
}
