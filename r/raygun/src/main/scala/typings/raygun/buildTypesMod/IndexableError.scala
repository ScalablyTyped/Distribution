package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexableError
  extends StObject
     with Error
     with /* key */ StringDictionary[Any]
object IndexableError {
  
  inline def apply(message: String, name: String): IndexableError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexableError]
  }
}
