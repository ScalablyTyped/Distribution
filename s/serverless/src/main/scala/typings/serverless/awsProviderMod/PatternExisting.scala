package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternExisting extends StObject {
  
  var source: js.Array[String] = js.native
}
object PatternExisting {
  
  @scala.inline
  def apply(source: js.Array[String]): PatternExisting = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternExisting]
  }
  
  @scala.inline
  implicit class PatternExistingMutableBuilder[Self <: PatternExisting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
