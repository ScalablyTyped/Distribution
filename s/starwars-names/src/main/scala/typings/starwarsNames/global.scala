package typings.starwarsNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object starwarsNames {
    
    @JSGlobal("starwarsNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("starwarsNames.all")
    @js.native
    val all: js.Array[String] = js.native
    
    inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
    inline def random(number: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(number.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
