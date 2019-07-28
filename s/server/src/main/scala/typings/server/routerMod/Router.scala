package typings.server.routerMod

import typings.server.typingsCommonMod.Middleware
import typings.server.typingsCommonMod.Middlewares
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
    path: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def del(
    path: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def error(
    name: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def error(
    name: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def get(
    path: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def get(
    path: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def post(
    path: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def post(
    path: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def put(
    path: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def put(
    path: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def socket(
    name: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def socket(
    name: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def sub(
    subdomain: String,
    middlewares: Middleware,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
  def sub(
    subdomain: String,
    middlewares: Middlewares,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
  ): Middleware = js.native
}

