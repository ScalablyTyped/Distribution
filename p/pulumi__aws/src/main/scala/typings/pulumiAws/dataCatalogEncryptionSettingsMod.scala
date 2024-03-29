package typings.pulumiAws

import typings.pulumiAws.outputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCatalogEncryptionSettingsMod {
  
  @JSImport("@pulumi/aws/glue/dataCatalogEncryptionSettings", "DataCatalogEncryptionSettings")
  @js.native
  class DataCatalogEncryptionSettings protected () extends CustomResource {
    /**
      * Create a DataCatalogEncryptionSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataCatalogEncryptionSettingsArgs) = this()
    def this(name: String, args: DataCatalogEncryptionSettingsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
      */
    val catalogId: Output_[String] = js.native
    
    /**
      * The security configuration to set. see Data Catalog Encryption Settings.
      */
    val dataCatalogEncryptionSettings: Output_[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings] = js.native
  }
  /* static members */
  object DataCatalogEncryptionSettings {
    
    @JSImport("@pulumi/aws/glue/dataCatalogEncryptionSettings", "DataCatalogEncryptionSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DataCatalogEncryptionSettings resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DataCatalogEncryptionSettings]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DataCatalogEncryptionSettings]
    inline def get(name: String, id: Input[ID], state: DataCatalogEncryptionSettingsState): DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DataCatalogEncryptionSettings]
    inline def get(
      name: String,
      id: Input[ID],
      state: DataCatalogEncryptionSettingsState,
      opts: CustomResourceOptions
    ): DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DataCatalogEncryptionSettings]
    
    /**
      * Returns true if the given object is an instance of DataCatalogEncryptionSettings.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean]
  }
  
  trait DataCatalogEncryptionSettingsArgs extends StObject {
    
    /**
      * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The security configuration to set. see Data Catalog Encryption Settings.
      */
    val dataCatalogEncryptionSettings: Input[
        typings.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
      ]
  }
  object DataCatalogEncryptionSettingsArgs {
    
    inline def apply(
      dataCatalogEncryptionSettings: Input[
          typings.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
        ]
    ): DataCatalogEncryptionSettingsArgs = {
      val __obj = js.Dynamic.literal(dataCatalogEncryptionSettings = dataCatalogEncryptionSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCatalogEncryptionSettingsArgs]
    }
    
    extension [Self <: DataCatalogEncryptionSettingsArgs](x: Self) {
      
      inline def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      inline def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      inline def setDataCatalogEncryptionSettings(
        value: Input[
              typings.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
            ]
      ): Self = StObject.set(x, "dataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataCatalogEncryptionSettingsState extends StObject {
    
    /**
      * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The security configuration to set. see Data Catalog Encryption Settings.
      */
    val dataCatalogEncryptionSettings: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
        ]
      ] = js.undefined
  }
  object DataCatalogEncryptionSettingsState {
    
    inline def apply(): DataCatalogEncryptionSettingsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataCatalogEncryptionSettingsState]
    }
    
    extension [Self <: DataCatalogEncryptionSettingsState](x: Self) {
      
      inline def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      inline def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      inline def setDataCatalogEncryptionSettings(
        value: Input[
              typings.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
            ]
      ): Self = StObject.set(x, "dataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
      
      inline def setDataCatalogEncryptionSettingsUndefined: Self = StObject.set(x, "dataCatalogEncryptionSettings", js.undefined)
    }
  }
}
