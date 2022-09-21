package typings.raml1Parser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expander {
  
  @JSImport("raml-1-parser", "expander")
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandTraitsAndResourceTypes[T](api: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypes")(api.asInstanceOf[js.Any]).asInstanceOf[T]
}
