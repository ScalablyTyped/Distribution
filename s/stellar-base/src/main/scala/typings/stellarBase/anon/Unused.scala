package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unused extends StObject {
  
  var unused: Double = js.native
}
object Unused {
  
  @scala.inline
  def apply(unused: Double): Unused = {
    val __obj = js.Dynamic.literal(unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unused]
  }
  
  @scala.inline
  implicit class UnusedMutableBuilder[Self <: Unused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnused(value: Double): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
  }
}
