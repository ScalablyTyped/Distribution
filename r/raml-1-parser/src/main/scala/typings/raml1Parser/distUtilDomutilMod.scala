package typings.raml1Parser

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDomutilMod {
  
  @JSImport("raml-1-parser/dist/util/domutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildHamlStyleTag(tag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHamlStyleTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildHamlStyleTag(tag: String, classes: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHamlStyleTag")(tag.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildHamlStyleTag(tag: String, classes: js.Array[String], id: typings.raml1Parser.distOptMod.^[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHamlStyleTag")(tag.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildHamlStyleTag(tag: String, classes: Unit, id: typings.raml1Parser.distOptMod.^[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHamlStyleTag")(tag.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def childrenOf(elm: HTMLElement): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenOf")(elm.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
}
