package typings.rascal.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connectionname
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  var connection_name: js.UndefOr[String] = js.undefined
}
object Connectionname {
  
  inline def apply(): Connectionname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connectionname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connectionname] (val x: Self) extends AnyVal {
    
    inline def setConnection_name(value: String): Self = StObject.set(x, "connection_name", value.asInstanceOf[js.Any])
    
    inline def setConnection_nameUndefined: Self = StObject.set(x, "connection_name", js.undefined)
  }
}
