package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  var id: String
  
  var in: Boolean
  
  var label: String
  
  var links: js.Array[String]
  
  var maximumLinks: Double
  
  var name: String
  
  var parentNode: String
  
  var selected: Boolean
  
  var `type`: String
}
object In {
  
  @scala.inline
  def apply(
    id: String,
    in: Boolean,
    label: String,
    links: js.Array[String],
    maximumLinks: Double,
    name: String,
    parentNode: String,
    selected: Boolean,
    `type`: String
  ): In = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maximumLinks = maximumLinks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMaximumLinks(value: Double): Self = StObject.set(x, "maximumLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
