package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPatchBaselineMod {
  
  @JSImport("@pulumi/aws/ssm/getPatchBaseline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPatchBaseline(args: GetPatchBaselineArgs): js.Promise[GetPatchBaselineResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPatchBaseline")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPatchBaselineResult]]
  @scala.inline
  def getPatchBaseline(args: GetPatchBaselineArgs, opts: InvokeOptions): js.Promise[GetPatchBaselineResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPatchBaseline")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPatchBaselineResult]]
  
  trait GetPatchBaselineArgs extends StObject {
    
    /**
      * Filters the results against the baselines defaultBaseline field.
      */
    val defaultBaseline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter results by the baseline name prefix.
      */
    val namePrefix: js.UndefOr[String] = js.undefined
    
    /**
      * The specified OS for the baseline.
      */
    val operatingSystem: js.UndefOr[String] = js.undefined
    
    /**
      * The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
      */
    val owner: String
  }
  object GetPatchBaselineArgs {
    
    @scala.inline
    def apply(owner: String): GetPatchBaselineArgs = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPatchBaselineArgs]
    }
    
    @scala.inline
    implicit class GetPatchBaselineArgsMutableBuilder[Self <: GetPatchBaselineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultBaseline(value: Boolean): Self = StObject.set(x, "defaultBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBaselineUndefined: Self = StObject.set(x, "defaultBaseline", js.undefined)
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetPatchBaselineResult extends StObject {
    
    val defaultBaseline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The description of the baseline.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The name of the baseline.
      */
    val name: String
    
    val namePrefix: js.UndefOr[String] = js.undefined
    
    val operatingSystem: js.UndefOr[String] = js.undefined
    
    val owner: String
  }
  object GetPatchBaselineResult {
    
    @scala.inline
    def apply(description: String, id: String, name: String, owner: String): GetPatchBaselineResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPatchBaselineResult]
    }
    
    @scala.inline
    implicit class GetPatchBaselineResultMutableBuilder[Self <: GetPatchBaselineResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultBaseline(value: Boolean): Self = StObject.set(x, "defaultBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBaselineUndefined: Self = StObject.set(x, "defaultBaseline", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    }
  }
}
