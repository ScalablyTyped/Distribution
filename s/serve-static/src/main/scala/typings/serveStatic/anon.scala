package typings.serveStatic

import typings.mime.mod.TypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofm extends StObject {
    
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    
    def getExtension(mime: String): String | Null = js.native
    
    def getType(path: String): String | Null = js.native
  }
}
