package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/tests/customers", JSImport.Namespace)
@js.native
object testsCustomersMod extends js.Object {
  @js.native
  class CustomerTests () extends js.Object {
    var created: js.Any = js.native
    var service: js.Any = js.native
    def TestCount(): js.Promise[Unit] = js.native
    def TestCreate(): js.Promise[Unit] = js.native
    def TestCreateActivationUrl(): js.Promise[Unit] = js.native
    def TestDelete(): js.Promise[Unit] = js.native
    def TestList(): js.Promise[Unit] = js.native
    def TestUpdate(): js.Promise[Unit] = js.native
    /* private */ def create(email: js.Any): js.Any = js.native
    /* private */ def create(email: js.Any, scheduleForDeletion: js.Any): js.Any = js.native
    /* private */ def teardownAsync(): js.Any = js.native
  }
  
}

