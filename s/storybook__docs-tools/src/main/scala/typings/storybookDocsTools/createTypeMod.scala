package typings.storybookDocsTools

import typings.storybookDocsTools.docgenTypesMod.DocgenFlowType
import typings.storybookDocsTools.propDefMod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTypeMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/flow/createType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createType(`type`: DocgenFlowType): PropType = ^.asInstanceOf[js.Dynamic].applyDynamic("createType")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropType]
}
