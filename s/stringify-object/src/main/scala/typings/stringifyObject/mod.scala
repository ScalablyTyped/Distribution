package typings.stringifyObject

import typings.stringifyObject.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: js.Any, options: Unit, pad: String): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: js.Any, options: Filter): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: js.Any, options: Filter, pad: String): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("stringify-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
