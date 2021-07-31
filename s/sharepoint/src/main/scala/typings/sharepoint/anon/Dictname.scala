package typings.sharepoint.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictname
  extends StObject
     with /* name */ StringDictionary[js.Any] {
  
  var Key: String
}
object Dictname {
  
  @scala.inline
  def apply(Key: String): Dictname = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  
  @scala.inline
  implicit class DictnameMutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
