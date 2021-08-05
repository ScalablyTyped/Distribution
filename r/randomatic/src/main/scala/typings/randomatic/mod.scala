package typings.randomatic

import typings.randomatic.anon.Chars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(p: String): String = ^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(p: String, l: Double): String = (^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(p: String, l: Double, options: Chars): String = (^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any], l.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(p: String, l: Unit, options: Chars): String = (^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any], l.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("randomatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("randomatic", "isCrypto")
  @js.native
  val isCrypto: Boolean = js.native
}
