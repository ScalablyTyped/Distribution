package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<rc-tree.rc-tree/es/interface.FieldNames> */
trait RequiredFieldNames extends StObject {
  
  var _title: js.Array[String]
  
  var children: String
  
  var key: String
  
  var title: String
}
object RequiredFieldNames {
  
  inline def apply(_title: js.Array[String], children: String, key: String, title: String): RequiredFieldNames = {
    val __obj = js.Dynamic.literal(_title = _title.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredFieldNames]
  }
  
  extension [Self <: RequiredFieldNames](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value*))
  }
}
