package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDependency extends StObject {
  
  var condition: js.UndefOr[String] = js.native
  
  var containerName: js.UndefOr[String] = js.native
}
object ContainerDependency {
  
  @scala.inline
  def apply(): ContainerDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDependency]
  }
  
  @scala.inline
  implicit class ContainerDependencyMutableBuilder[Self <: ContainerDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
  }
}
