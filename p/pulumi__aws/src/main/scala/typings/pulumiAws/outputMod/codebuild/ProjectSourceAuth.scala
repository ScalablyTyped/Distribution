package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSourceAuth extends StObject {
  
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The authorization type to use. The only valid value is `OAUTH`
    */
  var `type`: String
}
object ProjectSourceAuth {
  
  @scala.inline
  def apply(`type`: String): ProjectSourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceAuth]
  }
  
  @scala.inline
  implicit class ProjectSourceAuthMutableBuilder[Self <: ProjectSourceAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
