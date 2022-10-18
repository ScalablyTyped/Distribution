package typings.storybookDocsTools

import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDef
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.DocgenInfo
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem
import typings.storybookDocsTools.distTs3Dot9ArgTypesJsdocParserMod.JsDocParsingResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenCreatePropDefMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/createPropDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/createPropDef", "flowFactory")
  @js.native
  val flowFactory: PropDefFactory = js.native
  
  inline def getPropDefFactory(typeSystem: TypeSystem): PropDefFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropDefFactory")(typeSystem.asInstanceOf[js.Any]).asInstanceOf[PropDefFactory]
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/createPropDef", "javaScriptFactory")
  @js.native
  val javaScriptFactory: PropDefFactory = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/createPropDef", "tsFactory")
  @js.native
  val tsFactory: PropDefFactory = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/createPropDef", "unknownFactory")
  @js.native
  val unknownFactory: PropDefFactory = js.native
  
  type PropDefFactory = js.Function3[
    /* propName */ String, 
    /* docgenInfo */ DocgenInfo, 
    /* jsDocParsingResult */ js.UndefOr[JsDocParsingResult], 
    PropDef
  ]
}
