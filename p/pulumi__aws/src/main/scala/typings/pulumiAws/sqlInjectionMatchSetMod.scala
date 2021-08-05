package typings.pulumiAws

import typings.pulumiAws.outputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlInjectionMatchSetMod {
  
  @JSImport("@pulumi/aws/wafregional/sqlInjectionMatchSet", "SqlInjectionMatchSet")
  @js.native
  class SqlInjectionMatchSet protected () extends CustomResource {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name or description of the SizeConstraintSet.
      */
    val name: Output_[String] = js.native
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: Output_[js.UndefOr[js.Array[SqlInjectionMatchSetSqlInjectionMatchTuple]]] = js.native
  }
  /* static members */
  object SqlInjectionMatchSet {
    
    @JSImport("@pulumi/aws/wafregional/sqlInjectionMatchSet", "SqlInjectionMatchSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SqlInjectionMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SqlInjectionMatchSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SqlInjectionMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SqlInjectionMatchSet]
    inline def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): SqlInjectionMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SqlInjectionMatchSet]
    inline def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): SqlInjectionMatchSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SqlInjectionMatchSet]
    
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean]
  }
  
  trait SqlInjectionMatchSetArgs extends StObject {
    
    /**
      * The name or description of the SizeConstraintSet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: js.UndefOr[
        Input[
          js.Array[
            Input[
              typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
            ]
          ]
        ]
      ] = js.undefined
  }
  object SqlInjectionMatchSetArgs {
    
    inline def apply(): SqlInjectionMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlInjectionMatchSetArgs]
    }
    
    extension [Self <: SqlInjectionMatchSetArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSqlInjectionMatchTuples(
        value: Input[
              js.Array[
                Input[
                  typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
                ]
              ]
            ]
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", value.asInstanceOf[js.Any])
      
      inline def setSqlInjectionMatchTuplesUndefined: Self = StObject.set(x, "sqlInjectionMatchTuples", js.undefined)
      
      inline def setSqlInjectionMatchTuplesVarargs(
        value: (Input[
              typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
            ])*
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", js.Array(value :_*))
    }
  }
  
  trait SqlInjectionMatchSetState extends StObject {
    
    /**
      * The name or description of the SizeConstraintSet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: js.UndefOr[
        Input[
          js.Array[
            Input[
              typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
            ]
          ]
        ]
      ] = js.undefined
  }
  object SqlInjectionMatchSetState {
    
    inline def apply(): SqlInjectionMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlInjectionMatchSetState]
    }
    
    extension [Self <: SqlInjectionMatchSetState](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSqlInjectionMatchTuples(
        value: Input[
              js.Array[
                Input[
                  typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
                ]
              ]
            ]
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", value.asInstanceOf[js.Any])
      
      inline def setSqlInjectionMatchTuplesUndefined: Self = StObject.set(x, "sqlInjectionMatchTuples", js.undefined)
      
      inline def setSqlInjectionMatchTuplesVarargs(
        value: (Input[
              typings.pulumiAws.inputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
            ])*
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", js.Array(value :_*))
    }
  }
}
