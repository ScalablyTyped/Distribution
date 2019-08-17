package typings.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replyMod {
  import typings.express.expressMod.CookieOptions

  type cookieType = js.Function3[/* name */ String, /* value */ String, /* opts */ js.UndefOr[CookieOptions], Reply]
  type downloadType = js.Function2[/* path */ String, /* filename */ js.UndefOr[String], js.Any]
  type headerType = js.Function2[/* field */ String, /* value */ js.UndefOr[String], Reply]
  type jsonType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type jsonpType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type renderType = js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]
  type sendType = js.Function1[/* body */ js.UndefOr[js.Any], js.Any]
  type statusType = js.Function1[/* code */ Double, Reply]
  type typeType = js.Function1[/* type */ String, Reply]
}
