package typings.roslib.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends StObject {
  
  var string: js.UndefOr[java.lang.String | Null] = js.native
  
  var xml: Node = js.native
}
object String {
  
  @scala.inline
  def apply(xml: Node): String = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringNull: Self = StObject.set(x, "string", null)
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setXml(value: Node): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
