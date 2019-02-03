package typings
package shopifyDashPrimeLib.distInfrastructureBaseUnderscoreServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure/base_service", "BaseService")
@js.native
class BaseService protected () extends js.Object {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String, resource: java.lang.String) = this()
  var accessToken: js.Any = js.native
  var resource: js.Any = js.native
  var shopDomain: js.Any = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_DELETE[T](method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.DELETE, path: java.lang.String): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_DELETE[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.DELETE,
    path: java.lang.String,
    rootElement: java.lang.String
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_DELETE[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.DELETE,
    path: java.lang.String,
    rootElement: java.lang.String,
    payload: js.Object
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_GET[T](method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.GET, path: java.lang.String): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_GET[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.GET,
    path: java.lang.String,
    rootElement: java.lang.String
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_GET[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.GET,
    path: java.lang.String,
    rootElement: java.lang.String,
    payload: js.Object
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_POST[T](method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.POST, path: java.lang.String): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_POST[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.POST,
    path: java.lang.String,
    rootElement: java.lang.String
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_POST[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.POST,
    path: java.lang.String,
    rootElement: java.lang.String,
    payload: js.Object
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_PUT[T](method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.PUT, path: java.lang.String): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_PUT[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.PUT,
    path: java.lang.String,
    rootElement: java.lang.String
  ): js.Promise[T] = js.native
  @JSName("createRequest")
  /* protected */ def createRequest_PUT[T](
    method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.PUT,
    path: java.lang.String,
    rootElement: java.lang.String,
    payload: js.Object
  ): js.Promise[T] = js.native
  /**
    * Joins URI paths into one single string, replacing bad slashes and ensuring the path doesn't end in /.json.
    */
  /* protected */ def joinUriPaths(paths: java.lang.String*): java.lang.String = js.native
}

/* static members */
@JSImport("shopify-prime/dist/infrastructure/base_service", "BaseService")
@js.native
object BaseService extends js.Object {
  def buildDefaultHeaders(): shopifyDashPrimeLib.Anon_Accept = js.native
}

