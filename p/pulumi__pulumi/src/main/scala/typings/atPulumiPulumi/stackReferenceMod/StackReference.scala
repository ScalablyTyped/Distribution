package typings.atPulumiPulumi.stackReferenceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResource
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(name: String, args: StackReferenceArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the referenced stack.
    */
  val name: Output[String] = js.native
  /**
    * The outputs of the referenced stack.
    */
  val outputs: Output[StringDictionary[_]] = js.native
  /**
    * Fetches the value of the named stack output, or undefined if the stack output was not found.
    *
    * @param name The name of the stack output to fetch.
    */
  def getOutput(name: Input[String]): Output[_] = js.native
  /**
    * Fetches the value promptly of the named stack output.  May return undefined if the value is
    * not known for some reason.
    *
    * This operation is not supported (and will throw) if any exported values of the StackReference
    * are secrets.
    *
    * @param name The name of the stack output to fetch.
    */
  def getOutputSync(name: String): js.Any = js.native
  /**
    * Fetches the value of the named stack output, or throws an error if the output was not found.
    *
    * @param name The name of the stack output to fetch.
    */
  def requireOutput(name: Input[String]): Output[_] = js.native
  /**
    * Fetches the value promptly of the named stack output.  Throws an error if the stack output is
    * not found.
    *
    * This operation is not supported (and will throw) if any exported values of the StackReference
    * are secrets.
    *
    * @param name The name of the stack output to fetch.
    */
  def requireOutputSync(name: String): js.Any = js.native
}

