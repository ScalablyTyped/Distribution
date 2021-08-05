package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResource
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackReferenceMod {
  
  @JSImport("@pulumi/pulumi/stackReference", "StackReference")
  @js.native
  class StackReference protected () extends CustomResource {
    /**
      * Create a StackReference resource with the given unique name, arguments, and options.
      *
      * If args is not specified, the name of the referenced stack will be the name of the StackReference resource.
      *
      * @param name The _unique_ name of the stack reference.
      * @param args The arguments to use to populate this resource's properties.
      * @Param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackReferenceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StackReferenceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Fetches the value of the named stack output, or undefined if the stack output was not found.
      *
      * @param name The name of the stack output to fetch.
      */
    def getOutput(name: Input[String]): Output_[js.Any] = js.native
    
    /**
      * Fetches the value promptly of the named stack output. May return undefined if the value is
      * not known for some reason.
      *
      * This operation is not supported (and will throw) if the named stack output is a secret.
      *
      * @param name The name of the stack output to fetch.
      */
    def getOutputValue(name: String): js.Promise[js.Any] = js.native
    
    /**
      * The name of the referenced stack.
      */
    val name: Output_[String] = js.native
    
    /**
      * The outputs of the referenced stack.
      */
    val outputs: Output_[StringDictionary[js.Any]] = js.native
    
    /* private */ var readOutputValue: js.Any = js.native
    
    /**
      * Fetches the value of the named stack output, or throws an error if the output was not found.
      *
      * @param name The name of the stack output to fetch.
      */
    def requireOutput(name: Input[String]): Output_[js.Any] = js.native
    
    /**
      * Fetches the value promptly of the named stack output. Throws an error if the stack output is
      * not found.
      *
      * This operation is not supported (and will throw) if the named stack output is a secret.
      *
      * @param name The name of the stack output to fetch.
      */
    def requireOutputValue(name: String): js.Promise[js.Any] = js.native
    
    /**
      * The names of any stack outputs which contain secrets.
      */
    val secretOutputNames: Output_[js.Array[String]] = js.native
  }
  
  trait StackReferenceArgs extends StObject {
    
    /**
      * The name of the stack to reference.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object StackReferenceArgs {
    
    inline def apply(): StackReferenceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackReferenceArgs]
    }
    
    extension [Self <: StackReferenceArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
