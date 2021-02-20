package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strict extends StObject {
  
  var strict: js.UndefOr[Boolean] = js.native
}
object Strict {
  
  @scala.inline
  def apply(): Strict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strict]
  }
  
  @scala.inline
  implicit class StrictMutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
