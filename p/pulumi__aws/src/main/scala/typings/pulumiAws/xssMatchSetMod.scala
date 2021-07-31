package typings.pulumiAws

import typings.pulumiAws.outputMod.wafregional.XssMatchSetXssMatchTuple
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xssMatchSetMod {
  
  @JSImport("@pulumi/aws/wafregional/xssMatchSet", "XssMatchSet")
  @js.native
  class XssMatchSet protected () extends CustomResource {
    /**
      * Create a XssMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: XssMatchSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: XssMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the set
      */
    val name: Output_[String] = js.native
    
    /**
      * The parts of web requests that you want to inspect for cross-site scripting attacks.
      */
    val xssMatchTuples: Output_[js.UndefOr[js.Array[XssMatchSetXssMatchTuple]]] = js.native
  }
  /* static members */
  object XssMatchSet {
    
    @JSImport("@pulumi/aws/wafregional/xssMatchSet", "XssMatchSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): XssMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[XssMatchSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): XssMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[XssMatchSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: XssMatchSetState): XssMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[XssMatchSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): XssMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[XssMatchSet]
    
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean]
  }
  
  trait XssMatchSetArgs extends StObject {
    
    /**
      * The name of the set
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The parts of web requests that you want to inspect for cross-site scripting attacks.
      */
    val xssMatchTuples: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]]]
      ] = js.undefined
  }
  object XssMatchSetArgs {
    
    @scala.inline
    def apply(): XssMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XssMatchSetArgs]
    }
    
    @scala.inline
    implicit class XssMatchSetArgsMutableBuilder[Self <: XssMatchSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setXssMatchTuples(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]]]): Self = StObject.set(x, "xssMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXssMatchTuplesUndefined: Self = StObject.set(x, "xssMatchTuples", js.undefined)
      
      @scala.inline
      def setXssMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]*): Self = StObject.set(x, "xssMatchTuples", js.Array(value :_*))
    }
  }
  
  trait XssMatchSetState extends StObject {
    
    /**
      * The name of the set
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The parts of web requests that you want to inspect for cross-site scripting attacks.
      */
    val xssMatchTuples: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]]]
      ] = js.undefined
  }
  object XssMatchSetState {
    
    @scala.inline
    def apply(): XssMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XssMatchSetState]
    }
    
    @scala.inline
    implicit class XssMatchSetStateMutableBuilder[Self <: XssMatchSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setXssMatchTuples(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]]]): Self = StObject.set(x, "xssMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXssMatchTuplesUndefined: Self = StObject.set(x, "xssMatchTuples", js.undefined)
      
      @scala.inline
      def setXssMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple]*): Self = StObject.set(x, "xssMatchTuples", js.Array(value :_*))
    }
  }
}
