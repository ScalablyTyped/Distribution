package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'namespace'> */
trait PickImplnamespace extends StObject {
  
  var namespace: String
}
object PickImplnamespace {
  
  @scala.inline
  def apply(namespace: String): PickImplnamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamespace]
  }
  
  @scala.inline
  implicit class PickImplnamespaceMutableBuilder[Self <: PickImplnamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
