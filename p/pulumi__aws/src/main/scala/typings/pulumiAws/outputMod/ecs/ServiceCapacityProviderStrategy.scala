package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCapacityProviderStrategy extends StObject {
  
  /**
    * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[Double] = js.undefined
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: String
  
  /**
    * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object ServiceCapacityProviderStrategy {
  
  inline def apply(capacityProvider: String): ServiceCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCapacityProviderStrategy]
  }
  
  extension [Self <: ServiceCapacityProviderStrategy](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCapacityProvider(value: String): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
