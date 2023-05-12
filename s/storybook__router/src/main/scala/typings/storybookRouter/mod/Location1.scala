package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry in a history stack. A location contains information about the
  * URL path, as well as possibly some arbitrary state and a key.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location
  */
trait Location1
  extends StObject
     with Path {
  
  /**
    * A unique string associated with this location. May be used to safely store
    * and retrieve data in some other storage API, like `localStorage`.
    *
    * Note: This value is always "default" on the initial location.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.key
    */
  var key: Key
  
  /**
    * A value of arbitrary data associated with this location.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.state
    */
  var state: Any
}
object Location1 {
  
  inline def apply(hash: Hash, key: Key, pathname: Pathname, search: Search, state: Any): Location1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location1] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
