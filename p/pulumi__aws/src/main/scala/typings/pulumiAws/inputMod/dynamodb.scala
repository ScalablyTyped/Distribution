package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamodb {
  
  @js.native
  trait GetTableServerSideEncryption extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var kmsKeyArn: js.UndefOr[String] = js.native
  }
  object GetTableServerSideEncryption {
    
    @scala.inline
    def apply(): GetTableServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTableServerSideEncryption]
    }
    
    @scala.inline
    implicit class GetTableServerSideEncryptionMutableBuilder[Self <: GetTableServerSideEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
  
  @js.native
  trait GlobalTableReplica extends StObject {
    
    /**
      * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
      */
    var regionName: Input[String] = js.native
  }
  object GlobalTableReplica {
    
    @scala.inline
    def apply(regionName: Input[String]): GlobalTableReplica = {
      val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableReplica]
    }
    
    @scala.inline
    implicit class GlobalTableReplicaMutableBuilder[Self <: GlobalTableReplica] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: Input[String]): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableAttribute extends StObject {
    
    /**
      * The name of the index
      */
    var name: Input[String] = js.native
    
    /**
      * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
      */
    var `type`: Input[String] = js.native
  }
  object TableAttribute {
    
    @scala.inline
    def apply(name: Input[String], `type`: Input[String]): TableAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableAttribute]
    }
    
    @scala.inline
    implicit class TableAttributeMutableBuilder[Self <: TableAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableGlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the hash key in the index; must be
      * defined as an attribute in the resource.
      */
    var hashKey: Input[String] = js.native
    
    /**
      * The name of the index
      */
    var name: Input[String] = js.native
    
    /**
      * Only required with `INCLUDE` as a
      * projection type; a list of attributes to project into the index. These
      * do not need to be defined as attributes on the table.
      */
    var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
      * where `ALL` projects every attribute into the index, `KEYS_ONLY`
      * projects just the hash and range key into the index, and `INCLUDE`
      * projects only the keys specified in the _non_key_attributes_
      * parameter.
      */
    var projectionType: Input[String] = js.native
    
    /**
      * The name of the range key; must be defined
      */
    var rangeKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    var readCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    var writeCapacity: js.UndefOr[Input[Double]] = js.native
  }
  object TableGlobalSecondaryIndex {
    
    @scala.inline
    def apply(hashKey: Input[String], name: Input[String], projectionType: Input[String]): TableGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableGlobalSecondaryIndex]
    }
    
    @scala.inline
    implicit class TableGlobalSecondaryIndexMutableBuilder[Self <: TableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "nonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setProjectionType(value: Input[String]): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      @scala.inline
      def setReadCapacity(value: Input[Double]): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
      
      @scala.inline
      def setWriteCapacity(value: Input[Double]): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
    }
  }
  
  @js.native
  trait TableLocalSecondaryIndex extends StObject {
    
    /**
      * The name of the index
      */
    var name: Input[String] = js.native
    
    /**
      * Only required with `INCLUDE` as a
      * projection type; a list of attributes to project into the index. These
      * do not need to be defined as attributes on the table.
      */
    var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
      * where `ALL` projects every attribute into the index, `KEYS_ONLY`
      * projects just the hash and range key into the index, and `INCLUDE`
      * projects only the keys specified in the _non_key_attributes_
      * parameter.
      */
    var projectionType: Input[String] = js.native
    
    /**
      * The name of the range key; must be defined
      */
    var rangeKey: Input[String] = js.native
  }
  object TableLocalSecondaryIndex {
    
    @scala.inline
    def apply(name: Input[String], projectionType: Input[String], rangeKey: Input[String]): TableLocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableLocalSecondaryIndex]
    }
    
    @scala.inline
    implicit class TableLocalSecondaryIndexMutableBuilder[Self <: TableLocalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "nonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setProjectionType(value: Input[String]): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TablePointInTimeRecovery extends StObject {
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: Input[Boolean] = js.native
  }
  object TablePointInTimeRecovery {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): TablePointInTimeRecovery = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePointInTimeRecovery]
    }
    
    @scala.inline
    implicit class TablePointInTimeRecoveryMutableBuilder[Self <: TablePointInTimeRecovery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableReplica extends StObject {
    
    /**
      * Region name of the replica.
      */
    var regionName: Input[String] = js.native
  }
  object TableReplica {
    
    @scala.inline
    def apply(regionName: Input[String]): TableReplica = {
      val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableReplica]
    }
    
    @scala.inline
    implicit class TableReplicaMutableBuilder[Self <: TableReplica] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: Input[String]): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableServerSideEncryption extends StObject {
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: Input[Boolean] = js.native
    
    /**
      * The ARN of the CMK that should be used for the AWS KMS encryption.
      * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
      */
    var kmsKeyArn: js.UndefOr[Input[String]] = js.native
  }
  object TableServerSideEncryption {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): TableServerSideEncryption = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableServerSideEncryption]
    }
    
    @scala.inline
    implicit class TableServerSideEncryptionMutableBuilder[Self <: TableServerSideEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
  
  @js.native
  trait TableTtl extends StObject {
    
    /**
      * The name of the table attribute to store the TTL timestamp in.
      */
    var attributeName: Input[String] = js.native
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.native
  }
  object TableTtl {
    
    @scala.inline
    def apply(attributeName: Input[String]): TableTtl = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTtl]
    }
    
    @scala.inline
    implicit class TableTtlMutableBuilder[Self <: TableTtl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: Input[String]): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
