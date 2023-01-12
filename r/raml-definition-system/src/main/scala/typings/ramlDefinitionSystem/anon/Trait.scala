package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trait extends StObject {
  
  var `trait`: NameString
}
object Trait {
  
  inline def apply(`trait`: NameString): Trait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trait")(`trait`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trait] (val x: Self) extends AnyVal {
    
    inline def setTrait(value: NameString): Self = StObject.set(x, "trait", value.asInstanceOf[js.Any])
  }
}
