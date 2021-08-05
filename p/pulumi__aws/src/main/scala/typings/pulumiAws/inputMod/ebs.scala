package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebs {
  
  trait GetEbsVolumesFilter extends StObject {
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
      * For example, if matching against the `size` filter, use:
      */
    var name: String
    
    /**
      * Set of values that are accepted for the given field.
      * EBS Volume IDs will be selected if any one of the given values match.
      */
    var values: js.Array[String]
  }
  object GetEbsVolumesFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetEbsVolumesFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEbsVolumesFilter]
    }
    
    extension [Self <: GetEbsVolumesFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetSnapshotFilter extends StObject {
    
    var name: String
    
    var values: js.Array[String]
  }
  object GetSnapshotFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetSnapshotFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotFilter]
    }
    
    extension [Self <: GetSnapshotFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetSnapshotIdsFilter extends StObject {
    
    var name: String
    
    var values: js.Array[String]
  }
  object GetSnapshotIdsFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetSnapshotIdsFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotIdsFilter]
    }
    
    extension [Self <: GetSnapshotIdsFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetVolumeFilter extends StObject {
    
    var name: String
    
    var values: js.Array[String]
  }
  object GetVolumeFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetVolumeFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVolumeFilter]
    }
    
    extension [Self <: GetVolumeFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
