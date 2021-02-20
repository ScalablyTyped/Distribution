package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dax {
  
  @js.native
  trait ClusterNode extends StObject {
    
    var address: String = js.native
    
    var availabilityZone: String = js.native
    
    var id: String = js.native
    
    /**
      * The port used by the configuration endpoint
      */
    var port: Double = js.native
  }
  object ClusterNode {
    
    @scala.inline
    def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterNode]
    }
    
    @scala.inline
    implicit class ClusterNodeMutableBuilder[Self <: ClusterNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClusterServerSideEncryption extends StObject {
    
    /**
      * Whether to enable encryption at rest. Defaults to `false`.
      */
    var enabled: js.UndefOr[Boolean] = js.native
  }
  object ClusterServerSideEncryption {
    
    @scala.inline
    def apply(): ClusterServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterServerSideEncryption]
    }
    
    @scala.inline
    implicit class ClusterServerSideEncryptionMutableBuilder[Self <: ClusterServerSideEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  @js.native
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the parameter.
      */
    var name: String = js.native
    
    /**
      * The value for the parameter.
      */
    var value: String = js.native
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
