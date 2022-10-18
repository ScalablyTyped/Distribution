package typings.storybookDocsTools

import typings.storybookDocsTools.distTs3Dot9ArgTypesTypesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenUtilsMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocgenDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDocgenSection(component: Component, section: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenSection")(component.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasDocgen(component: Component): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocgen")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefaultValueBlacklisted(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultValueBlacklisted")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDocgenSection(docgenSection: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDocgenSection")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def str(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
