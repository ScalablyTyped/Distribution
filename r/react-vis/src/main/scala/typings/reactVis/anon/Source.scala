package typings.reactVis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var source: Double | StringDictionary[js.Any] = js.native
  
  var target: Double | StringDictionary[js.Any] = js.native
}
object Source {
  
  @scala.inline
  def apply(source: Double | StringDictionary[js.Any], target: Double | StringDictionary[js.Any]): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Double | StringDictionary[js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Double | StringDictionary[js.Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
