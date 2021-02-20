package typings.roslib.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xml extends StObject {
  
  var xml: Node = js.native
}
object Xml {
  
  @scala.inline
  def apply(xml: Node): Xml = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xml]
  }
  
  @scala.inline
  implicit class XmlMutableBuilder[Self <: Xml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXml(value: Node): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
