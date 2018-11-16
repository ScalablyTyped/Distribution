package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replyMod {
  type cookieType = js.Function3[
    /* name */ java.lang.String, 
    /* value */ java.lang.String, 
    /* opts */ js.UndefOr[expressLib.expressMod.eNs.CookieOptions], 
    Reply
  ]
  type downloadType = js.Function2[/* path */ java.lang.String, /* filename */ js.UndefOr[java.lang.String], js.Any]
  type headerType = js.Function2[/* field */ java.lang.String, /* value */ js.UndefOr[java.lang.String], Reply]
  type jsonType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type jsonpType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type renderType = js.Function2[/* view */ java.lang.String, /* locals */ js.UndefOr[js.Object], js.Any]
  type sendType = js.Function1[/* body */ js.UndefOr[js.Any], js.Any]
  type statusType = js.Function1[/* code */ scala.Double, Reply]
  type typeType = js.Function1[/* type */ java.lang.String, Reply]
}
