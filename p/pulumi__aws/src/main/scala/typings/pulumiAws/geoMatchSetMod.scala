package typings.pulumiAws

import typings.pulumiAws.outputMod.wafregional.GeoMatchSetGeoMatchConstraint
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoMatchSetMod {
  
  @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet")
  @js.native
  class GeoMatchSet protected () extends CustomResource {
    /**
      * Create a GeoMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GeoMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
      */
    val geoMatchConstraints: Output_[js.UndefOr[js.Array[GeoMatchSetGeoMatchConstraint]]] = js.native
    
    /**
      * The name or description of the Geo Match Set.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object GeoMatchSet {
    
    /**
      * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): GeoMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/geoMatchSet", "GeoMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/geoMatchSet.GeoMatchSet */ Boolean = js.native
  }
  
  @js.native
  trait GeoMatchSetArgs extends StObject {
    
    /**
      * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
      */
    val geoMatchConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]]
        ]
      ] = js.native
    
    /**
      * The name or description of the Geo Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object GeoMatchSetArgs {
    
    @scala.inline
    def apply(): GeoMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoMatchSetArgs]
    }
    
    @scala.inline
    implicit class GeoMatchSetArgsMutableBuilder[Self <: GeoMatchSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeoMatchConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]]
            ]
      ): Self = StObject.set(x, "geoMatchConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoMatchConstraintsUndefined: Self = StObject.set(x, "geoMatchConstraints", js.undefined)
      
      @scala.inline
      def setGeoMatchConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]*): Self = StObject.set(x, "geoMatchConstraints", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GeoMatchSetState extends StObject {
    
    /**
      * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
      */
    val geoMatchConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]]
        ]
      ] = js.native
    
    /**
      * The name or description of the Geo Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object GeoMatchSetState {
    
    @scala.inline
    def apply(): GeoMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoMatchSetState]
    }
    
    @scala.inline
    implicit class GeoMatchSetStateMutableBuilder[Self <: GeoMatchSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeoMatchConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]]
            ]
      ): Self = StObject.set(x, "geoMatchConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoMatchConstraintsUndefined: Self = StObject.set(x, "geoMatchConstraints", js.undefined)
      
      @scala.inline
      def setGeoMatchConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint]*): Self = StObject.set(x, "geoMatchConstraints", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
