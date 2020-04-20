package typings.pulumiPulumi

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/mocks", JSImport.Namespace)
@js.native
object mocksMod extends js.Object {
  @js.native
  class MockMonitor protected () extends js.Object {
    def this(mocks: Mocks) = this()
    var mocks: Mocks = js.native
    var newUrn: js.Any = js.native
    def invoke(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    def readResource(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innterResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    def registerResource(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    def registerResourceOutputs(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): Unit = js.native
    def supportsFeature(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait Mocks extends js.Object {
    /**
      * call mocks provider-implemented function calls (e.g. aws.get_availability_zones).
      *
      * @param token: The token that indicates which function is being called. This token is of the form "package:module:function".
      * @param args: The arguments provided to the function call.
      * @param provider: If provided, the identifier of the provider instance being used to make the call.
      */
    def call(token: String, args: js.Any): Record[String, _] = js.native
    def call(token: String, args: js.Any, provider: String): Record[String, _] = js.native
    /**
      * new_resource mocks resource construction calls. This function should return the physical identifier and the output properties
      * for the resource being constructed.
      *
      * @param type_: The token that indicates which resource type is being constructed. This token is of the form "package:module:type".
      * @param name: The logical name of the resource instance.
      * @param inputs: The inputs for the resource.
      * @param provider: If provided, the identifier of the provider instnace being used to manage this resource.
      * @param id_: If provided, the physical identifier of an existing resource to read or import.
      */
    def newResource(`type`: String, name: String, inputs: js.Any): AnonId = js.native
    def newResource(`type`: String, name: String, inputs: js.Any, provider: String): AnonId = js.native
    def newResource(`type`: String, name: String, inputs: js.Any, provider: String, id: String): AnonId = js.native
  }
  
  def setMocks(mocks: Mocks): Unit = js.native
  def setMocks(mocks: Mocks, project: String): Unit = js.native
  def setMocks(mocks: Mocks, project: String, stack: String): Unit = js.native
  def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = js.native
}

