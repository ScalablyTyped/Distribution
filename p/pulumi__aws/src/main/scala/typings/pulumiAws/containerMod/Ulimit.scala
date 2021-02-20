package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ulimit extends StObject {
  
  var hardLimit: Double = js.native
  
  var name: UlimitName = js.native
  
  var softLimit: Double = js.native
}
object Ulimit {
  
  @scala.inline
  def apply(hardLimit: Double, name: UlimitName, softLimit: Double): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit class UlimitMutableBuilder[Self <: Ulimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardLimit(value: Double): Self = StObject.set(x, "hardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: UlimitName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftLimit(value: Double): Self = StObject.set(x, "softLimit", value.asInstanceOf[js.Any])
  }
}
