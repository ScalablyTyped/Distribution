package typings
package restDashIoLib.restDashIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: expressLib.expressMod.Application) = this()
  def this(app: expressLib.expressMod.Application, config: IRestIOConfig) = this()
}

/* static members */
@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof authorizedResource.AuthorizedResource */ js.Any = js.native
  var AuthorizedSubResource: org.scalablytyped.runtime.Instantiable1[
    /* subResDef */ restDashIoLib.libSrcAuthorizedSubResourceMod.ISubResource, 
    restDashIoLib.libSrcAuthorizedSubResourceMod.default
  ] = js.native
  var ROLES: restDashIoLib.Anon_ADMIN = js.native
  var Resource: restDashIoLib.Anon_BASEURL = js.native
  var SubResource: org.scalablytyped.runtime.Instantiable1[
    /* subResDef */ restDashIoLib.libSrcSubResourceMod.ISubResource, 
    restDashIoLib.libSrcSubResourceMod.default
  ] = js.native
  var UserResource: org.scalablytyped.runtime.Instantiable0[restDashIoLib.libSrcUserResourceMod.default] = js.native
  var authorizedResource: restDashIoLib.Anon_Default = js.native
}

