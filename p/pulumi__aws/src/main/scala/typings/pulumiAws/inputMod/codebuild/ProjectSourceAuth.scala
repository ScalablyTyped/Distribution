package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSourceAuth extends StObject {
  
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[Input[String]] = js.native
  
  /**
    * The authorization type to use. The only valid value is `OAUTH`
    */
  var `type`: Input[String] = js.native
}
object ProjectSourceAuth {
  
  @scala.inline
  def apply(`type`: Input[String]): ProjectSourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceAuth]
  }
  
  @scala.inline
  implicit class ProjectSourceAuthMutableBuilder[Self <: ProjectSourceAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
