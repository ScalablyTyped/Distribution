package typings.psl

import typings.psl.mod.ParseError
import typings.psl.mod.ParsedDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object psl {
    
    @JSGlobal("psl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Null]
    inline def get(domain: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(domain.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def isValid(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def parse(domain: String): ParsedDomain | ParseError = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(domain.asInstanceOf[js.Any]).asInstanceOf[ParsedDomain | ParseError]
  }
}
