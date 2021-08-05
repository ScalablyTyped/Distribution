package typings.starwarsNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("starwars-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("starwars-names", "all")
  @js.native
  val all: js.Array[String] = js.native
  
  inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
  inline def random(number: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(number.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
