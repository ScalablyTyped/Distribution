package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dax {
  
  trait ClusterNode extends StObject {
    
    var address: String
    
    var availabilityZone: String
    
    var id: String
    
    /**
      * The port used by the configuration endpoint
      */
    var port: Double
  }
  object ClusterNode {
    
    inline def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterNode]
    }
    
    extension [Self <: ClusterNode](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterServerSideEncryption extends StObject {
    
    /**
      * Whether to enable encryption at rest. Defaults to `false`.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object ClusterServerSideEncryption {
    
    inline def apply(): ClusterServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterServerSideEncryption]
    }
    
    extension [Self <: ClusterServerSideEncryption](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the parameter.
      */
    var name: String
    
    /**
      * The value for the parameter.
      */
    var value: String
  }
  object ParameterGroupParameter {
    
    inline def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
