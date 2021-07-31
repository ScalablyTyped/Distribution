package typings.randomstring

import typings.randomstring.Randomstring.GenerateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Randomstring {
    
    @JSGlobal("Randomstring")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
    @scala.inline
    def generate(options: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def generate(options: GenerateOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
