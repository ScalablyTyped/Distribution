package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BvhParser {
  
  @JSImport("seen", "BvhParser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def SyntaxError(message: String, expected: String, found: String, location: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SyntaxError")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], found.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parse(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
