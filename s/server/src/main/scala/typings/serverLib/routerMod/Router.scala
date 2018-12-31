package typings
package serverLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  @JSName("del")
  var del_Original: delType = js.native
  @JSName("error")
  var error_Original: errorType = js.native
  @JSName("get")
  var get_Original: getType = js.native
  @JSName("post")
  var post_Original: postType = js.native
  @JSName("put")
  var put_Original: putType = js.native
  @JSName("socket")
  var socket_Original: socketType = js.native
  @JSName("sub")
  var sub_Original: subType = js.native
  def del(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def del(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def error(
    name: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def error(
    name: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def get(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def get(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def post(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def post(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def put(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def put(
    path: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def socket(
    name: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def socket(
    name: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def sub(
    subdomain: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
  def sub(
    subdomain: java.lang.String,
    middlewares: serverLib.typingsCommonMod.Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: serverLib.typingsCommonMod.Middlewares
  ): serverLib.typingsCommonMod.Middleware = js.native
}

