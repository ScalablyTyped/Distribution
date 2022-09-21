package typings.sirenParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("siren-parser/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(link: js.Object): Link = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(link.asInstanceOf[js.Any]).asInstanceOf[Link]
  
  @js.native
  trait Link extends StObject {
    
    var `class`: js.UndefOr[js.Array[String]] = js.native
    
    def hasClass(cls: String): Boolean = js.native
    def hasClass(cls: js.RegExp): Boolean = js.native
    
    var href: String = js.native
    
    var rel: js.Array[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
}
