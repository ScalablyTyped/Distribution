package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.link_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait LinkCloseToken extends TagToken {
  
  @JSName("type")
  var type_LinkCloseToken: link_close = js.native
}
object LinkCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: link_close): LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkCloseToken]
  }
  
  @scala.inline
  implicit class LinkCloseTokenMutableBuilder[Self <: LinkCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: link_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
