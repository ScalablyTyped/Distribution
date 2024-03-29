package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dax {
  
  trait ClusterNode extends StObject {
    
    var address: js.UndefOr[Input[String]] = js.undefined
    
    var availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port used by the configuration endpoint
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
  }
  object ClusterNode {
    
    inline def apply(): ClusterNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterNode]
    }
    
    extension [Self <: ClusterNode](x: Self) {
      
      inline def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait ClusterServerSideEncryption extends StObject {
    
    /**
      * Whether to enable encryption at rest. Defaults to `false`.
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ClusterServerSideEncryption {
    
    inline def apply(): ClusterServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterServerSideEncryption]
    }
    
    extension [Self <: ClusterServerSideEncryption](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the parameter.
      */
    var name: Input[String]
    
    /**
      * The value for the parameter.
      */
    var value: Input[String]
  }
  object ParameterGroupParameter {
    
    inline def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
