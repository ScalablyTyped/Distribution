package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.directoryservice.GetDirectoryConnectSetting
import typings.pulumiAws.outputMod.directoryservice.GetDirectoryVpcSetting
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDirectoryMod {
  
  @JSImport("@pulumi/aws/directoryservice/getDirectory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDirectoryResult]]
  inline def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectoryResult]]
  
  trait GetDirectoryArgs extends StObject {
    
    /**
      * The ID of the directory.
      */
    val directoryId: String
    
    /**
      * A map of tags assigned to the directory/connector.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetDirectoryArgs {
    
    inline def apply(directoryId: String): GetDirectoryArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryArgs]
    }
    
    extension [Self <: GetDirectoryArgs](x: Self) {
      
      inline def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetDirectoryResult extends StObject {
    
    /**
      * The access URL for the directory/connector, such as http://alias.awsapps.com.
      */
    val accessUrl: String
    
    /**
      * The alias for the directory/connector, such as `d-991708b282.awsapps.com`.
      */
    val alias: String
    
    val connectSettings: js.Array[GetDirectoryConnectSetting]
    
    /**
      * A textual description for the directory/connector.
      */
    val description: String
    
    val directoryId: String
    
    /**
      * A list of IP addresses of the DNS servers for the directory/connector.
      */
    val dnsIpAddresses: js.Array[String]
    
    /**
      * (for `MicrosoftAD`) The Microsoft AD edition (`Standard` or `Enterprise`).
      */
    val edition: String
    
    /**
      * The directory/connector single-sign on status.
      */
    val enableSso: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The fully qualified name for the directory/connector.
      */
    val name: String
    
    /**
      * The ID of the security group created by the directory/connector.
      */
    val securityGroupId: String
    
    /**
      * The short name of the directory/connector, such as `CORP`.
      */
    val shortName: String
    
    /**
      * (for `SimpleAD` and `ADConnector`) The size of the directory/connector (`Small` or `Large`).
      */
    val size: String
    
    /**
      * A map of tags assigned to the directory/connector.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD`).
      */
    val `type`: String
    
    val vpcSettings: js.Array[GetDirectoryVpcSetting]
  }
  object GetDirectoryResult {
    
    inline def apply(
      accessUrl: String,
      alias: String,
      connectSettings: js.Array[GetDirectoryConnectSetting],
      description: String,
      directoryId: String,
      dnsIpAddresses: js.Array[String],
      edition: String,
      enableSso: Boolean,
      id: String,
      name: String,
      securityGroupId: String,
      shortName: String,
      size: String,
      `type`: String,
      vpcSettings: js.Array[GetDirectoryVpcSetting]
    ): GetDirectoryResult = {
      val __obj = js.Dynamic.literal(accessUrl = accessUrl.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], connectSettings = connectSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], edition = edition.asInstanceOf[js.Any], enableSso = enableSso.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vpcSettings = vpcSettings.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryResult]
    }
    
    extension [Self <: GetDirectoryResult](x: Self) {
      
      inline def setAccessUrl(value: String): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setConnectSettings(value: js.Array[GetDirectoryConnectSetting]): Self = StObject.set(x, "connectSettings", value.asInstanceOf[js.Any])
      
      inline def setConnectSettingsVarargs(value: GetDirectoryConnectSetting*): Self = StObject.set(x, "connectSettings", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setDnsIpAddresses(value: js.Array[String]): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
      
      inline def setDnsIpAddressesVarargs(value: String*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value :_*))
      
      inline def setEdition(value: String): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
      
      inline def setEnableSso(value: Boolean): Self = StObject.set(x, "enableSso", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupId(value: String): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVpcSettings(value: js.Array[GetDirectoryVpcSetting]): Self = StObject.set(x, "vpcSettings", value.asInstanceOf[js.Any])
      
      inline def setVpcSettingsVarargs(value: GetDirectoryVpcSetting*): Self = StObject.set(x, "vpcSettings", js.Array(value :_*))
    }
  }
}
