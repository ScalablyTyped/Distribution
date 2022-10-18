package typings.storybookDocsTools

import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenExtractDocgenPropsMod.ExtractProps
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenExtractDocgenPropsMod.ExtractedProp
import typings.storybookDocsTools.distTs3Dot9ArgTypesTypesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen", "TypeSystem")
  @js.native
  object TypeSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem & String] = js.native
    
    /* "Flow" */ val FLOW: typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.FLOW & String = js.native
    
    /* "JavaScript" */ val JAVASCRIPT: typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.JAVASCRIPT & String = js.native
    
    /* "TypeScript" */ val TYPESCRIPT: typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.TYPESCRIPT & String = js.native
    
    /* "Unknown" */ val UNKNOWN: typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.UNKNOWN & String = js.native
  }
  
  inline def extractComponentDescription(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")().asInstanceOf[String]
  inline def extractComponentDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen", "extractComponentProps")
  @js.native
  val extractComponentProps: ExtractProps = js.native
  
  inline def extractComponentSectionArray(docgenSection: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionArray")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def extractComponentSectionObject(docgenSection: Any): js.Array[ExtractedProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionObject")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[ExtractedProp]]
  
  inline def getDocgenDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDocgenSection(component: Component, section: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenSection")(component.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasDocgen(component: Component): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocgen")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefaultValueBlacklisted(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultValueBlacklisted")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDocgenSection(docgenSection: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDocgenSection")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def str(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
