package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "Output")
@js.native
class Output[T] () extends js.Object {
  /**
       * Transforms the data of the output with the provided func.  The result remains a
       * Output so that dependent resources can be properly tracked.
       *
       * 'func' is not allowed to make resources.
       *
       * 'func' can return other Outputs.  This can be handy if you have a Output<SomeVal>
       * and you want to get a transitive dependency of it.  i.e.
       *
       * ```ts
       * var d1: Output<SomeVal>;
       * var d2 = d1.apply(v => v.x.y.OtherOutput); // getting an output off of 'v'.
       * ```
       *
       * In this example, taking a dependency on d2 means a resource will depend on all the resources
       * of d1.  It will *not* depend on the resources of v.x.y.OtherDep.
       *
       * Importantly, the Resources that d2 feels like it will depend on are the same resources as d1.
       * If you need have multiple Outputs and a single Output is needed that combines both
       * set of resources, then 'pulumi.all' should be used instead.
       *
       * This function will only be called execution of a 'pulumi update' request.  It will not run
       * during 'pulumi preview' (as the values of resources are of course not known then). It is not
       * available for functions that end up executing in the cloud during runtime.  To get the value
       * of the Output during cloud runtime execution, use `get()`.
       */
  @JSName("apply")
  def apply[U](func: js.Function1[/* t */ T, Input[U]]): Output[U] = js.native
  /**
       * Retrieves the underlying value of this dependency.
       *
       * This function is only callable in code that runs in the cloud post-deployment.  At this
       * point all Output values will be known and can be safely retrieved. During pulumi deployment
       * or preview execution this must not be called (and will throw).  This is because doing so
       * would allow Output values to flow into Resources while losing the data that would allow
       * the dependency graph to be changed.
       */
  def get(): T = js.native
}

@JSImport("@pulumi/pulumi/resource", "Output")
@js.native
object Output extends js.Object {
  def create[T](): atPulumiPulumiLib.resourceMod.Output[atPulumiPulumiLib.resourceMod.Unwrap[js.UndefOr[T]]] = js.native
  /**
       * create takes any Input value and converts it into an Output, deeply unwrapping nested Input
       * values as necessary.
       */
  def create[T](`val`: atPulumiPulumiLib.resourceMod.Input[T]): atPulumiPulumiLib.resourceMod.Output[atPulumiPulumiLib.resourceMod.Unwrap[T]] = js.native
  /**
       * Returns true if the given object is an instance of Output<T>.  This is designed to work even when
       * multiple copies of the Pulumi SDK have been loaded into the same process.
       */
  def isInstance[T](obj: js.Any): /* is Output */scala.Boolean = js.native
}

