package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerWalkerUtilMod {
  
  @JSImport("speech-rule-engine/js/walker/walker_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllBySemanticId(root: Element, id: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllBySemanticId")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getAttribute(node: Element, attr: Attribute): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getBySemanticId(root: Element, id: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getBySemanticId")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def getSemanticRoot(node: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemanticRoot")(node.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def splitAttribute(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAttribute")().asInstanceOf[js.Array[String]]
  inline def splitAttribute(attr: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAttribute")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
