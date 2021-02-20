package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebs {
  
  @js.native
  trait GetEbsVolumesFilter extends StObject {
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
      * For example, if matching against the `size` filter, use:
      */
    var name: String = js.native
    
    /**
      * Set of values that are accepted for the given field.
      * EBS Volume IDs will be selected if any one of the given values match.
      */
    var values: js.Array[String] = js.native
  }
  object GetEbsVolumesFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetEbsVolumesFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEbsVolumesFilter]
    }
    
    @scala.inline
    implicit class GetEbsVolumesFilterMutableBuilder[Self <: GetEbsVolumesFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetSnapshotFilter extends StObject {
    
    var name: String = js.native
    
    var values: js.Array[String] = js.native
  }
  object GetSnapshotFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetSnapshotFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotFilter]
    }
    
    @scala.inline
    implicit class GetSnapshotFilterMutableBuilder[Self <: GetSnapshotFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetSnapshotIdsFilter extends StObject {
    
    var name: String = js.native
    
    var values: js.Array[String] = js.native
  }
  object GetSnapshotIdsFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetSnapshotIdsFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotIdsFilter]
    }
    
    @scala.inline
    implicit class GetSnapshotIdsFilterMutableBuilder[Self <: GetSnapshotIdsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetVolumeFilter extends StObject {
    
    var name: String = js.native
    
    var values: js.Array[String] = js.native
  }
  object GetVolumeFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetVolumeFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVolumeFilter]
    }
    
    @scala.inline
    implicit class GetVolumeFilterMutableBuilder[Self <: GetVolumeFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
