package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.auditSinkListMod.AuditSinkListArgs
import typings.pulumiKubernetes.auditSinkMod.AuditSinkArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistration {
  
  object v1alpha1 {
    
    @JSImport("@pulumi/kubernetes", "auditregistration.v1alpha1.AuditSink")
    @js.native
    class AuditSink protected ()
      extends typings.pulumiKubernetes.auditregistrationMod.v1alpha1.AuditSink {
      /**
        * Create a AuditSink resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: AuditSinkArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: AuditSinkArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object AuditSink {
      
      @JSImport("@pulumi/kubernetes", "auditregistration.v1alpha1.AuditSink")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing AuditSink resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.auditSinkMod.AuditSink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.auditSinkMod.AuditSink]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.auditSinkMod.AuditSink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.auditSinkMod.AuditSink]
      
      /**
        * Returns true if the given object is an instance of AuditSink.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "auditregistration.v1alpha1.AuditSinkList")
    @js.native
    class AuditSinkList protected ()
      extends typings.pulumiKubernetes.auditregistrationMod.v1alpha1.AuditSinkList {
      /**
        * Create a AuditSinkList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: AuditSinkListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: AuditSinkListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object AuditSinkList {
      
      @JSImport("@pulumi/kubernetes", "auditregistration.v1alpha1.AuditSinkList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing AuditSinkList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.auditSinkListMod.AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.auditSinkListMod.AuditSinkList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.auditSinkListMod.AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.auditSinkListMod.AuditSinkList]
      
      /**
        * Returns true if the given object is an instance of AuditSinkList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean]
    }
  }
}
