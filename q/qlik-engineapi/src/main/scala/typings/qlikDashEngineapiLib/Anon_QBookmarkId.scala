package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QBookmarkId extends js.Object {
  var qBookmarkId: js.UndefOr[java.lang.String] = js.undefined
  var qExpires: js.UndefOr[scala.Double] = js.undefined
}

object Anon_QBookmarkId {
  @scala.inline
  def apply(qBookmarkId: java.lang.String = null, qExpires: scala.Int | scala.Double = null): Anon_QBookmarkId = {
    val __obj = js.Dynamic.literal()
    if (qBookmarkId != null) __obj.updateDynamic("qBookmarkId")(qBookmarkId)
    if (qExpires != null) __obj.updateDynamic("qExpires")(qExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_QBookmarkId]
  }
}

