package typings.restDashIo.restDashIoMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.express.expressMod.Application
import typings.restDashIo.Anon_ADMIN
import typings.restDashIo.TypeofClassResource
import typings.restDashIo.TypeofauthorizedResource
import typings.restDashIo.libSrcAuthorizedSubResourceMod.ISubResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: Application) = this()
  def this(app: Application, config: IRestIOConfig) = this()
}

/* static members */
@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof authorizedResource.AuthorizedResource */ js.Any = js.native
  var AuthorizedSubResource: Instantiable1[
    /* subResDef */ ISubResource, 
    typings.restDashIo.libSrcAuthorizedSubResourceMod.default
  ] = js.native
  var ROLES: Anon_ADMIN = js.native
  var Resource: TypeofClassResource = js.native
  var SubResource: Instantiable1[
    /* subResDef */ typings.restDashIo.libSrcSubResourceMod.ISubResource, 
    typings.restDashIo.libSrcSubResourceMod.default
  ] = js.native
  var UserResource: Instantiable0[typings.restDashIo.libSrcUserResourceMod.default] = js.native
  var authorizedResource: TypeofauthorizedResource = js.native
}

