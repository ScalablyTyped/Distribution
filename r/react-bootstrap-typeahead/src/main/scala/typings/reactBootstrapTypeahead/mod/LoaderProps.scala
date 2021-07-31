package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderProps extends StObject {
  
  var bsSize: TypeaheadBsSizes
}
object LoaderProps {
  
  @scala.inline
  def apply(bsSize: TypeaheadBsSizes): LoaderProps = {
    val __obj = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
  
  @scala.inline
  implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
  }
}
