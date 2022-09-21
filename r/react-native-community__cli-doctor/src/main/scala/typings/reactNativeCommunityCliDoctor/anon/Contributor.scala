package typings.reactNativeCommunityCliDoctor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributor extends StObject {
  
  var contributor: Boolean | Unit
  
  var fix: Boolean | Unit
}
object Contributor {
  
  inline def apply(contributor: Boolean | Unit, fix: Boolean | Unit): Contributor = {
    val __obj = js.Dynamic.literal(contributor = contributor.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributor]
  }
  
  extension [Self <: Contributor](x: Self) {
    
    inline def setContributor(value: Boolean | Unit): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    inline def setFix(value: Boolean | Unit): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
  }
}
