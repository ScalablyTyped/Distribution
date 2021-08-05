package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamodb {
  
  trait GetTableServerSideEncryption extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var kmsKeyArn: js.UndefOr[String] = js.undefined
  }
  object GetTableServerSideEncryption {
    
    inline def apply(): GetTableServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTableServerSideEncryption]
    }
    
    extension [Self <: GetTableServerSideEncryption](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
  
  trait GlobalTableReplica extends StObject {
    
    /**
      * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
      */
    var regionName: Input[String]
  }
  object GlobalTableReplica {
    
    inline def apply(regionName: Input[String]): GlobalTableReplica = {
      val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableReplica]
    }
    
    extension [Self <: GlobalTableReplica](x: Self) {
      
      inline def setRegionName(value: Input[String]): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableAttribute extends StObject {
    
    /**
      * The name of the index
      */
    var name: Input[String]
    
    /**
      * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
      */
    var `type`: Input[String]
  }
  object TableAttribute {
    
    inline def apply(name: Input[String], `type`: Input[String]): TableAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableAttribute]
    }
    
    extension [Self <: TableAttribute](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableGlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the hash key in the index; must be
      * defined as an attribute in the resource.
      */
    var hashKey: Input[String]
    
    /**
      * The name of the index
      */
    var name: Input[String]
    
    /**
      * Only required with `INCLUDE` as a
      * projection type; a list of attributes to project into the index. These
      * do not need to be defined as attributes on the table.
      */
    var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
      * where `ALL` projects every attribute into the index, `KEYS_ONLY`
      * projects just the hash and range key into the index, and `INCLUDE`
      * projects only the keys specified in the _non_key_attributes_
      * parameter.
      */
    var projectionType: Input[String]
    
    /**
      * The name of the range key; must be defined
      */
    var rangeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    var readCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    var writeCapacity: js.UndefOr[Input[Double]] = js.undefined
  }
  object TableGlobalSecondaryIndex {
    
    inline def apply(hashKey: Input[String], name: Input[String], projectionType: Input[String]): TableGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableGlobalSecondaryIndex]
    }
    
    extension [Self <: TableGlobalSecondaryIndex](x: Self) {
      
      inline def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "nonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
      
      inline def setProjectionType(value: Input[String]): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setReadCapacity(value: Input[Double]): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
      
      inline def setWriteCapacity(value: Input[Double]): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
    }
  }
  
  trait TableLocalSecondaryIndex extends StObject {
    
    /**
      * The name of the index
      */
    var name: Input[String]
    
    /**
      * Only required with `INCLUDE` as a
      * projection type; a list of attributes to project into the index. These
      * do not need to be defined as attributes on the table.
      */
    var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
      * where `ALL` projects every attribute into the index, `KEYS_ONLY`
      * projects just the hash and range key into the index, and `INCLUDE`
      * projects only the keys specified in the _non_key_attributes_
      * parameter.
      */
    var projectionType: Input[String]
    
    /**
      * The name of the range key; must be defined
      */
    var rangeKey: Input[String]
  }
  object TableLocalSecondaryIndex {
    
    inline def apply(name: Input[String], projectionType: Input[String], rangeKey: Input[String]): TableLocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableLocalSecondaryIndex]
    }
    
    extension [Self <: TableLocalSecondaryIndex](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "nonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
      
      inline def setProjectionType(value: Input[String]): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TablePointInTimeRecovery extends StObject {
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: Input[Boolean]
  }
  object TablePointInTimeRecovery {
    
    inline def apply(enabled: Input[Boolean]): TablePointInTimeRecovery = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePointInTimeRecovery]
    }
    
    extension [Self <: TablePointInTimeRecovery](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableReplica extends StObject {
    
    /**
      * Region name of the replica.
      */
    var regionName: Input[String]
  }
  object TableReplica {
    
    inline def apply(regionName: Input[String]): TableReplica = {
      val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableReplica]
    }
    
    extension [Self <: TableReplica](x: Self) {
      
      inline def setRegionName(value: Input[String]): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableServerSideEncryption extends StObject {
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: Input[Boolean]
    
    /**
      * The ARN of the CMK that should be used for the AWS KMS encryption.
      * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
      */
    var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  }
  object TableServerSideEncryption {
    
    inline def apply(enabled: Input[Boolean]): TableServerSideEncryption = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableServerSideEncryption]
    }
    
    extension [Self <: TableServerSideEncryption](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
  
  trait TableTtl extends StObject {
    
    /**
      * The name of the table attribute to store the TTL timestamp in.
      */
    var attributeName: Input[String]
    
    /**
      * Indicates whether ttl is enabled (true) or disabled (false).
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object TableTtl {
    
    inline def apply(attributeName: Input[String]): TableTtl = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTtl]
    }
    
    extension [Self <: TableTtl](x: Self) {
      
      inline def setAttributeName(value: Input[String]): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
