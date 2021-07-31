package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsailDomainMod {
  
  @JSImport("@pulumi/aws/lightsail/domain", "Domain")
  @js.native
  class Domain protected () extends CustomResource {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Lightsail domain
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the Lightsail domain to manage
      */
    val domainName: Output_[String] = js.native
  }
  /* static members */
  object Domain {
    
    @JSImport("@pulumi/aws/lightsail/domain", "Domain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Domain]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainState): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Domain]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean]
  }
  
  trait DomainArgs extends StObject {
    
    /**
      * The name of the Lightsail domain to manage
      */
    val domainName: Input[String]
  }
  object DomainArgs {
    
    @scala.inline
    def apply(domainName: Input[String]): DomainArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainArgs]
    }
    
    @scala.inline
    implicit class DomainArgsMutableBuilder[Self <: DomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainState extends StObject {
    
    /**
      * The ARN of the Lightsail domain
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Lightsail domain to manage
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainState {
    
    @scala.inline
    def apply(): DomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainState]
    }
    
    @scala.inline
    implicit class DomainStateMutableBuilder[Self <: DomainState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    }
  }
}
