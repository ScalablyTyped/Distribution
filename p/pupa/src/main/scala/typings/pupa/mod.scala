package typings.pupa

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(template: String, data: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(template: String, data: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pupa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
