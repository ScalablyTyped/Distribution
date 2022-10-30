package typings.protocols

import typings.node.urlMod.URL_
import typings.protocols.protocolsBooleans.`false`
import typings.protocols.protocolsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  /**
    * @param input The input url.
    * @param first If `true`, the first protocol will be returned. If number, it will represent the zero-based index of the protocols array.
    * @returns The array of protocols or the specified protocol.
    */
  inline def apply(input: String, first: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: String, first: `false`): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(input: String, first: `true`): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: URL_): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(input: URL_, first: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: URL_, first: `false`): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(input: URL_, first: `true`): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("protocols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
