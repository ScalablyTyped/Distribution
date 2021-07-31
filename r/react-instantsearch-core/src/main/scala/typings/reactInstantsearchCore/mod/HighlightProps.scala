package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.HighlightProperty
import typings.reactInstantsearchCore.anon.IsHighlighted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProps[TDoc]
  extends StObject
     with HighlightProvided[TDoc]
     with HighlightPassedThru[TDoc]
object HighlightProps {
  
  @scala.inline
  def apply[TDoc](attribute: String, highlight: HighlightProperty[TDoc] => js.Array[IsHighlighted], hit: Hit[TDoc]): HighlightProps[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlight = js.Any.fromFunction1(highlight), hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps[TDoc]]
  }
}
