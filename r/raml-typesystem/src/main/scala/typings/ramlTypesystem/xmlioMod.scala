package typings.ramlTypesystem

import typings.ramlTypesystem.typesystemMod.AbstractType
import typings.ramlTypesystem.typesystemMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlioMod {
  
  @JSImport("raml-typesystem/dist/src/xmlio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getXmlErrors(root: Any): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("getXmlErrors")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Status]]
  
  @JSImport("raml-typesystem/dist/src/xmlio", "messageRegistry")
  @js.native
  def messageRegistry: Any = js.native
  inline def messageRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageRegistry")(x.asInstanceOf[js.Any])
  
  inline def readObject(content: String, t: AbstractType): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(content.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serializeToXML(`object`: Any, `type`: AbstractType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeToXML")(`object`.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
}
