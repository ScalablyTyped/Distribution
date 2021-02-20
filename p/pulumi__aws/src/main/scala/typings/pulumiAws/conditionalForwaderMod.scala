package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalForwaderMod {
  
  @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader")
  @js.native
  class ConditionalForwader protected () extends CustomResource {
    /**
      * Create a ConditionalForwader resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConditionalForwaderArgs) = this()
    def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The id of directory.
      */
    val directoryId: Output_[String] = js.native
    
    /**
      * A list of forwarder IP addresses.
      */
    val dnsIps: Output_[js.Array[String]] = js.native
    
    /**
      * The fully qualified domain name of the remote domain for which forwarders will be used.
      */
    val remoteDomainName: Output_[String] = js.native
  }
  /* static members */
  object ConditionalForwader {
    
    /**
      * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID]): ConditionalForwader = js.native
    @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConditionalForwader = js.native
    @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState): ConditionalForwader = js.native
    @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): ConditionalForwader = js.native
    
    /**
      * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
  }
  
  @js.native
  trait ConditionalForwaderArgs extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: Input[String] = js.native
    
    /**
      * A list of forwarder IP addresses.
      */
    val dnsIps: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The fully qualified domain name of the remote domain for which forwarders will be used.
      */
    val remoteDomainName: Input[String] = js.native
  }
  object ConditionalForwaderArgs {
    
    @scala.inline
    def apply(
      directoryId: Input[String],
      dnsIps: Input[js.Array[Input[String]]],
      remoteDomainName: Input[String]
    ): ConditionalForwaderArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], dnsIps = dnsIps.asInstanceOf[js.Any], remoteDomainName = remoteDomainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionalForwaderArgs]
    }
    
    @scala.inline
    implicit class ConditionalForwaderArgsMutableBuilder[Self <: ConditionalForwaderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpsVarargs(value: Input[String]*): Self = StObject.set(x, "dnsIps", js.Array(value :_*))
      
      @scala.inline
      def setRemoteDomainName(value: Input[String]): Self = StObject.set(x, "remoteDomainName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionalForwaderState extends StObject {
    
    /**
      * The id of directory.
      */
    val directoryId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of forwarder IP addresses.
      */
    val dnsIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The fully qualified domain name of the remote domain for which forwarders will be used.
      */
    val remoteDomainName: js.UndefOr[Input[String]] = js.native
  }
  object ConditionalForwaderState {
    
    @scala.inline
    def apply(): ConditionalForwaderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalForwaderState]
    }
    
    @scala.inline
    implicit class ConditionalForwaderStateMutableBuilder[Self <: ConditionalForwaderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      @scala.inline
      def setDnsIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpsUndefined: Self = StObject.set(x, "dnsIps", js.undefined)
      
      @scala.inline
      def setDnsIpsVarargs(value: Input[String]*): Self = StObject.set(x, "dnsIps", js.Array(value :_*))
      
      @scala.inline
      def setRemoteDomainName(value: Input[String]): Self = StObject.set(x, "remoteDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteDomainNameUndefined: Self = StObject.set(x, "remoteDomainName", js.undefined)
    }
  }
}
