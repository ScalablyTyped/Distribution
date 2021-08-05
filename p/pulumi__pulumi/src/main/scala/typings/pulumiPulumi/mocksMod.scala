package typings.pulumiPulumi

import typings.pulumiPulumi.anon.Id
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocksMod {
  
  @JSImport("@pulumi/pulumi/runtime/mocks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/mocks", "MockMonitor")
  @js.native
  class MockMonitor protected () extends StObject {
    def this(mocks: Mocks) = this()
    
    def invoke(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    var mocks: Mocks = js.native
    
    /* private */ var newUrn: js.Any = js.native
    
    def readResource(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innterResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    def registerResource(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    def registerResourceOutputs(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): Unit = js.native
    
    def supportsFeature(req: js.Any, callback: js.Function2[/* err */ js.Any, /* innerResponse */ js.Any, Unit]): Unit = js.native
  }
  
  inline def setMocks(mocks: Mocks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Mocks extends StObject {
    
    /**
      * call mocks provider-implemented function calls (e.g. aws.get_availability_zones).
      *
      * @param token: The token that indicates which function is being called. This token is of the form "package:module:function".
      * @param args: The arguments provided to the function call.
      * @param provider: If provided, the identifier of the provider instance being used to make the call.
      */
    def call(token: String, args: js.Any): Record[String, js.Any] = js.native
    def call(token: String, args: js.Any, provider: String): Record[String, js.Any] = js.native
    
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
    def newResource(`type`: String, name: String, inputs: js.Any): Id = js.native
    def newResource(`type`: String, name: String, inputs: js.Any, provider: String): Id = js.native
    def newResource(`type`: String, name: String, inputs: js.Any, provider: String, id: String): Id = js.native
    def newResource(`type`: String, name: String, inputs: js.Any, provider: Unit, id: String): Id = js.native
  }
}
