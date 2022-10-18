package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesMiscMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBuildPolyfillsTypesMod {
  
  @js.native
  trait GenericFunction
    extends StObject
       with _Value {
    
    def apply(args: Any*): Value = js.native
  }
  
  trait GenericObject
    extends StObject
       with /* key */ StringDictionary[Value]
       with _Value
  object GenericObject {
    
    inline def apply(): GenericObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericObject]
    }
  }
  
  type RequireResult = GenericObject | (GenericFunction & GenericObject)
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.typesMiscMod.Primitive
    - typings.sentryUtils.typesBuildPolyfillsTypesMod.GenericFunction
    - typings.sentryUtils.typesBuildPolyfillsTypesMod.GenericObject
  */
  type Value = _Value | Primitive
  
  trait _Value extends StObject
}
