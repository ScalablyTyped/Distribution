package typings.ramlTypesystem

import typings.ramlXmlValidation.mod.XMLSchemaReference
import typings.ramlXmlValidation.mod.XMLValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcXmlUtilMod {
  
  @JSImport("raml-typesystem/dist/src/xmlUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXmlSchemaReference(originalPath: String, virtualIndex: Double, patchedContent: String): XMLSchemaReference = (^.asInstanceOf[js.Dynamic].applyDynamic("createXmlSchemaReference")(originalPath.asInstanceOf[js.Any], virtualIndex.asInstanceOf[js.Any], patchedContent.asInstanceOf[js.Any])).asInstanceOf[XMLSchemaReference]
  
  inline def getValidator(arg: String): XMLValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(arg.asInstanceOf[js.Any]).asInstanceOf[XMLValidator]
  
  inline def jsonToXml(jsonObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToXml")(jsonObject.asInstanceOf[js.Any]).asInstanceOf[Any]
}
