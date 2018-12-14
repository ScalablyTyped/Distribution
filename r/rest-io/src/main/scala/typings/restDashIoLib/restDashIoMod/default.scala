package typings
package restDashIoLib.restDashIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: expressLib.expressMod.eNs.Application) = this()
  def this(app: expressLib.expressMod.eNs.Application, config: IRestIOConfig) = this()
}

@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: js.Any = js.native
  var AuthorizedSubResource: org.scalablytyped.runtime.Instantiable1[
    /* subResDef */ restDashIoLib.libSrcAuthorizedSubResourceMod.ISubResource, 
    restDashIoLib.libSrcAuthorizedSubResourceMod.default
  ] = js.native
  var ROLES: restDashIoLib.Anon_SUPERUSER = js.native
  var Resource: org.scalablytyped.runtime.Instantiable1[
    /* resDef */ restDashIoLib.libSrcResourceMod.IResource, 
    restDashIoLib.libSrcResourceMod.Resource
  ] = js.native
  var SubResource: org.scalablytyped.runtime.Instantiable1[
    /* subResDef */ restDashIoLib.libSrcSubResourceMod.ISubResource, 
    restDashIoLib.libSrcSubResourceMod.default
  ] = js.native
  var UserResource: org.scalablytyped.runtime.Instantiable0[restDashIoLib.libSrcUserResourceMod.default] = js.native
  var authorizedResource: js.Any = js.native
}

