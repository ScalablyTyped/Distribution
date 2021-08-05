package typings.pulumiAws

import typings.pulumiAws.outputMod.waf.ByteMatchSetByteMatchTuple
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafByteMatchSetMod {
  
  @JSImport("@pulumi/aws/waf/byteMatchSet", "ByteMatchSet")
  @js.native
  class ByteMatchSet protected () extends CustomResource {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ByteMatchSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies the bytes (typically a string that corresponds
      * with ASCII characters) that you want to search for in web requests,
      * the location in requests that you want to search, and other settings.
      */
    val byteMatchTuples: Output_[js.UndefOr[js.Array[ByteMatchSetByteMatchTuple]]] = js.native
    
    /**
      * The name or description of the Byte Match Set.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ByteMatchSet {
    
    @JSImport("@pulumi/aws/waf/byteMatchSet", "ByteMatchSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ByteMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ByteMatchSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ByteMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ByteMatchSet]
    inline def get(name: String, id: Input[ID], state: ByteMatchSetState): ByteMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ByteMatchSet]
    inline def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): ByteMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ByteMatchSet]
    
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ Boolean]
  }
  
  trait ByteMatchSetArgs extends StObject {
    
    /**
      * Specifies the bytes (typically a string that corresponds
      * with ASCII characters) that you want to search for in web requests,
      * the location in requests that you want to search, and other settings.
      */
    val byteMatchTuples: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]]]
      ] = js.undefined
    
    /**
      * The name or description of the Byte Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ByteMatchSetArgs {
    
    inline def apply(): ByteMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteMatchSetArgs]
    }
    
    extension [Self <: ByteMatchSetArgs](x: Self) {
      
      inline def setByteMatchTuples(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]]]): Self = StObject.set(x, "byteMatchTuples", value.asInstanceOf[js.Any])
      
      inline def setByteMatchTuplesUndefined: Self = StObject.set(x, "byteMatchTuples", js.undefined)
      
      inline def setByteMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]*): Self = StObject.set(x, "byteMatchTuples", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ByteMatchSetState extends StObject {
    
    /**
      * Specifies the bytes (typically a string that corresponds
      * with ASCII characters) that you want to search for in web requests,
      * the location in requests that you want to search, and other settings.
      */
    val byteMatchTuples: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]]]
      ] = js.undefined
    
    /**
      * The name or description of the Byte Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ByteMatchSetState {
    
    inline def apply(): ByteMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteMatchSetState]
    }
    
    extension [Self <: ByteMatchSetState](x: Self) {
      
      inline def setByteMatchTuples(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]]]): Self = StObject.set(x, "byteMatchTuples", value.asInstanceOf[js.Any])
      
      inline def setByteMatchTuplesUndefined: Self = StObject.set(x, "byteMatchTuples", js.undefined)
      
      inline def setByteMatchTuplesVarargs(value: Input[typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple]*): Self = StObject.set(x, "byteMatchTuples", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
