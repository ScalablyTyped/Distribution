package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSourceAuth extends StObject {
  
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The authorization type to use. The only valid value is `OAUTH`
    */
  var `type`: Input[String]
}
object ProjectSourceAuth {
  
  inline def apply(`type`: Input[String]): ProjectSourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceAuth]
  }
  
  extension [Self <: ProjectSourceAuth](x: Self) {
    
    inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
