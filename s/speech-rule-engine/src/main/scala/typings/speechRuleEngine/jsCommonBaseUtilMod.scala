package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonBaseUtilMod {
  
  @JSImport("speech-rule-engine/js/common/base_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interleaveLists(list1: js.Array[Any], list2: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interleaveLists")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def removeEmpty(strs: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmpty")(strs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def setdifference(a: js.Array[Any], b: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setdifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
